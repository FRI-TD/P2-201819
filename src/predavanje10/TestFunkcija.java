package predavanje10;

/**
 *
 * @author tomaz
 */
public class TestFunkcija {
  
  static double getNiclo(Funkcija f, double x0, int n) {
    for (int i = 0; i < n; i++) {
      x0=x0-f.vrednost(x0)/f.odvod(x0);
    }
    return x0;
  }
  

  public static void main(String[] args) {
    Funkcija linFun = new LinearnaFunkcija(1, 8);
    
    //System.out.println(linFun.vrednost(10));
    
    Funkcija kvFun = new KvadratnaFunkcija(1, -4, 3);
    //System.out.println(kvFun.vrednost(2));
    
    
    Funkcija s = new Sinus();
    double nicla = getNiclo(s, 2, 6);
    System.out.println(nicla);
    System.out.println(Math.PI);
    
    // Anonimni notranji razred
    // ustvarim nov objekt tipa Funkcija in spotoma (v fazi ustvarjanja - new)
    // definiram njegovi metodi vrednost() in odvod()
    Funkcija c = new Funkcija() {
      @Override
      double vrednost(double x) {
        return Math.cos(x);
      }
      @Override
      double odvod(double x) {
        return -Math.sin(x);
      }
    };
  }
  
}
