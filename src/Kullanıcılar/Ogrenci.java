package Kullanıcılar;

public class Ogrenci extends Kullanıcı{
    
    private Integer okulaBaslamaTarihi;

    public Ogrenci(Integer okulaBaslamaTarihi, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.okulaBaslamaTarihi = okulaBaslamaTarihi;
    }

    public Integer getOkulaBaslamaTarihi() {
        return okulaBaslamaTarihi;
    }
    
}
