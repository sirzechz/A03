package A03;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random random = new Random();
        Banda banda1 = new Banda("Los motoqueros", 2);
        Banda banda2 = new Banda("Los malulos", 3);

        String[] apodos = {"El barrilito", "Lucho", "El orejón", "Tu vieja"};
        boolean[] valores = {true, false};

        // Valores aleatorios, pueden repetirse los nombres.
        banda1.agregarMiembro(new Bandido(apodos[random.nextInt(4)], random.nextInt(100), valores[random.nextInt(2)]));
        banda1.agregarMiembro(new Bandido(apodos[random.nextInt(4)], random.nextInt(100), valores[random.nextInt(2)]));
        banda2.agregarMiembro(new Bandido(apodos[random.nextInt(4)], random.nextInt(100), valores[random.nextInt(2)]));
        banda2.agregarMiembro(new Bandido(apodos[random.nextInt(4)], random.nextInt(100), valores[random.nextInt(2)]));
        banda2.agregarMiembro(new Bandido(apodos[random.nextInt(4)], random.nextInt(100), valores[random.nextInt(2)]));

        int index1 = banda1.getBandidoValido();
        int index2 = banda2.getBandidoValido();

        Bandido b;
        Bandido b2;

        while (index1 != -1 && index2 != -1) {
            b = banda1.getBandido(index1);
            b2 = banda2.getBandido(index2);

            if (b.getSalud() > 0) {
                b.atacar(b2);
            }
            if (b2.getSalud() > 0) {
                b2.atacar(b);
            }

            index1 = banda1.getBandidoValido();
            index2 = banda2.getBandidoValido();
        }

        if (index1 == -1) {
            System.out.println("La banda " + banda1.nombre + " ha perdido");
        } else {
            System.out.println("La banda " + banda2.nombre + " ha perdido");
        }

    }

}
