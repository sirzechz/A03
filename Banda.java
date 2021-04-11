import java.util.Random; 
public class Banda{
    private Bandido[] banda;
    private String nombre;
    private int index;
    Random random = new Random();

    public Banda(String nombre, int miembros){
        this.nombre = nombre;
        this.banda = new Bandido[miembros];
        this.index = 0;
    }


    public void agregarMiembro(Bandido b){
        if (index < banda.length){
            banda[index] = b;
        }
    }

    // Modificar para que retorne un bandido al azar, no importa si su vida es 0
    public Bandido getBandido(int i){
        return banda[i];
    }

    public int cantidadMiembros(){
        // Esto retorna el tamaño del arreglo, no la cantidad de miembros en la banda.
        return banda.length;
    }
}