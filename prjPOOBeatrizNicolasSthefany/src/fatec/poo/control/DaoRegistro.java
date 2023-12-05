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

/**
 *
 * @author Sthefany, Beatriz, Nicolas
 */
public class DaoRegistro {
    private Connection conn;
    private Conexao conexao=null;
    private DaoRecepcionista daoRecepcionista = null; 
    private Recepcionista rec;
    private Hospede hosp = null;
    private    Quarto quarto = null;
    private DaoHospede daoHospede = null;
    private DaoQuarto daoQuarto = null;
    
    public DaoRegistro(Connection conn) {
         this.conn = conn;
    }
    
     public void inserir(Registro registro){
        PreparedStatement ps = null;
        
        try{
                   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            ps = conn.prepareStatement("INSERT INTO tbregistro(codigo, regFuncRecepcionista, CPFHospede, dataEntrada, numeroQuarto) VALUES(?, ?, ?, ?, ?)");
            
            ps.setInt(1, registro.getCodigo());
            ps.setInt(2,registro.getRecepcionista().getRegFunc());
            ps.setString(3,registro.getHospede().getCpf());    
            //ps.setString(4, dataEntrada.toString());
            ps.setString(4, formatter.format(registro.getDataEntrada()));
            ps.setInt(5, registro.getQuarto().getNumero());
            
            ps.execute();            
        } catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Registro consultar(Integer codigo){
        Registro reg = null;
        PreparedStatement ps = null;
        
        
        try{
            ps = conn.prepareStatement("SELECT * from tbregistro " + 
                    
             "where codigo= ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = null;
            rs = ps.executeQuery();
            
            if(rs.next()==true){
                
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate dtDataEntrada = LocalDate.parse(rs.getString("dataEntrada"),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
             
             
             LocalDate dtDataSaida = null;
             conexao = new Conexao("","");
        
        conexao.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
        conexao.setConnectionString("jdbc:ucanaccess://C:\\Users\\beavi\\OneDrive\\Área de Trabalho\\FATEC\\prjPOOBeatrizNicolasSthefany\\prjPOOBeatrizNicolasSthefany\\src\\fatec\\poo\\basedados\\dbHotel.accdb");
             
             daoRecepcionista = new DaoRecepcionista(conexao.conectar());
             daoQuarto = new DaoQuarto(conexao.conectar());
             daoHospede = new DaoHospede(conexao.conectar());  
             
             rec = null; 
             int regFunc = rs.getInt("RegFuncRecepcionista");
             rec = daoRecepcionista.consultar(regFunc);
             hosp = daoHospede.consultar(rs.getString("CPFHospede"));
            quarto = daoQuarto.consultar(rs.getInt("NumeroQuarto"));
            reg = new Registro(codigo,dtDataEntrada, rec);
            
          if(rs.getString("dataSaida")!=null){
              dtDataSaida = LocalDate.parse(rs.getString("dataSaida"),
              DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                 
           } else{
          
          dtDataSaida = null;}
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
