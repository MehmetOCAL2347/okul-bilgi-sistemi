package SQLIslemleri;

import MailConfig.MailIslemleri;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class SQLKullanıcıIslemleri {
    
    // Değişikenler
    
    private String mailAtılacakAdres = "";    
    private String unutulanSifre = "";    
    
    
    // Classlar
    
    MailIslemleri mail = new MailIslemleri();
    
    
        
    public void kullanıcıBul(String kullanıcıAdı){    
        
        // Bu bilgiler DB'den gelicek
        this.mailAtılacakAdres = "udemyokulbilgisistemi@gmail.com";   
        this.unutulanSifre = "123456";
        
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
