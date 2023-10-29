package fatec.poo.model;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Hospede {

    private String cpf;
    private double taxaDesconto;

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
        
}
