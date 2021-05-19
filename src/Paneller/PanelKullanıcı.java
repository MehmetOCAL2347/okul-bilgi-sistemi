package Paneller;

import UIKullanıcı.UIKullanıcı;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelKullanıcı extends Panel{

    private UIKullanıcı uiKullanıcı;

    public PanelKullanıcı(UIKullanıcı uiKullanıcı, JToggleButton jToggleButton, JPanel jPanel) {
        super(jToggleButton, jPanel);
        this.uiKullanıcı = uiKullanıcı;
    }
    
    public UIKullanıcı getUiKullanıcı() {
        return uiKullanıcı;
    }
      
}
