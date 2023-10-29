package fatec.poo.model;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Hospede extends Pessoa {

    private String cpf;
    private double taxaDesconto;

    public Hospede(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
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
