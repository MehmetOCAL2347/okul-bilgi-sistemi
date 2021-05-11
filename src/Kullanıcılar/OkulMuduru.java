
package Kullanıcılar;

public class OkulMuduru extends Ogretmen{
    
    private Integer mudurlukBaslangicYılı;

    public OkulMuduru(Integer mudurlukBaslangicYılı, Integer atamaPuanı, Integer ogretmenlikBaslangicTarihi, String brans, Integer atanılanOkulId, Integer id, Integer yas, String isim, String soyIsım, String kullanıcıAdı, String kullanıcıSifre, String role, String EMail) {
        super(atamaPuanı, ogretmenlikBaslangicTarihi, brans, atanılanOkulId, id, yas, isim, soyIsım, kullanıcıAdı, kullanıcıSifre, role, EMail);
        this.mudurlukBaslangicYılı = mudurlukBaslangicYılı;
    }
    

    public Integer getMudurlukBaslangicYılı() {
        return mudurlukBaslangicYılı;
    }
    
}
