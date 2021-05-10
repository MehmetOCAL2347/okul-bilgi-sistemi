package SQLIslemleri;

import Kullanıcılar.Kullanıcı;
import MailConfig.MailIslemleri;
import javax.mail.MessagingException;

public class SQLKullanıcıIslemleri {
    
    // Değişikenler
    
    private String mailAtılacakAdres = "";    
    private String unutulanSifre = "";    
    
    
    // Classlar
    
    private MailIslemleri mail;
    
          
    // Constructor

    public SQLKullanıcıIslemleri(MailIslemleri mail) {
        this.mail = mail;
    }
        
    
    public void kullanıcıBul(String kullanıcıAdı){    
        
        // Bu bilgiler DB'den gelicek
        this.mailAtılacakAdres = "udemyokulbilgisistemi@gmail.com";   
        this.unutulanSifre = "123456";
        
    }    
    
    
    public Kullanıcı kullanıcıBul(String girilenKullanıcıAdı, String girilenKullanıcıSifre){
    
        Kullanıcı kullanıcı;
        
        
        // DB'den kullanıcıAdı ve Kullnaıcı sifresiyle kullanıcımızı bulucaz.
        kullanıcı = new Kullanıcı(26, "Mehmet", "ÖCAL", "mehmet", "123456", "Admin", "udemyokulbilgisistemi@gmail.com");
        
        
        return kullanıcı;
    }
    
    
    public void sifremiUnuttum(String kullanıcıAdı) throws MessagingException{
        
        kullanıcıBul(kullanıcıAdı);
        
        if(!mailAtılacakAdres.equals("")){            
            
            System.out.println("Mail Gönderme İşlemlerine Devam edilecek");            
            mail.mailGonder(mailAtılacakAdres);
            
                       
        }else{
        
            System.out.println("Kullanıcı Maili bulunamadı. >> Uyarı göndericez");
            
        }
    
    }
    
}
