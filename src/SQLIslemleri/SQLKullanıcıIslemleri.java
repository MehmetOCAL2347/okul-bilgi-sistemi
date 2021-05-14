package SQLIslemleri;

import Kullanıcılar.Kullanıcı;
import MailConfig.MailIslemleri;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.mail.MessagingException;

public class SQLKullanıcıIslemleri extends SQLBaglantı{
    
    // Değişikenler
    
    private final String KULLANICI_ADI_SIFRESI = "SELECT * FROM kullanıcı WHERE kullanıcıAdı=? AND kullanıcıSifre=?";
    
    
    // Classlar
    
    private MailIslemleri mail;
    
          
    // Constructor

    public SQLKullanıcıIslemleri(MailIslemleri mail, String DBIsmi) {
        super(DBIsmi);
        this.mail = mail;
    }

    
        
    
    public Kullanıcı kullanıcıBul(String kullanıcıAdı){    
        
        // Bu bilgiler DB'den gelicek
        Kullanıcı kullanıcı;
        
        // DB'den kullanıcıAdı kullanıcımızı bulucaz.
        kullanıcı = new Kullanıcı(0, 26, "Mehmet", "ÖCAL", "mehmet", "123456789", "Admin", "udemyokulbilgisistemi@gmail.com");
        
        return kullanıcı;
        
        
    }    
    
    
    public Kullanıcı kullanıcıBul(String girilenKullanıcıAdı, String girilenKullanıcıSifre) throws SQLException{
    
        Kullanıcı kullanıcı = null;
       
        komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_ADI_SIFRESI);
        komuttamamlayıcı.setString(1, girilenKullanıcıAdı);
        komuttamamlayıcı.setString(2, girilenKullanıcıSifre);
        
        ResultSet sonuc = komuttamamlayıcı.executeQuery();
        
         while(sonuc.next()){
        
            kullanıcı = new Kullanıcı(
            
                    sonuc.getInt("id"),
                    sonuc.getInt("yas"),
                    sonuc.getString("isim"),
                    sonuc.getString("soyIsim"),
                    sonuc.getString("kullanıcıAdı"),
                    sonuc.getString("kullanıcıSifre"),
                    sonuc.getString("role"),
                    sonuc.getString("EMail")
                    
            );
        }
        
        // DB'den kullanıcıAdı ve Kullnaıcı sifresiyle kullanıcımızı bulucaz.
        //kullanıcı = new Kullanıcı(0, 26, "Mehmet", "ÖCAL", "mehmet", "123456", "Admin", "udemyokulbilgisistemi@gmail.com");
        
        
        return kullanıcı;
    }
    
            
    public boolean sifremiUnuttum(Kullanıcı kullanıcı) throws MessagingException{                
        
        if(!kullanıcı.getEMail().equals("")){            
            
            System.out.println("Mail Gönderme İşlemlerine Devam edilecek");            
            mail.mailGonder(kullanıcı.getEMail());
            return true;
                       
        }else{
        
            System.out.println("Kullanıcı Maili bulunamadı. >> Uyarı göndericez");
            return false;            
        }
    
    }    

}
