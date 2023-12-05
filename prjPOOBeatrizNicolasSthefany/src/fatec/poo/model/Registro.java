package fatec.poo.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.util.ArrayList;
/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Hospede hospede;
    private Quarto quarto;
    private Recepcionista recepcionista;
    private ArrayList<ServicoQuarto> servicoQuarto;

    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        recepcionista.addRegistro(this);
        
        servicoQuarto = new ArrayList<ServicoQuarto>();
    }
    

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

   
    public void reservarQuarto(Hospede h, Quarto q){
        this.hospede = h;
        this.quarto = q;
        h.addRegistro(this);
        this.quarto.reservar();
      }
    
    public void addServicoQuarto(ServicoQuarto sq){
        servicoQuarto.add(sq);
    }
    
    public double liberarQuarto(){
        double somaServico = 0;
        double desconto;
        System.out.println(dataSaida);
        System.out.println(dataEntrada);
        int dias = (int) (Duration.between(dataEntrada.atStartOfDay(), dataSaida.atStartOfDay())).toDays(); //calcula a quatidade de dias entre o ckeckin e o checkout e converte para INT
        
        
        //FOR EACH 
        for (ServicoQuarto s : servicoQuarto) { //SOMA todos os elementos da array servicoQuarto
            somaServico += s.getValor();
            } 
        
        valorHospedagem = quarto.liberar(dias);
        
        desconto = valorHospedagem * (hospede.getTaxaDesconto()/100);
        valorHospedagem = valorHospedagem - desconto+ somaServico;
        
        
        return valorHospedagem;
    }
    
   
}