package MailConfig;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailIslemleri {
    
    // Değişkenler
    
    private String mailAdresim = "udemymaildemo@gmail.com";
    private String mailSifrem = "UdemyMailDemo+";
    private String sifreKurtarmaKodu = "";
    private String mailIcerıgı_1 = "Merhaba,\n\nŞifrenizi Öğrenmek İçin Aşağıdaki Kodu Kullanınız;\n\n";
    private String mailIcerigi_2 = "\n\nİyi Günler";
    private String mailBaslıgı = "OBSUI Şifre Kurtarma Kodu";
    
    
    // Classlar 
    
    Properties properties;
    Session session;
    Message mesaj;

    public MailIslemleri() {
        
        propertiesDegerleriniOlustur();
        sessionDegerleriniOlustur();
        
    }
    
    protected void propertiesDegerleriniOlustur(){
    
        properties = System.getProperties();
        this.properties.put("mail.smtp.auth", "true");
        this.properties.put("mail.smtp.starttls.enable", "true");
        this.properties.put("mail.smtp.host", "smtp.gmail.com");
        this.properties.put("mail.smtp.port", "587");
        
    }
    
    
    protected void sessionDegerleriniOlustur(){
    
        session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                
                return new PasswordAuthentication(mailAdresim, mailSifrem);
                
            }
        });    
    }
    
    
    public void mailGonder(String mailAtılacakAdres) throws AddressException, MessagingException{
    
        this.sifreKurtarmaKodu = "123jasd";  // Burdaki değişkeni metodumuzla yapıcaz
        
        mesaj = new MimeMessage(session);
        mesaj.setFrom(new InternetAddress(mailAdresim));
        mesaj.setRecipient(Message.RecipientType.TO, new InternetAddress(mailAtılacakAdres));
        mesaj.setText(mailIcerıgı_1 + this.sifreKurtarmaKodu + mailIcerigi_2);
        mesaj.setSubject(mailBaslıgı);
        
        Transport.send(mesaj);
        
    }
    
    
}
