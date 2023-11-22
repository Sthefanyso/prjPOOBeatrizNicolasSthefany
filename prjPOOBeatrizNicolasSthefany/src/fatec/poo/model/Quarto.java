package fatec.poo.model;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado = 0;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }
    
    public void reservar(){
        this.situacao = true;
    }
    
    /*- Tem como parâmetro de entrada a quantidade de dias que o hóspede ficou hospedado no quarto.
      - Passa a situação do quarto para disponível (false).
      - Calcula o valor da hospedagem de acordo como a quantidade de dias e o valor da diária que deve ser adicionado no total faturado.
      - Retorna o valor da hospedagem*/
    public double liberar(int dias){
        double hospedagem;
        hospedagem = dias * this.valorDiaria;
        this.situacao = false;
        this.totalFaturado += hospedagem;
        
        return hospedagem;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
