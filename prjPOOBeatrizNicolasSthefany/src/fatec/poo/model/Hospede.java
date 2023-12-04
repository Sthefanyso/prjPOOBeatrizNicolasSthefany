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

    
    public static boolean validarCPF(String cpf){    
    String numeros;
    String[] caracteres;
    numeros = cpf.replaceAll("\\.","");
    numeros= numeros.replaceAll("-","");
    
    if (numeros.equals("00000000000") ||
    numeros.equals("11111111111") ||
    numeros.equals("22222222222") || numeros.equals("33333333333") ||
    numeros.equals("44444444444") || numeros.equals("55555555555") ||
    numeros.equals("66666666666") || numeros.equals("77777777777") ||
    numeros.equals("88888888888") || numeros.equals("99999999999") ||
    (numeros.length() != 11)){
    return(false);}
    else{
            caracteres = numeros.split("");
    int digito1 = 0;
    int digito2 = 0;
    
    
    for(int i = 0; i<9 ;i++){
        digito1 += Integer.parseInt(caracteres[i])*(i+1);
        }
    
    digito1 = digito1%11;
    if(digito1 == 10){
    digito1 = 0;}
    
    for(int i=0;i<10;i++){
        digito2 += Integer.parseInt(caracteres[i])*(11-i);   
    }
    
    digito2 = digito2*10;
    digito2 = digito2%11;
    
    if(digito2 == 10){
    digito2 = 0;}
 
    if(digito1 == Integer.parseInt(caracteres[9]) && 
       digito2 ==Integer.parseInt(caracteres[10])){
        
        return true;
    } 
    else{ 
        return false;}
    }
}
        
}
