
package ArayuzIslemleri;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
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
    private Icon school1 = new ImageIcon(getClass().getResource("/Images/school1.png"));
    private Icon school2 = new ImageIcon(getClass().getResource("/Images/school2.png"));
    private Icon success = new ImageIcon(getClass().getResource("/Images/success.png"));
    
    
    // Renkler
    
    private Color mavi = new Color(43,81,154);
    private Color mor = new Color(75,0,130);
    
    // Fontlar
    
    private Font fontArialBold_16 = new Font("Arial", Font.BOLD, 16);
    
    // Modeller
    
    private String roleMudur[] = {" ", "Ogrenci"};
    private String roleAdmin[] = {" ", "OkulMuduru", "Ogretmen"};    
    private DefaultComboBoxModel modelMudur = new DefaultComboBoxModel(roleMudur);
    private DefaultComboBoxModel modelAdmin = new DefaultComboBoxModel(roleAdmin);

    public Icon getSchool1() {
        return school1;
    }

    public Icon getSchool2() {
        return school2;
    }

    public Icon getSuccess() {
        return success;
    }
    
    public Color getMor() {
        return mor;
    }

    public Font getFontArialBold_16() {
        return fontArialBold_16;
    }
    public DefaultComboBoxModel getModelMudur() {
        return modelMudur;
    }

    public DefaultComboBoxModel getModelAdmin() {
        return modelAdmin;
    }
    
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
