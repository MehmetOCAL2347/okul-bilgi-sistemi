package Kullanıcılar;

public class Ogretmen extends Kullanıcı{
    
    private Integer atamaPuanı;
    private Integer ogretmenlikBaslangicTarihi;
    private String brans;
    private Integer atanılanOkulId;

    public Ogretmen(Integer atamaPuanı, Integer ogretmenlikBaslangicTarihi, String brans, Integer atanılanOkulId, Integer id, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(id, yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.atamaPuanı = atamaPuanı;
        this.ogretmenlikBaslangicTarihi = ogretmenlikBaslangicTarihi;
        this.brans = brans;
        this.atanılanOkulId = atanılanOkulId;
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

    public Integer getAtanılanOkulId() {
        return atanılanOkulId;
    }
    
}
