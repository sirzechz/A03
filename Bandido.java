package A03;

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

        if (tatuaje) {
            pistola = new Pistola("Escopeta", 7);
            pistola.cargar(7);
        } else {
            pistola = new Pistola("Magnum", 6);
            pistola.cargar(6);
        }
    }
//Agregar metodo atacar que llame a metodo Dispara, y al quedar sin balas, al metodo golpear;

    public void atacar(Bandido b) {
        System.out.println(apodo + " va a atacar a " + b.getApodo());
        if (pistola.balas > 0) {
            disparar(b);
        } else {
            golpear(b);
        }
    }

    public void golpear(Bandido b) {

        b.recibirDanio(1);
    }

    public void disparar(Bandido b) {
        System.out.println(apodo +  ": Traga plomo, maldito!");
        pistola.disparar();
        if (pistola.marca.equals("Escopeta")) {
            b.recibirDanio(4);
        } else {
            b.recibirDanio(2);
        }
        
    }

    private void recibirDanio(int danio) {
        // Devuelve un numeor en el rango 0..3 Sí es mayor que 0 recibe daño 
        if (random.nextInt(4) > 0) {
            salud -= danio;

            System.out.println(apodo + ": Ay!");
            if (salud <= 0) { // SI la vida es 0 o menor
                System.out.println(apodo + ": Me rindo!\n" + apodo + " huye del combate\n");
                
            }
        } else {
            System.out.println(apodo + ": Lero lero, no me diste");
        }
    }

    public int getSalud() {
        return salud;
    }
    
    public String getApodo(){
        return apodo;
    }
    
    public void datos() {
        System.out
                .println("Apodo: " + apodo + "\nPeso: " + peso + "\nTiene Tatuaje" + tieneTatuaje + "\nVida: " + salud);
    }
}
