package Kullanıcılar;

public class Admin extends Kullanıcı{
    
    private Integer adminSifresi;

    public Admin(Integer adminSifresi, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.adminSifresi = adminSifresi;
    }

    public Integer getAdminSifresi() {
        return adminSifresi;
    }
}
