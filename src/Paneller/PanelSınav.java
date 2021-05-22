package Paneller;

import UIKullanıcı.UISınav;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelSınav extends Panel{
    
    private UISınav iuSınav = new UISınav();
        
    public PanelSınav(JToggleButton jToggleButton, JPanel jPanel) {
        super(jToggleButton, jPanel);
    }

    public UISınav getIuSınav() {
        return iuSınav;
    }
    
}
