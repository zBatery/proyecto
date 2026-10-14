package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class Conexion {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/climed";
    
    private final String USER = "root";
    private final String PASSWORD = "7cjQ58cryD#";
    
    public void Conectar() throws ClassNotFoundException {
        
        try {
            conexion = DriverManager.getConnection( DB_URL, USER, PASSWORD );
            Class.forName( JDBC_DRIVER );
            
        } catch ( SQLException ex ) {
            System.getLogger( Conexion.class.getName() ).log( System.Logger.Level.ERROR, ( String ) null, ex );
        }
    }
    
    public void Cerrar() throws SQLException {
        
        if ( conexion != null ) {
            
            if ( !conexion.isClosed() ) {
                
                conexion.close();
            }
        }
    }
}
