package SQLIslemleri;

import Kullanıcılar.Kullanıcı;
import MailConfig.MailIslemleri;
import javax.mail.MessagingException;

public class SQLKullanıcıIslemleri {
    
    // Değişikenler
      
    private String unutulanSifre = "";    
    
    
    // Classlar
    
    private MailIslemleri mail;
    
          
    // Constructor

    public SQLKullanıcıIslemleri(MailIslemleri mail) {
        this.mail = mail;
    }
        
    
    public Kullanıcı kullanıcıBul(String kullanıcıAdı){    
        
        // Bu bilgiler DB'den gelicek
        Kullanıcı kullanıcı;
        
        // DB'den kullanıcıAdı kullanıcımızı bulucaz.
        kullanıcı = new Kullanıcı(26, "Mehmet", "ÖCAL", "mehmet", "123456789", "Admin", "udemyokulbilgisistemi@gmail.com");
        
        return kullanıcı;
        
        
    }    
    
    
    public Kullanıcı kullanıcıBul(String girilenKullanıcıAdı, String girilenKullanıcıSifre){
    
        Kullanıcı kullanıcı;
        
        
        // DB'den kullanıcıAdı ve Kullnaıcı sifresiyle kullanıcımızı bulucaz.
        kullanıcı = new Kullanıcı(26, "Mehmet", "ÖCAL", "mehmet", "123456", "Admin", "udemyokulbilgisistemi@gmail.com");
        
        
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
