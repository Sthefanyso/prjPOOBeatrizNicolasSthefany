package fatec.poo.control;
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

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
        Registro reg = null;
        Recepcionista rec;
        Hospede hosp = null;
        Quarto quarto = null;
        DaoHospede daoHospede = null;
        DaoRecepcionista daoRecepcionista = null;
        DaoQuarto daoQuarto=null;
        PreparedStatement ps = null;
        
        
        try{
            ps = conn.prepareStatement("SELECT * from tbregistro " + 
                    
             "where codigo= ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = null;
            rs = ps.executeQuery();
            
            if(rs.next()==true){
                
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate dtDataEntrada = LocalDate.parse(rs.getString("dataEntrada"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
             LocalDate dtDataSaida = LocalDate.parse(rs.getString("dataSaida"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
             
             rec = null;       
             rec = daoRecepcionista.consultar(rs.getInt("RegFuncRecepcionista"));
             hosp = daoHospede.consultar(rs.getString("CPFHospede"));
            quarto = daoQuarto.consultar(rs.getInt("NumeroQuarto"));
            reg = new Registro(codigo,dtDataEntrada, rec);
            reg.setDataSaida(dtDataSaida);
            reg.reservarQuarto(hosp, quarto);
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        return(reg);
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
