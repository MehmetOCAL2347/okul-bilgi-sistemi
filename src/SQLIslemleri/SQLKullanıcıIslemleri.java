package SQLIslemleri;

import Kullanıcılar.Admin;
import Kullanıcılar.Kullanıcı;
import Kullanıcılar.Ogrenci;
import Kullanıcılar.Ogretmen;
import Kullanıcılar.OkulMuduru;
import MailConfig.MailIslemleri;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

public class SQLKullanıcıIslemleri extends SQLBaglantı{
    
    // SQL - kullanıcı tablosu
    
    private final String KULLANICI_ADI_SIFRESI = "SELECT * FROM kullanıcı WHERE kullanıcıAdı=? AND kullanıcıSifre=?";
    private final String KULLANICI_ADI = "SELECT * FROM kullanıcı WHERE kullanıcıAdı=?";
    private final String KULLANICI_YENI = "INSERT INTO kullanıcı VALUES(NULL,?,?,?,?,?,?,?)";
    
    // SQL - admin tablosu
    
    private final String ADMIN_ID = "SELECT * FROM admin WHERE id=?";
    
    // SQL - ogrenci tablosu
    
    private final String OGRENCI_ID = "SELECT * FROM ogrenci WHERE id=?";
    
    // SQL - ogretmen tablosu
    
    private final String OGRETMEN_ID = "SELECT * FROM ogretmen WHERE id=?";
    
    // SQL - okulmuduru tablosu
    
    private final String OKULMUDURU_ID = "SELECT * FROM ogretmen INNER JOIN okulmuduru WHERE ogretmen.id=?";
    
    // Classlar
    
    private MailIslemleri mail;
    
          
    // Constructor

    public SQLKullanıcıIslemleri(MailIslemleri mail, String DBIsmi) {
        super(DBIsmi);
        this.mail = mail;
    }

    public SQLKullanıcıIslemleri(String DBIsmi) {
        super(DBIsmi);
    }
    
