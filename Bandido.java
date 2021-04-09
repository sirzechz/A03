public class Bandido {
    private String apodo;
    private int peso;
    private boolean tieneTatuaje;
    private int salud;
    private Pistola pistola;

    public Bandido(String apodo, int peso, boolean tatuaje) {
        this.apodo = apodo;
        this.peso = peso;
        this.tieneTatuaje = tatuaje;
    }

    public void golpear(Bandido b) {
        if (b.salud > 0) {
            b.salud--;
            if (b.salud <= 0) {
                b.rendirse();
            }
        }
    }

    public void rendirse() {
        System.out.println("*C va*");
    }

}