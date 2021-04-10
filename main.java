  
public class main {
  public static void main(String[] args) {
    
    Bandido juan = new Bandido("Juancho", 85, true);
    Bandido miguel = new Bandido("asTa", 543, false);

    while (juan.getSalud() >= 0 && miguel.getSalud() >= 0){
        juan.disparar(miguel);
        miguel.golpear(juan);
    }
  }
}
