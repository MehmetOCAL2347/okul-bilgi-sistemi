package Okullar;

public class Okul {
    
    private Integer id;
    private String okulAdı;
    private String sehir;
    private Integer ogrenciSayısı;
    private Integer ogretmenSayısı;
    private Integer sınıfSayısı;
    private Integer sınıfOgrenciSayısı;

    public Okul(Integer id, String okulAdı, String sehir, Integer ogrenciSayısı, Integer ogretmenSayısı, Integer sınıfSayısı) {
        this.id = id;
        this.okulAdı = okulAdı;
        this.sehir = sehir;
        this.ogrenciSayısı = ogrenciSayısı;
        this.ogretmenSayısı = ogretmenSayısı;
        this.sınıfSayısı = sınıfSayısı;
        this.sınıfOgrenciSayısı = this.ogrenciSayısı / this.sınıfSayısı;
        
    }

    public Integer getId() {
        return id;
    }
    
    public String getOkulAdı() {
        return okulAdı;
    }

    public String getSehir() {
        return sehir;
    }

    public Integer getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public Integer getOgretmenSayısı() {
        return ogretmenSayısı;
    }

    public Integer getSınıfSayısı() {
        return sınıfSayısı;
    }

    public Integer getSınıfOgrenciSayısı() {
        return sınıfOgrenciSayısı;
    }
}
