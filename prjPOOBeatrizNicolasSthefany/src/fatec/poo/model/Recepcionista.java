package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;        
    private ArrayList<Registro> registros;
    
    public Recepcionista( int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        registros = new ArrayList<Registro>();
    }
    
    public void addRegistro(Registro r){
      registros.add(r);//insere um objeto na lista
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public int getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
}
