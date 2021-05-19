package UIKullanıcı;

import com.mysql.cj.util.StringUtils;
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

    
    public void kullanıcıTanımla() throws Exception{
    
        bosAlanKontrol();
        
    }
    
    protected void bosAlanKontrol() throws Exception{
    
        bosComponentKontrol(jTextField_isim, "İsim");
        bosComponentKontrol(jTextField_soyisim, "Soyisim");
        bosComponentKontrol(jTextField_kullanıcıAdı, "Kullanıcı Adı");
        bosComponentKontrol(jTextField_KullanıcıSifre, "Kullanıcı Şifre");
        bosComponentKontrol(jTextField_EMail, "EMail");        
        bosComponentKontrol(jComboBox_Role, "Role");
        bosComponentKontrol(jSpinner_Yas, "Yas", 5, 70);
        
        if(jComboBox_Role.getSelectedItem().toString().equals("OkulMuduru")){
        
            bosComponentKontrol(jComboBox_OgretmenlikBaslangıcYili, "Ogretmenlik Başlangıcı");
            bosComponentKontrol(jComboBox_Brans, "Brans");
            bosComponentKontrol(jComboBox_MudurlukBaslangıcYılı, "Müdürlük Başlangıcı");
            bosComponentKontrol(jSpinner_atamaPuanı, "Atama Puanı", 0, 100);
            
        }else if(jComboBox_Role.getSelectedItem().toString().equals("Ogretmen")){
            
            bosComponentKontrol(jComboBox_OgretmenlikBaslangıcYili, "Ogretmenlik Başlangıcı");
            bosComponentKontrol(jComboBox_Brans, "Brans");
            bosComponentKontrol(jSpinner_atamaPuanı, "Atama Puanı", 0, 100);
        
        }else if(jComboBox_Role.getSelectedItem().toString().equals("Ogrenci")){
        
            bosComponentKontrol(jComboBox_OgrencilikBaslangıcYılı, "Öğrencilik Başlangıcı");
            
        }
        
        
    }
    
    protected void bosComponentKontrol(JTextField yaziAlani, String alanAdı) throws Exception{
    
        String deger = yaziAlani.getText();
        deger = deger.replaceAll(" ", "");
        yaziAlani.setText(deger);
        
        if(StringUtils.isEmptyOrWhitespaceOnly(deger)){
            throw new Exception(alanAdı + " Alanı Boş Bırakılamaz");
        }        
    }
    
    protected void bosComponentKontrol(JComboBox comboBox, String alanAdi) throws Exception{
    
        Integer secilenDeger = comboBox.getSelectedIndex();
        boolean comboBoxGorunurMu = comboBox.isVisible();
        boolean comboBoxEnableMı = comboBox.isEnabled();
        
        if(comboBoxGorunurMu && comboBoxEnableMı){
        
            if(secilenDeger == 0){
                throw new Exception(alanAdi + " Kutusu Boş Bırakılamaz");
            }            
        }    
    }
    
    protected void bosComponentKontrol(JSpinner spinner, String alanAdi, Integer minDeger, Integer maxDeger) throws Exception{
    
        Integer spinnerDeger = (Integer) spinner.getValue();
        boolean spinnerGorunurMu = spinner.isVisible();
        boolean spinnerEnableMı = spinner.isEnabled();
        
        if(spinnerGorunurMu && spinnerEnableMı){
            
            if(spinnerDeger < minDeger){
                throw new Exception(alanAdi + " Sayacı " + minDeger + " 'den küçük olamaz");
            }else if(spinnerDeger > maxDeger){
                throw new Exception(alanAdi + " Sayacı " + maxDeger + " 'den büyük olamaz");
            }            
        }        
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
    
    public void kullanıcıRole_Component(String role){
    
        if(role.equals(" ")){     
            
            kullanıcıEkbilgilerBaslangıc();
            
        }else if(role.equals("Ogretmen")){
            
            ogretmen_Component();
            
        }else if(role.equals("OkulMuduru")){
            
            okulMuduru_Component();
            
        }else if(role.equals("Ogrenci")){
            
            ogrenci_Component();
        }
        
    }
    
    protected void ogretmen_Component(){
    
        jPanel_OgretmenlikEkBilgiler.setVisible(true);
        jPanel_OgrenciEkBilgiler.setVisible(false);
        
        jComboBox_OgretmenlikBaslangıcYili.setEnabled(true);
        jComboBox_Brans.setEnabled(true);
        jComboBox_MudurlukBaslangıcYılı.setEnabled(false);
        jComboBox_MudurlukBaslangıcYılı.setSelectedIndex(0);
        
        jSpinner_atamaPuanı.setEnabled(true);
        
    }
    
    protected void okulMuduru_Component(){
    
        jPanel_OgretmenlikEkBilgiler.setVisible(true);
        jPanel_OgrenciEkBilgiler.setVisible(false);
        
        jComboBox_OgretmenlikBaslangıcYili.setEnabled(true);
        jComboBox_Brans.setEnabled(true);
        jComboBox_MudurlukBaslangıcYılı.setEnabled(true);
        
        jSpinner_atamaPuanı.setEnabled(true);
        
    }
    
    protected void ogrenci_Component(){
    
        jPanel_OgrenciEkBilgiler.setVisible(true);
        jPanel_OgretmenlikEkBilgiler.setVisible(false);
        
        jComboBox_OgrencilikBaslangıcYılı.setEnabled(true);
        
        jComboBox_OgretmenlikBaslangıcYili.setEnabled(false);
        jComboBox_MudurlukBaslangıcYılı.setEnabled(false);
        jComboBox_Brans.setEnabled(false);        
        jSpinner_atamaPuanı.setEnabled(false);
        
        jComboBox_OgretmenlikBaslangıcYili.setSelectedIndex(0);
        jComboBox_MudurlukBaslangıcYılı.setSelectedIndex(0);
        jComboBox_Brans.setSelectedIndex(0);       
        jSpinner_atamaPuanı.setValue(70);
        
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
