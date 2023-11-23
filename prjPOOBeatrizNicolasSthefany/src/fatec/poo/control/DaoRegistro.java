
package fatec.poo.control;

import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sthefany, Beatriz, Nicolas
 */
public class DaoRegistro {
    private Connection conn;
    
    public DaoRegistro(Connection conn) {
         this.conn = conn;
    }
    

    
    
}
