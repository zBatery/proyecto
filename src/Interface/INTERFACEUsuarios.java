package Interface;

import Clases.Usuarios;
import java.util.List;

/**
 *
 * @author crist
 */
public interface INTERFACEUsuarios {
    public void crear (Usuarios usuario) throws Exception;
    public void modificar (Usuarios usuario) throws Exception;
    public void eliminar (Usuarios usuario) throws Exception;
    public List<Usuarios> listar() throws Exception;
}
