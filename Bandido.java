public class Bandido {
    private String apodo;
    private int peso;
    private boolean tieneTatuaje;
    private int salud = 5;
    private Pistola pistola;

    public Bandido(String apodo, int peso, boolean tatuaje) {
        this.apodo = apodo;
        this.peso = peso;
        this.tieneTatuaje = tatuaje;

        if (tieneTatuaje) {
            pistola = new Pistola("Escopeta", 7);
        } else {
            pistola = new Pistola("Magnum", 6);
        }
    }

    public void golpear(Bandido b) {
        if (b.salud > 0) {
            b.salud--;
            if (b.salud <= 0) {
                b.rendirse();
            }
        }
    }

    public void disparar(Bandido b){
        if (b.salud > 0) {
            if(pistola.marca.equals("Escopeta")){
                b.salud = b.salud - 4;
            } else {
                b.salud = b.salud - 2;
            }

            if (b.salud <= 0) {
                b.rendirse();
            }
        }
    }

    public int getSalud(){
        return salud;
    }

    public void rendirse() {
        System.out.println("*C va*");
    }

    public void datos() {
        System.out
                .println("Apodo: " + apodo + "\nPeso: " + peso + "\nTiene Tatuaje" + tieneTatuaje + "\nVida: " + salud);
    }
}