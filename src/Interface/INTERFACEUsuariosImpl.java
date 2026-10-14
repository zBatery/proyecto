package Interface;

import Clases.Conexion;
import Clases.Usuarios;
import Interface.INTERFACEUsuarios;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author crist
 */
public class INTERFACEUsuariosImpl extends Conexion implements INTERFACEUsuarios {

    @Override
    public void crear(Usuarios usuario) throws Exception {
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(nombre_usuario, password, codigo, nombre_apellido, rol) VALUES(?, ?, ?, ?, ?)");
            st.setString( 1, usuario.getUsername() );
            st.setString( 2, usuario.getPassword() );
            st.setString( 3, usuario.getCodigo() );
            st.setString( 4, usuario.getNombre() );
            st.setString( 5, usuario.getRol().name() );
            st.executeUpdate();
            
        } catch ( Exception e ) {
            
            throw e;
        } finally {
            
        this.Cerrar();
    }
    }

    @Override
    public void modificar(Usuarios usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Usuarios usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuarios> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
