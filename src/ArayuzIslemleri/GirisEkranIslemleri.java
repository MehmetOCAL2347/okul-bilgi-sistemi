package ArayuzIslemleri;

import java.util.Objects;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GirisEkranIslemleri {
    
    // Component Değişkenler
    
    private JTextField jTextField_KullanıcıAdı;
    private JTextField jTextField_KurtarmaKodu;
    private JPasswordField jPasswordField_Sifre;
    
    private String girilenKullanıcıAdı;
    private String girilenSifre;
    private String girilenKurtarmaKodu;
    
    
    // Değişkenlerimiz - Mesaj
    
    private String sonucMesaj;
        
    private String sonucKurtarma_BosAlan;
    private String sonucKurtarma_Mesaj;

    public GirisEkranIslemleri(JTextField jTextField_KullanıcıAdı, JTextField jTextField_KurtarmaKodu, JPasswordField jPasswordField_Sifre) {
        this.jTextField_KullanıcıAdı = jTextField_KullanıcıAdı;
        this.jTextField_KurtarmaKodu = jTextField_KurtarmaKodu;
        this.jPasswordField_Sifre = jPasswordField_Sifre;
        
        this.girilenKullanıcıAdı = jTextField_KullanıcıAdı.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
        this.girilenKurtarmaKodu = jTextField_KurtarmaKodu.getText();
        
    }
    
    
    // Giriş Yap Metodları
        
    
    public boolean bosGirisKontrol(){
    
        if(girilenKullanıcıAdı.equals("") && girilenSifre.equals("")){
            
            this.sonucMesaj = "Kullanıcı Adı ve Şifresi Giriniz.";
            return false;
        }else if(girilenKullanıcıAdı.equals("")){
            
            this.sonucMesaj = "Kullanıcı Adı Giriniz.";
            return false;
        }else if(girilenSifre.equals("")){
        
            this.sonucMesaj = "Şifre Giriniz";
            return false;
        }else {
        
            this.sonucMesaj = "Başarılı";
            return true;
        }
        
    }    
    
    
    // Şifre Kurtarma Metodları
    
    public boolean sifreKurtar(String kurtarmaKodu){
        
        boolean bosKurtarmaAlanKontrol = bosKurtarmaKontrol();
        boolean kurtarmaKoduKontrol = kurtarmaKoduKontrol(kurtarmaKodu);
        
        if(!bosKurtarmaAlanKontrol){
        
            this.sonucMesaj = this.sonucKurtarma_BosAlan;
            return false;
        }else if(!kurtarmaKoduKontrol){
        
            this.sonucMesaj = this.sonucKurtarma_Mesaj;
            return false;
        }else {
        
            this.sonucMesaj = "Başarılı";
            return true;
        }
            
    }
    
    
    
    protected boolean bosKurtarmaKontrol(){
    
        if(!girilenKurtarmaKodu.equals("")){
            
            this.sonucKurtarma_BosAlan = "Başarılı";
            return true;        
        }else{
        
            this.sonucKurtarma_BosAlan = "Kurtarma Kodu Girmediniz";
            return false;
        }
        
    }
    
    
    
    protected boolean kurtarmaKoduKontrol(String kurtarmaKodu){
    
        if(girilenKurtarmaKodu.equals(kurtarmaKodu)){
        
            this.sonucKurtarma_Mesaj = "Başarılı";
            return true;
        }else{
        
            this.sonucKurtarma_Mesaj = "Kurtarma Kodu Eşleşmedi";
            return false;
        }
    }
    
    public String getSonucMesaj() {
        return sonucMesaj;
    }
}
