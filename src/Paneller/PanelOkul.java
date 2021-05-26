package Paneller;

import UIKullanıcı.UIOkul;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelOkul extends Panel{
    
    UIOkul uiOkul = new UIOkul();
    
    public PanelOkul(JToggleButton jToggleButton, JPanel jPanel) {
        super(jToggleButton, jPanel);
    }    

    public UIOkul getUiOkul() {
        return uiOkul;
    }

}
