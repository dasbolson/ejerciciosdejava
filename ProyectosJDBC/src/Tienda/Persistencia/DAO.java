/*
En este paquete estará la clase DAO encarga de conectarse con la base de datos y de
comunicarse con la base de datos para obtener sus datos. Además, estará las clases de
EntidadDaoExt para cada entidad / tabla de nuestro proyecto.

 */
package Tienda.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Casa
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    
    private void conectarBase () throws ClassNotFoundException, SQLException{
    
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE +"?useSSL=false";
            conexion= DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    protected void desconectarBase() throws Exception{
    
        try {
            if (resultado!=null) {
                resultado.close();
            }
            if (sentencia!=null) {
                sentencia.close();
            }
            if (conexion!=null) {
                conexion.close();
            }
            
        } catch (SQLException e) {
        throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception{
    
        try {
            conectarBase();
            sentencia=conexion.createStatement();
            sentencia.executeUpdate(sql);
            
            
        } catch (SQLException | ClassNotFoundException e) {
        throw e;
        } finally {
        desconectarBase();
        }
    
    }
    protected void consultarBase (String sql) throws Exception{
    
        try {
            conectarBase();
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sql);
                   
        } catch (Exception e) {
            throw e;
        }
    
    
    }
}