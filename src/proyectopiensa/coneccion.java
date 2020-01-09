
package proyectopiensa;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class coneccion {
    Connection con;
    public Connection conectar(){
    try {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://C://PROYECTO_PIENSA/ProyectoBuestanAstudilloGordillo.accdb");
        JOptionPane.showMessageDialog(null, "LA BASE DE DATOS FUE CONECTADA CORRRECTAMENTE");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "LA BASE DE DATOS NO SE CONECTO CORRRECTAMENTE");

    }
    return con;
}

}


   


    

