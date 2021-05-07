package SQLIslemleri;

public class SQLKullanıcıIslemleri {
    
    private String mailAtılacakAdres = "";
    private String mailAdresim = "udemymaildemo@gmail.com";
    private String mailSifrem = "UdemyMailDemo+";
    private String unutulanSifre = "";
    private String sifreKurtarmaKodu = "";
    
    
    public void kullanıcıBul(String kullanıcıAdı){    
        
        // Bu bilgiler DB'den gelicek
        this.mailAtılacakAdres = "udemyokulbilgisistemi@gmail.com";   
        this.unutulanSifre = "123456";
        
    }    
    
    
    public void sifremiUnuttum(String kullanıcıAdı){
        
        kullanıcıBul(kullanıcıAdı);
        
        if(!mailAtılacakAdres.equals("")){
        
            System.out.println("Mail Gönderme İşlemlerine Devam edilecek");
            
        }else{
        
            System.out.println("Kullanıcı Maili bulunamadı. >> Uyarı göndericez");
            
        }
    
    }
    
}
