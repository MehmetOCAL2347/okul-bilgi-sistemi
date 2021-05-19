package ArayuzIslemleri;

import Kullanıcılar.Kullanıcı;
import Paneller.PanelAtama;
import Paneller.PanelKullanıcı;
import Paneller.PanelOkul;
import Paneller.PanelSınav;
import Paneller.PanelSınıf;
import javax.swing.JToggleButton;

public class OBSEkranIslemleri {
    
    private PanelKullanıcı panelKullanıcı;
    private PanelAtama panelAtama;
    private PanelOkul panelOkul;
    private PanelSınav panelSınav;
    private PanelSınıf panelSınıf;
    private Kullanıcı kullanıcı;

    public OBSEkranIslemleri(PanelKullanıcı panelKullanıcı, PanelAtama panelAtama, PanelOkul panelOkul, PanelSınav panelSınav, PanelSınıf panelSınıf, Kullanıcı kullanıcı) {
        this.panelKullanıcı = panelKullanıcı;
        this.panelAtama = panelAtama;
        this.panelOkul = panelOkul;
        this.panelSınav = panelSınav;
        this.panelSınıf = panelSınıf;
        this.kullanıcı = kullanıcı;
    }
    
    public void initComponent_UI(){
    
        panelKullanıcı.getjToggleButton().setSelected(true);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSınav.getjToggleButton().setSelected(false);
        panelSınıf.getjToggleButton().setSelected(false);
        
        panelKullanıcı.getjPanel().setVisible(true);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSınav.getjPanel().setVisible(false);
        panelSınıf.getjPanel().setVisible(false);
        
        System.out.println("Kullanıcı Rolu: " + this.kullanıcı.getRole());
                
    }
    
    public void btnItemStateChanged(JToggleButton jToggleBtn){
    
        if(jToggleBtn == panelKullanıcı.getjToggleButton()){
        
            if(panelKullanıcı.getjToggleButton().isSelected() && !panelKullanıcı.isBtnSeciliMi()){
                ekran_Kullanıcı();
            }
                
            if(panelKullanıcı.isBtnSeciliMi()){
                panelKullanıcı.getjToggleButton().setSelected(true);
            }
            
        }else if(jToggleBtn == panelAtama.getjToggleButton()){
        
            if(panelAtama.getjToggleButton().isSelected() && !panelAtama.isBtnSeciliMi()){
                ekran_Atama();
            }
                
            if(panelAtama.isBtnSeciliMi()){
                panelAtama.getjToggleButton().setSelected(true);
            }
            
        }else if(jToggleBtn == panelOkul.getjToggleButton()){
        
            if(panelOkul.getjToggleButton().isSelected() && !panelOkul.isBtnSeciliMi()){
                ekran_Okul();
            }
                
            if(panelOkul.isBtnSeciliMi()){
                panelOkul.getjToggleButton().setSelected(true);
            }
            
        }else if(jToggleBtn == panelSınav.getjToggleButton()){
        
            if(panelSınav.getjToggleButton().isSelected() && !panelSınav.isBtnSeciliMi()){
                ekran_Sınav();
            }
                
            if(panelSınav.isBtnSeciliMi()){
                panelSınav.getjToggleButton().setSelected(true);
            }
            
        }else if(jToggleBtn == panelSınıf.getjToggleButton()){
        
            if(panelSınıf.getjToggleButton().isSelected() && !panelSınıf.isBtnSeciliMi()){
                ekran_Sınıf();
            }
                
            if(panelSınıf.isBtnSeciliMi()){
                panelSınıf.getjToggleButton().setSelected(true);
            }
           
        }
        
    }
    
    protected void ekran_Kullanıcı(){
    
        panelKullanıcı.setBtnSeciliMi(true);
        panelAtama.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSınav.setBtnSeciliMi(false);
        panelSınıf.setBtnSeciliMi(false);
        
        panelKullanıcı.getjToggleButton().setSelected(true);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSınav.getjToggleButton().setSelected(false);
        panelSınıf.getjToggleButton().setSelected(false);
        
        panelKullanıcı.getjPanel().setVisible(true);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSınav.getjPanel().setVisible(false);
        panelSınıf.getjPanel().setVisible(false);
        
    }
    
    protected void ekran_Atama(){
    
        panelKullanıcı.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(true);
        panelOkul.setBtnSeciliMi(false);
        panelSınav.setBtnSeciliMi(false);
        panelSınıf.setBtnSeciliMi(false);
        
        panelKullanıcı.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(true);
        panelOkul.getjToggleButton().setSelected(false);
        panelSınav.getjToggleButton().setSelected(false);
        panelSınıf.getjToggleButton().setSelected(false);
        
        panelKullanıcı.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(true);
        panelOkul.getjPanel().setVisible(false);
        panelSınav.getjPanel().setVisible(false);
        panelSınıf.getjPanel().setVisible(false);
        
    }
    
    protected void ekran_Okul(){
    
        panelKullanıcı.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(true);
        panelSınav.setBtnSeciliMi(false);
        panelSınıf.setBtnSeciliMi(false);
        
        panelKullanıcı.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(true);
        panelSınav.getjToggleButton().setSelected(false);
        panelSınıf.getjToggleButton().setSelected(false);
        
        panelKullanıcı.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(true);
        panelSınav.getjPanel().setVisible(false);
        panelSınıf.getjPanel().setVisible(false);
        
    }
    
    protected void ekran_Sınav(){
    
        panelKullanıcı.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSınav.setBtnSeciliMi(true);
        panelSınıf.setBtnSeciliMi(false);
        
        panelKullanıcı.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSınav.getjToggleButton().setSelected(true);
        panelSınıf.getjToggleButton().setSelected(false);
        
        panelKullanıcı.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSınav.getjPanel().setVisible(true);
        panelSınıf.getjPanel().setVisible(false);
        
    }
    
    protected void ekran_Sınıf(){
    
        panelKullanıcı.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSınav.setBtnSeciliMi(false);
        panelSınıf.setBtnSeciliMi(true);
        
        panelKullanıcı.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSınav.getjToggleButton().setSelected(false);
        panelSınıf.getjToggleButton().setSelected(true);
        
        panelKullanıcı.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSınav.getjPanel().setVisible(false);
        panelSınıf.getjPanel().setVisible(true);
        
    }
    
}
