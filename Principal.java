
public class Principal {
  public static void main(String[] args) {
    
    Bandido juan = new Bandido("Juancho", 85, true);
    Bandido miguel = new Bandido("asda", 543, false);

    while(juan.getSalud() > 0 || miguel.getSalud() > 0){
      juan.disparar(miguel);
      miguel.disparar(juan);
    }
  }
}
