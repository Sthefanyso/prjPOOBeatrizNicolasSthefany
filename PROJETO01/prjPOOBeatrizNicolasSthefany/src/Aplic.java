import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import fatec.poo.model.ServicoQuarto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Aplic {

    
    public static void main(String[] args) {
        Hospede objHospede  = new Hospede("Pedro Silveira","254.469.898-65");
        objHospede.setTaxaDesconto(0);
         Quarto objQuarto  = new Quarto(5, "S", 200);
         
         Recepcionista objRecepcionista = new Recepcionista(5005, "Aline Teixeira");
         
         Registro objRegistro = new Registro(1010, LocalDate.parse("2018-05-24"), objRecepcionista);
         objRegistro.setDataSaida(LocalDate.parse("2018-05-26"));
         
         ServicoQuarto objServico = new ServicoQuarto(5, "doce"); //instanciando obj serviço e quarto
         objServico.setValor(5.15); //preço do serviço de quarto
         
         ServicoQuarto objS2 = new ServicoQuarto(6, "doce"); //instanciando obj serviço e quarto
         objS2.setValor(5.15); //preço do serviço de quarto
         
         //adcionando serviços de quarto na array list do serviço
         objRegistro.addServicoQuarto(objServico);
         objRegistro.addServicoQuarto(objS2);
         
         
         //fazendo a reserva
         objRegistro.reservarQuarto(objHospede, objQuarto);
         
         
         
         System.out.println("Valor final do serviço: "+ objRegistro.liberarQuarto());
         

        
        
    }
}

    