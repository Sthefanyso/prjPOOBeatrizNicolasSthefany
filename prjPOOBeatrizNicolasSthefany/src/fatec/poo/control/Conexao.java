package fatec.poo.control;


import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Sthefany, Nicolas, Beatriz
 */
public class Conexao {
    
private String connectionString;
    private String driver;
    private String usuario;
    private String senha;
    public  Connection connection; 

    public Conexao(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public Connection conectar() {
        if (connection == null) {
            try {
                Class.forName(driver);
                
                connection = DriverManager.getConnection(connectionString , usuario, senha);
                System.out.println("Conexão Ok");
                return (connection); 
            } catch (Exception ex) {
                System.out.println("Falha na Conexão");
                System.out.println(ex.toString() + ex.getMessage());                
            }
        }
        return connection;

    }

    public void fecharConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
