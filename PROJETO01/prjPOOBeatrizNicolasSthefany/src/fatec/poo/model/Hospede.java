package fatec.poo.model;
import java.util.ArrayList;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Hospede extends Pessoa {

    private String cpf;
    private double taxaDesconto;    
    private ArrayList<Registro> registros;
    
    
    public Hospede(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
        registros = new ArrayList<Registro>();
    }
    
    public void addRegistro(Registro r){
      registros.add(r);//insere um objeto na lista
      
    }
    
    public void setTaxaDesconto(double taxaDesconto) {
       this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

        
}
