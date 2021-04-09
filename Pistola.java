
public class Pistola {
    String marca;
    int carga;
    int balas;

    public void cargar(int numb) {
        if (numb > carga)
            numb = carga;
        balas = numb;
    }

    public boolean disparar() {
        if (balas == 0)
            return false;
        System.out.println("Bang!");
        balas--;
        return true;
    }

    public Pistola(String m, int c) {
        this.marca = m;
        this.carga = c;
        this.balas = 0;
    }
}