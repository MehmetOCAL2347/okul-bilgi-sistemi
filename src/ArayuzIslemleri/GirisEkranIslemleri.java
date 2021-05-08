package ArayuzIslemleri;

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
    
    private String sonucGiris_BosAlan;
    private String sonucGiris_Mesaj;
    
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
    
    public boolean girisYap(String kullanıcıAdı, String kullanıcıSifre){
        
        
        return true;
    
    }
    
    protected boolean bosGirisKontrol(){
    
        if(girilenKullanıcıAdı.equals("") && girilenSifre.equals("")){
            
            this.sonucGiris_BosAlan = "Kullanıcı Adı ve Şifresi Giriniz.";
            return false;
        }else if(girilenKullanıcıAdı.equals("")){
            
            this.sonucGiris_BosAlan = "Kullanıcı Adı Giriniz.";
            return false;
        }else if(girilenSifre.equals("")){
        
            this.sonucGiris_BosAlan = "Şifre Giriniz";
            return false;
        }else {
        
            this.sonucGiris_BosAlan = "Başarılı";
            return true;
        }
        
    }
    
    
    
    
    
    
    
    public boolean sifreKurtar(String kurtarmaKodu){
        
        
        
        return true;
    
    }
    
    
}
