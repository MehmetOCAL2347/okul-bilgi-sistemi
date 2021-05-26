package UIKullanıcı;

import Okullar.Okul;


public class UIOkul {
    
    private Okul okul1 = new Okul("Batıkent İ.Ö.O", "Ankara", 100, 5, 10);
    private Okul okul2 = new Okul("Bahçelievler İ.Ö.O", "İstanbul", 200, 4, 20);
    private Okul okul3 = new Okul("Ahmet Akkoç İ.Ö.O", "Sakarya", 50, 2, 5);
    private Okul okul4 = new Okul("Yeşilevler İ.Ö.O", "Ankara", 300, 8, 30);
    private Okul okul5 = new Okul("İldem İ.Ö.O", "Kayseri", 400, 7, 10);

    public UIOkul() {
    }

    public Okul okulBul(String okulAdı){
    
        if(okulAdı.equals("Batıkent İ.Ö.O")){
            return okul1;
        }else if(okulAdı.equals("Bahçelievler İ.Ö.O")){
            return okul2;
        }else if(okulAdı.equals("Ahmet Akkoç İ.Ö.O")){
            return okul3;
        }else if(okulAdı.equals("Yeşilevler İ.Ö.O")){
            return okul4;
        }else if(okulAdı.equals("İldem İ.Ö.O")){
            return okul5;
        }else {
            return null;
        }
        
    }
    
    public Okul getOkul1() {
        return okul1;
    }

    public Okul getOkul2() {
        return okul2;
    }

    public Okul getOkul3() {
        return okul3;
    }

    public Okul getOkul4() {
        return okul4;
    }

    public Okul getOkul5() {
        return okul5;
    }
    
    
    
}
