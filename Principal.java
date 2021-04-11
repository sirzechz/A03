import java.util.Random; 
public class main {
  public static void main(String[] args) {
    
    Random random = new Random();
    Banda banda1 = new Banda("banda1", 2);
    Banda banda2 = new Banda("banda2", 1);


    Bandido juan = new Bandido("Juancho", 85, true);
    Bandido miguel = new Bandido("asTa", 543, false);
    Bandido julio = new Bandido("Julio", 23, false);

    banda1.agregarMiembro(juan);
    banda1.agregarMiembro(miguel);
    banda2.agregarMiembro(julio);

    int index1,index2;
    index1 = random.nextInt(banda1.cantidadMiembros());
    index2 = random.nextInt(banda2.cantidadMiembros());


    Bandido b = banda1.getBandido(index1);
    Bandido b2 = banda2.getBandido(index2);


    b.golpear(b2);
    b2.disparar(b);
    b.golpear(b2);
    b.golpear(b2);
    b.golpear(b2);

  }
}
