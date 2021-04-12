package A03;

import java.util.Random;

public class Banda {

    private Bandido[] banda;
    public String nombre;
    private int index;
    Random random = new Random();

    public Banda(String nombre, int miembros) {
        this.nombre = nombre;
        this.banda = new Bandido[miembros];
        this.index = 0;
    }

    public void agregarMiembro(Bandido b) {
        if (index < banda.length) {
            banda[index] = b;
            index++;
        }
    }
    
    public Bandido getBandido(int i) {
        return banda[i];
    }
    
    public int getBandidoValido(){
        for (int i = 0; i < index; i++) {
            if (banda[i].getSalud() > 0){
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean seRendira(){
        int count = 0;
        for (int i = 0; i <= index; i++) {
            count = banda[i].getSalud();
        }
        
        if (count > 0){return false;}
        
        return true;
    }
}
