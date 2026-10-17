/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
//IMPORTE
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author mirel
 */
public class Conexion {
    private static final String URL= "jdbc:mysql://localhost:3306/citas_medicas";
    private static final String USER= "root";
    private static final String PASS= "123456789";
    
    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexión: "+e.getMessage());
            return null; //dentro de catch
        }
    }
}
