package fatec.poo.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Hospede hospede;
    private Recepcionista recepcionista;

    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
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


    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    
    public void reservarQuarto(Hospede h, Quarto q){
        q.reservar();
    }

    
    public void liberarQuarto(Quarto q, Hospede h, ServicoQuarto sq){
        
        int dias = (int) (Duration.between(dataEntrada.atStartOfDay(), dataSaida.atStartOfDay())).toDays();
        q.liberar(dias);
        valorHospedagem = q.getTotalFaturado() - (q.getTotalFaturado()* h.getTaxaDesconto()) + sq.getValor();
    }
    
   
}
