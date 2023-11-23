
package fatec.poo.control;

import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
     public void inserir(Registro registro){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbregistro(codigo, valorHospedagem) VALUES(?, ?)");
            
            ps.setInt(1, registro.getCodigo());
            ps.setDouble(2, registro.getValorHospedagem());
            
            
            ps.execute();            
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
     
    public void alterar(Registro registro){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE tbregistro set valorHospedagem = ? " + 
                    
            "where codigo= ?");
           
            ps.setDouble(1, registro.getValorHospedagem());
      
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    } 
    
    public Registro consultar(Integer codigo){
        Registro r = null;
        PreparedStatement ps = null;
        
        
        try{
            ps = conn.prepareStatement("SELECT * from tbregistro " + 
                    
             "where codigo= ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = null;
            rs = ps.executeQuery();
            
            if(rs.next()==true){
             
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        return(r);
    }
    
      public void excluir(Registro registro){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM tbregistro where codigo = ?");
            
            ps.setInt(1, registro.getCodigo());
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        
        }
        
      }
    
}
