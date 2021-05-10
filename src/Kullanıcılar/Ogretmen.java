package Kullanıcılar;

public class Ogretmen extends Kullanıcı{
    
    private Integer atamaPuanı;
    private Integer ogretmenlikBaslangicTarihi;
    private String brans;

    public Ogretmen(Integer atamaPuanı, Integer ogretmenlikBaslangicTarihi, String brans, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.atamaPuanı = atamaPuanı;
        this.ogretmenlikBaslangicTarihi = ogretmenlikBaslangicTarihi;
        this.brans = brans;
    }

    public Integer getAtamaPuanı() {
        return atamaPuanı;
    }

    public Integer getOgretmenlikBaslangicTarihi() {
        return ogretmenlikBaslangicTarihi;
    }

    public String getBrans() {
        return brans;
    }
    
}
