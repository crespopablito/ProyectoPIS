
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
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\zapat\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoPIS\\PIS.accdb");
        JOptionPane.showMessageDialog(null, "LA BASE DE DATOS FUE CONECTADA CORRRECTAMENTE");
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "NO TIENE CONECCION CON LA BASE DE DATOS ");

    }
    return con;
}

}


   


    

