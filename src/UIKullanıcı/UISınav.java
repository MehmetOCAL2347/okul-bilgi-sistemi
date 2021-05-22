package UIKullanıcı;

import Sorular.Soru;

public class UISınav {
    
    private Soru soru1 = new Soru("Bir sayının 3 fazlasının 2 katı 8 olan sayı kaçtır? ", "2", "1", "3", "4", "B");
    private Soru soru2 = new Soru("Alanı 9 birimkare olan bir karenin kenarları toplamı kaçtır? ", "10", "20", "22", "12", "D");
    private Soru soru3 = new Soru("Hangisinin sonucu yanlıştır? ", "2 * 2 + 3 = 10", "4 / 2 - 1 = 1", "( 3 + 2 ) * 3 = 15", "( 10 / 2 ) - 2 = 3", "A");
    private Soru soru4 = new Soru("Yarıçapı r = 3 cm olan bir çemberin çevresi kaç cm'dir? ( pi=3 alınız) ", "12", "10", "18", "20", "C");
    private Soru soru5 = new Soru("Aşağıdakilerinden hangisinin yazımı doğrudur? ", "Yalnız", "Yanlız", "Yanısıra", "Biliminsanı", "A");
    private Soru soru6 = new Soru("Aşağıdakilerden hangisinde yazım yanlışı vardır? ", "Bilim kurgu", "İşbirliği", "Aksesuar", "Sıra dışı", "B");
    private Soru soru7 = new Soru("Vatan Yahut Silistre eseri hangi yazara aittir? ", "Orhan Kemal", "Orhan Veli Kanık", "Namık Kemal", "Sabahattin Ali", "C");    
    private Soru soru8 = new Soru("... - ... do you arrive at school? ( Please fill in the blank areas ) ", "What - time", "How - many", "Which - you", "Where - are", "A");
    private Soru soru9 = new Soru("What time is it? ( Clock : 02.25 ) ", "It's half past two", "It's twenty-five past two", "It's two o'clock", "It's ten past three", "B");
    private Soru soru10 = new Soru("..... are we going? ( Please fill in the blank area ) ", "What", "How", "Who", "Where", "D");

    public UISınav() {
    }

    public Soru soruGetir(Integer soruId){
    
        if(soruId < 1){
            soruId = 1;
        }else if(soruId > 10){
            soruId = 10;
        }
        
        switch (soruId) {
            case 1:
                return soru1;
            case 2:
                return soru2;
            case 3:
                return soru3;
            case 4:
                return soru4;
            case 5:
                return soru5;
            case 6:
                return soru6;
            case 7:
                return soru7;
            case 8:
                return soru8;
            case 9:
                return soru9;
            default:
                return soru10;
        }
        
    }
}
