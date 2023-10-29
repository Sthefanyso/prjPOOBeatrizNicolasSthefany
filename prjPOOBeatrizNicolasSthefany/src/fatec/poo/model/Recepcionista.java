package fatec.poo.model;

/**
 * @author Beatriz / Nicolas / Sthefany
 */
public class Recepcionista {
    private int regFunc;
    private String turno;

    public Recepcionista(int regFunc, String turno) {
        this.regFunc = regFunc;
        this.turno = turno;
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
