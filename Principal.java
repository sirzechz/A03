
public class Principal {
  public static void main(String[] args) {
    Pistola p1, p2;
    p1 = new Pistola("Beretta", 17);
    p2 = new Pistola("browning", 10);

    p1.cargar(3);
    System.out.println("Disparando la" + p1.marca);
    for (int i = 0; i < 5; i++) {
      System.out.print("disparo" + i + ": ");
      if (!p1.disparar())
        System.out.println("Sin balas");
    }

    p2.cargar(4);
    System.out.println("Disparando la" + p2.marca);
    for (int i = 0; i < 5; i++) {
      System.out.print("disparo" + i + ": ");
      if (!p2.disparar())
        System.out.println("sin balas");
    }
  }
}
