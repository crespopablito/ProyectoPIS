
package proyectopiensa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class coneccion {
    Connection con;
    public Connection conectar(){
    try {
        
        Class.forName("net.ucanaccess.jobc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://c:/PROYECTO_PIENSA/PIS.accdb");
        JOptionPane.showMessageDialog(null, "LA BASE DE DATOS FUE CONECTADA CORRRECTAMENTE");
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "LA BASE DE DATOS NO SE CONECTO CORRRECTAMENTE");

    }
    return con;
}

}


   


    

