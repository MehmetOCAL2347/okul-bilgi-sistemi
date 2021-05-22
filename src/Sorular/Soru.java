package Sorular;

public class Soru {
    
    private String soru;
    private String cevap_A;
    private String cevap_B;
    private String cevap_C;
    private String cevap_D;
    private String dogruCevap;

    public Soru(String soru, String cevap_A, String cevap_B, String cevap_C, String cevap_D, String dogruCevap) {
        this.soru = soru;
        this.cevap_A = cevap_A;
        this.cevap_B = cevap_B;
        this.cevap_C = cevap_C;
        this.cevap_D = cevap_D;
        this.dogruCevap = dogruCevap;
    }

    public String getSoru() {
        return soru;
    }

    public String getCevap_A() {
        return cevap_A;
    }

    public String getCevap_B() {
        return cevap_B;
    }

    public String getCevap_C() {
        return cevap_C;
    }

    public String getCevap_D() {
        return cevap_D;
    }

    public String getDogruCevap() {
        return dogruCevap;
    }
    
    
    
}
