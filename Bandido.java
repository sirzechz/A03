public class Bandido{
    private String apodo;
    private int peso;
    private boolean tieneTatuaje;
    private int salud;

    public void golpear(Bandido b){
        if (b.salud > 0){
            b.salud--;
        }
    }
}