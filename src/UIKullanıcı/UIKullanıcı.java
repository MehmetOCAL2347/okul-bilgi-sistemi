package UIKullanıcı;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class UIKullanıcı {
    
    private JTextField jTextField_isim;
    private JTextField jTextField_soyisim;
    private JTextField jTextField_kullanıcıAdı;
    private JTextField jTextField_KullanıcıSifre;
    private JTextField jTextField_EMail;
    private JButton jButton_Yenile;
    private JButton jButton_KayıtOlustur;
    private JComboBox jComboBox_Role;
    private JSpinner jSpinner_Yas;
    private JPanel jPanel_OgretmenlikEkBilgiler;
    private JPanel jPanel_OgrenciEkBilgiler;
    private JComboBox jComboBox_OgretmenlikBaslangıcYili;
    private JSpinner jSpinner_atamaPuanı;
    private JComboBox jComboBox_Brans;
    private JComboBox jComboBox_MudurlukBaslangıcYılı;
    private JComboBox jComboBox_OgrencilikBaslangıcYılı;
    private JPanel jPanel_DosyaOku;

    public UIKullanıcı(JTextField jTextField_isim, JTextField jTextField_soyisim, JTextField jTextField_kullanıcıAdı, JTextField jTextField_KullanıcıSifre, JTextField jTextField_EMail, JButton jButton_Yenile, JButton jButton_KayıtOlustur, JComboBox jComboBox_Role, JSpinner jSpinner_Yas, JPanel jPanel_OgretmenlikEkBilgiler, JPanel jPanel_OgrenciEkBilgiler, JComboBox jComboBox_OgretmenlikBaslangıcYili, JSpinner jSpinner_atamaPuanı, JComboBox jComboBox_Brans, JComboBox jComboBox_MudurlukBaslangıcYılı, JComboBox jComboBox_OgrencilikBaslangıcYılı, JPanel jPanel_DosyaOku) {
        this.jTextField_isim = jTextField_isim;
        this.jTextField_soyisim = jTextField_soyisim;
        this.jTextField_kullanıcıAdı = jTextField_kullanıcıAdı;
        this.jTextField_KullanıcıSifre = jTextField_KullanıcıSifre;
        this.jTextField_EMail = jTextField_EMail;
        this.jButton_Yenile = jButton_Yenile;
        this.jButton_KayıtOlustur = jButton_KayıtOlustur;
        this.jComboBox_Role = jComboBox_Role;
        this.jSpinner_Yas = jSpinner_Yas;
        this.jPanel_OgretmenlikEkBilgiler = jPanel_OgretmenlikEkBilgiler;
        this.jPanel_OgrenciEkBilgiler = jPanel_OgrenciEkBilgiler;
        this.jComboBox_OgretmenlikBaslangıcYili = jComboBox_OgretmenlikBaslangıcYili;
        this.jSpinner_atamaPuanı = jSpinner_atamaPuanı;
        this.jComboBox_Brans = jComboBox_Brans;
        this.jComboBox_MudurlukBaslangıcYılı = jComboBox_MudurlukBaslangıcYılı;
        this.jComboBox_OgrencilikBaslangıcYılı = jComboBox_OgrencilikBaslangıcYılı;
        this.jPanel_DosyaOku = jPanel_DosyaOku;
    }

    public void kullanıcıEkbilgilerBaslangıc(){
    
        jPanel_OgretmenlikEkBilgiler.setVisible(true);
        jPanel_OgrenciEkBilgiler.setVisible(false);
        
        jComboBox_OgretmenlikBaslangıcYili.setSelectedIndex(0);
        jComboBox_OgrencilikBaslangıcYılı.setSelectedIndex(0);
        jComboBox_MudurlukBaslangıcYılı.setSelectedIndex(0);
        jComboBox_Brans.setSelectedIndex(0);
        
        jComboBox_OgretmenlikBaslangıcYili.setEnabled(false);
        jComboBox_OgrencilikBaslangıcYılı.setEnabled(false);
        jComboBox_MudurlukBaslangıcYılı.setEnabled(false);
        jComboBox_Brans.setEnabled(false);
        
        jSpinner_Yas.setValue(25);
        jSpinner_atamaPuanı.setValue(70);
        jSpinner_atamaPuanı.setEnabled(false);
        
    }
    
    public JTextField getjTextField_isim() {
        return jTextField_isim;
    }

    public JTextField getjTextField_soyisim() {
        return jTextField_soyisim;
    }

    public JTextField getjTextField_kullanıcıAdı() {
        return jTextField_kullanıcıAdı;
    }

    public JTextField getjTextField_KullanıcıSifre() {
        return jTextField_KullanıcıSifre;
    }

    public JTextField getjTextField_EMail() {
        return jTextField_EMail;
    }

    public JButton getjButton_Yenile() {
        return jButton_Yenile;
    }

    public JButton getjButton_KayıtOlustur() {
        return jButton_KayıtOlustur;
    }

    public JComboBox getjComboBox_Role() {
        return jComboBox_Role;
    }

    public JSpinner getjSpinner_Yas() {
        return jSpinner_Yas;
    }

    public JPanel getjPanel_OgretmenlikEkBilgiler() {
        return jPanel_OgretmenlikEkBilgiler;
    }

    public JPanel getjPanel_OgrenciEkBilgiler() {
        return jPanel_OgrenciEkBilgiler;
    }

    public JComboBox getjComboBox_OgretmenlikBaslangıcYili() {
        return jComboBox_OgretmenlikBaslangıcYili;
    }

    public JSpinner getjSpinner_atamaPuanı() {
        return jSpinner_atamaPuanı;
    }

    public JComboBox getjComboBox_Brans() {
        return jComboBox_Brans;
    }

    public JComboBox getjComboBox_MudurlukBaslangıcYılı() {
        return jComboBox_MudurlukBaslangıcYılı;
    }

    public JComboBox getjComboBox_OgrencilikBaslangıcYılı() {
        return jComboBox_OgrencilikBaslangıcYılı;
    }

    public JPanel getjPanel_DosyaOku() {
        return jPanel_DosyaOku;
    }
    
    
    
}
