
package fatec.poo.control;

import fatec.poo.model.Recepcionista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sthefany, Nicolas e Beatriz
 */
public class DaoRecepcionista {
    
    private Connection conn;
    
    public DaoRecepcionista(Connection conn){
        this.conn = conn;
    }
    
        public void inserir(Recepcionista recepcionista){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbrecepcionista(regFunc, nome, endereco, telefone, turno) VALUES(?, ?, ?, ?, ?)");
            
            ps.setInt(1, recepcionista.getRegFunc());
            ps.setString(2, recepcionista.getNome());
            ps.setString(3, recepcionista.getEndereco());
            ps.setString(4, recepcionista.getTelefone());
            ps.setString(5, recepcionista.getTurno());
            
            ps.execute();            
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
        
     public void alterar(Recepcionista recepcionista){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE tbrecepcionista set nome = ?, endereco = ?, telefone = ?, turno = ?" + 
                    
            "where regFunc= ?");
           
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getTurno());
            ps.setInt(5, recepcionista.getRegFunc());
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }    
    
     public Recepcionista consultar(Integer regFunc){
        Recepcionista r = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbRecepcionista where " + 
                    
             " regFunc= ?");
            
            ps.setInt(1, regFunc);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()==true){
                r = new Recepcionista(regFunc, rs.getString("nome"));
                r.setEndereco(rs.getString("endereco"));
                r.setTelefone(rs.getString("telefone"));
                r.setTurno(rs.getString("turno"));
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        return(r);
    }
   
    public void excluir(Recepcionista recepcionista){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM tbRecepcionista where regFunc = ?");
            
            ps.setInt(1, recepcionista.getRegFunc());
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        
        }
        
      }
}
