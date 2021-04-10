import java.util.Random; 


public class Bandido {
    private String apodo;
    private int peso;
    private boolean tieneTatuaje;
    private int salud = 5;
    private Pistola pistola;
    private Random random = new Random();


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
        b.recibirDanio(1);
    }

    public void disparar(Bandido b){
        if(pistola.marca.equals("Escopeta")){
                b.recibirDanio(4);
            } else {
                b.recibirDanio(2);
            }
    }

    private void recibirDanio(int danio){
        // Devuelve un numeor en el rango 0..1 Sí es 1 recibe daño 
        if (random.nextInt(2) == 1){
            salud -= danio;

            System.out.println("Ay!");
            if (salud <= 0){ // SI la vida es 0 o menor
                rendirse();
            }
        } else {
            System.out.println("Apunta mejor, tonto ql");
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