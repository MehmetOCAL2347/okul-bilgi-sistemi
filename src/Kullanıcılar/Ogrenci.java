package Kullanıcılar;

public class Ogrenci extends Kullanıcı{
    
    private Integer okulaBaslamaTarihi;
    private Integer kayıtlıOlunanOkulId;
    private Integer sınavPuanı;

    public Ogrenci(Integer okulaBaslamaTarihi, Integer kayıtlıOlunanOkulId, Integer sınavPuanı, Integer id, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(id, yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.okulaBaslamaTarihi = okulaBaslamaTarihi;
        this.kayıtlıOlunanOkulId = kayıtlıOlunanOkulId;
        this.sınavPuanı = sınavPuanı;
    }

    public Integer getOkulaBaslamaTarihi() {
        return okulaBaslamaTarihi;
    }

    public Integer getKayıtlıOlunanOkulId() {
        return kayıtlıOlunanOkulId;
    }

    public Integer getSınavPuanı() {
        return sınavPuanı;
    }
    
}
