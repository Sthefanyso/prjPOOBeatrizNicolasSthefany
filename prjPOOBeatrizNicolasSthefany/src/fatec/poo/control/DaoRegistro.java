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
            ps = conn.prepareStatement("INSERT INTO tbregistro(codigo, regFuncRecepcionista, CPFHospede, dataEntrada, dataSaida, numeroQuarto, valorHospedagem, situacao) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, registro.getCodigo());
            ps.setInt(2,registro.getRecepcionista().getRegFunc());
            ps.setString(3,registro.getHospede().getCpf());
            ps.setInt(4, registro.getQuarto().getNumero());    
            ps.setString(5, registro.getDataEntrada().toString());
            ps.setString(6, registro.getDataSaida().toString());
            ps.setDouble(7, registro.getValorHospedagem());
            ps.setBoolean(8, registro.getQuarto().getSituacao());
            
            ps.execute();            
        } catch(SQLException ex){
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
