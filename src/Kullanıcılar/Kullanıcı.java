package Kullanıcılar;

public class Kullanıcı {
    
    private Integer yas;
    private String isim;
    private String soyIsım;
    private String kullanıcıAdı;
    private String kullanıcıSifre;
    private String role;
    private String EMail;

    public Kullanıcı(Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        this.yas = yas;
        this.isim = isim;
        this.soyIsım = soyIsım;
        this.kullanıcıAdı = kullanıcıAdı;
        this.kullanıcıSifre = kullanıcıSifre;
        this.role = role;
        this.EMail = EMail;
    }

    public Integer getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsım() {
        return soyIsım;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public String getKullanıcıSifre() {
        return kullanıcıSifre;
    }

    public String getRole() {
        return role;
    }

    public String getEMail() {
        return EMail;
    }
}