    public boolean kullanıcıOlustur(Kullanıcı kullanıcı){
    
        boolean kullanıcıOlusturulduMu = false;
        Integer yeniKullanıcıId;
        
        try {
            
            baglantı.setAutoCommit(false);
            komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_YENI);
            komuttamamlayıcı.setInt(1, kullanıcı.getYas());
            komuttamamlayıcı.setString(2, kullanıcı.getIsim());
            komuttamamlayıcı.setString(3, kullanıcı.getSoyIsım());
            komuttamamlayıcı.setString(4, kullanıcı.getKullanıcıAdı());
            komuttamamlayıcı.setString(5, kullanıcı.getKullanıcıSifre());
            komuttamamlayıcı.setString(6, kullanıcı.getRole());
            komuttamamlayıcı.setString(7, kullanıcı.getEMail());
            komuttamamlayıcı.executeUpdate();
            baglantı.commit(); 
            kullanıcıOlusturulduMu = true;
            
        } catch (SQLException ex) {
            
            try {
                baglantı.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(SQLKullanıcıIslemleri.class.getName()).log(Level.SEVERE, null, ex1);
            }            
        }
        return kullanıcıOlusturulduMu;
    }
        
    
    public Kullanıcı kullanıcıBul(String girilenkullanıcıAdı) throws SQLException{    
        
        Kullanıcı kullanıcı = null;  
        
        komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_ADI);
        komuttamamlayıcı.setString(1, girilenkullanıcıAdı);
        
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
        
        return kullanıcı;
        
        
    }    
    
    
    public Kullanıcı kullanıcıBul(String girilenKullanıcıAdı, String girilenKullanıcıSifre) throws SQLException{
    
        Kullanıcı kullanıcı = null;
        String role = "";
       
        komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_ADI_SIFRESI);
        komuttamamlayıcı.setString(1, girilenKullanıcıAdı);
        komuttamamlayıcı.setString(2, girilenKullanıcıSifre);
        
        ResultSet sonuc = komuttamamlayıcı.executeQuery();
        
        while(sonuc.next()){
        
            role = sonuc.getString("role");
            
            switch (role) {
                case "Admin":
                    kullanıcı = ekBilgileriBul(ADMIN_ID, sonuc);
                    break;
                case "Ogrenci":
                    kullanıcı = ekBilgileriBul(OGRENCI_ID, sonuc);
                    break;
                case "Ogretmen":
                    kullanıcı = ekBilgileriBul(OGRETMEN_ID, sonuc);
                    break;
                case "OkulMuduru":
                    kullanıcı = ekBilgileriBul(OKULMUDURU_ID, sonuc);
                    break;
                default:
                    kullanıcı = null;
                    break;
            }            
        }              
        
        return kullanıcı;
    }
    
    protected Kullanıcı ekBilgileriBul(String SQL, ResultSet sonuc) throws SQLException{
    
        Kullanıcı kullanıcı = null;
        Integer id = sonuc.getInt("id");
        String role = sonuc.getString("role");
        
        komuttamamlayıcı = baglantı.prepareStatement(SQL);
        komuttamamlayıcı.setInt(1, id);
        ResultSet sonucYeni = komuttamamlayıcı.executeQuery();
        
        while(sonucYeni.next()){
        
            switch (role) {
                case "Admin":
                    kullanıcı = new Admin(
                            
                            sonucYeni.getInt("adminSifresi"),
                            sonuc.getInt("id"),
                            sonuc.getInt("yas"),
                            sonuc.getString("isim"),
                            sonuc.getString("soyIsim"),
                            sonuc.getString("kullanıcıAdı"),
                            sonuc.getString("kullanıcıSifre"),
                            sonuc.getString("role"),
                            sonuc.getString("EMail")
                    );  break;
                case "Ogrenci":
                    kullanıcı = new Ogrenci(
                            
                            sonucYeni.getInt("okulaBaslamaTarihi"),
                            sonucYeni.getInt("kayıtlıOlunanOkulId"),
                            sonucYeni.getInt("sınavPuanı"),
                            sonuc.getInt("id"),
                            sonuc.getInt("yas"),
                            sonuc.getString("isim"),
                            sonuc.getString("soyIsim"),
                            sonuc.getString("kullanıcıAdı"),
                            sonuc.getString("kullanıcıSifre"),
                            sonuc.getString("role"),
                            sonuc.getString("EMail")
                            
                    );  break;
                case "Ogretmen":
                    kullanıcı = new Ogretmen(
                            
                            sonucYeni.getInt("atamaPuanı"),
                            sonucYeni.getInt("ogretmenlikBaslangicTarihi"),
                            sonucYeni.getString("brans"),
                            sonucYeni.getInt("atanılanOkulId"),
                            sonuc.getInt("id"),
                            sonuc.getInt("yas"),
                            sonuc.getString("isim"),
                            sonuc.getString("soyIsim"),
                            sonuc.getString("kullanıcıAdı"),
                            sonuc.getString("kullanıcıSifre"),
                            sonuc.getString("role"),
                            sonuc.getString("EMail")
                            
                    );  break;
                default:
                    kullanıcı = new OkulMuduru(
                            
                            sonucYeni.getInt("mudurlukBaslangicTarihi"),
                            sonucYeni.getInt("atamaPuanı"),
                            sonucYeni.getInt("ogretmenlikBaslangicTarihi"),
                            sonucYeni.getString("brans"),
                            sonucYeni.getInt("atanılanOkulId"),
                            sonuc.getInt("id"),
                            sonuc.getInt("yas"),
                            sonuc.getString("isim"),
                            sonuc.getString("soyIsim"),
                            sonuc.getString("kullanıcıAdı"),
                            sonuc.getString("kullanıcıSifre"),
                            sonuc.getString("role"),
                            sonuc.getString("EMail")
                    );  break;
            }
        }
        
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
