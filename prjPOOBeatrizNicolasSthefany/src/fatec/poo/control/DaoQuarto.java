
package fatec.poo.control;

import fatec.poo.model.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nicolas Oliveira Ribeiro Dos Santos
 */
public class DaoQuarto {
    private Connection conn;
    
    public DaoQuarto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Quarto quarto){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbquarto(n_Quarto, valor_diaria, btngroup_tipo) VALUES(?,?,?)");
            ps.setInt(1, quarto.getNumero());
            ps.setDouble(2, quarto.getValorDiaria());
            ps.setString(3, quarto.getTipo());
                      
            ps.execute(); 
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
     public void alterar(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbquarto set valor_diaria = ?, btngroup_tipo = ? " +
                                                 "where n_Quarto = ?");
            
            
            ps.setDouble(1, quarto.getValorDiaria());
            ps.setString(2, quarto.getTipo());
            ps.setInt(3, quarto.getNumero());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    public Quarto consultar(int n_quarto){
        Quarto q = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbQuarto where " + 
                    
             "n_Quarto = ?");
            
            ps.setInt(1, n_quarto);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()==true){
                q = new Quarto(n_quarto, rs.getString("btngroup_tipo"), rs.getDouble("valor_diaria"));
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        return(q);
    }
     public void excluir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbQuarto where n_Quarto = ?");
            
            ps.setInt(1, quarto.getNumero());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
