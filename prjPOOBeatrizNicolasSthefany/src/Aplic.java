import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Aplic {

    
    public static void main(String[] args) {
        Hospede objHospede  = new Hospede("254.469.898-65", "Pedro Silveira");
         Quarto objQuarto  = new Quarto(5, "S", 200.5);
         Recepcionista objRecepcionista = new Recepcionista(5005, "Aline Teixeira");
         
         Registro objRegistro = new Registro(1010, LocalDate.parse("18-10-2023"), objRecepcionista);

        
        
    }
}

    