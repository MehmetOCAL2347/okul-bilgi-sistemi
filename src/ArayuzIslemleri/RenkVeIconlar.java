
package ArayuzIslemleri;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class RenkVeIconlar {
    
    // Iconlar
    
    private Icon cancel = new ImageIcon(getClass().getResource("/Images/cancel.png"));
    private Icon cancel2 = new ImageIcon(getClass().getResource("/Images/cancel2.png"));
    private Icon minimize = new ImageIcon(getClass().getResource("/Images/minimize.png"));
    private Icon minimize2 = new ImageIcon(getClass().getResource("/Images/minimize2.png"));
    private Icon user = new ImageIcon(getClass().getResource("/Images/user.png"));
    private Icon user2 = new ImageIcon(getClass().getResource("/Images/user2.png"));
    
    
    // Renkler
    
    private Color mavi = new Color(43,81,154);

    
    
    
    
    
    public Icon getCancel() {
        return cancel;
    }

    public Icon getCancel2() {
        return cancel2;
    }

    public Icon getMinimize() {
        return minimize;
    }

    public Icon getMinimize2() {
        return minimize2;
    }

    public Color getMavi() {
        return mavi;
    }

    public Icon getUser() {
        return user;
    }

    public Icon getUser2() {
        return user2;
    }
    
    
    
}
