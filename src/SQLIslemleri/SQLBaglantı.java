
package SQLIslemleri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLBaglantı {
    
    final String KULLANICI_ADI = "root";
    final String PAROLA = "";
    final String HOST = "localhost";
    final String JDBC = "jdbc:mysql://";
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final Integer PORT = 3306;
    
    String DBIsmi;
    String baglantıURL;
    Connection baglantı;
    PreparedStatement komuttamamlayıcı;

    public SQLBaglantı(String DBIsmi) {
        this.DBIsmi = DBIsmi;
        DBBaglantıKur();
    }    
    
    public void DBBaglantıKur(){
    
        try {
            Class.forName(DRIVER);
            baglantıURL = JDBC + HOST + ":" + PORT + "/" + DBIsmi;
            baglantı = (Connection) DriverManager.getConnection(baglantıURL, KULLANICI_ADI, PAROLA);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLBaglantı.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
