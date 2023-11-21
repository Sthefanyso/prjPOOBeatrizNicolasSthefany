/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.ServicoQuarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author orion
 */
public class DaoServicoQuarto {
    private Connection conn;
    
    public DaoServicoQuarto(Connection conn){
        this.conn = conn;
    }
    public void inserir(ServicoQuarto servicoQuarto){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbservicoQuarto(codigo, descricao, valor) VALUES(?,?,?");
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setDouble(3, servicoQuarto.getValor());
         
                      
            ps.execute(); 
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
     public void alterar(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbServicoQuarto set descricao = ? , set valor = ? " +
                                                 "where codigo = ?");
            
            
            ps.setString(1, servicoQuarto.getDescricao());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setInt(3, servicoQuarto.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    public ServicoQuarto consultar(int codigo){
        ServicoQuarto s = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbServicoQuarto where " + 
                    
             "codigo = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()==true){
                s = new ServicoQuarto(codigo, rs.getString("descricao"));
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        return(s);
    }
     public void excluir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbServicoQuarto where codigo = ?");
            
            ps.setInt(1, servicoQuarto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
}
