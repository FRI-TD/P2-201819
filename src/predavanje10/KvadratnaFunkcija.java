package predavanje10;

/**
 * y = a x^2 + b x + c
 * @author tomaz
 */
public class KvadratnaFunkcija extends Funkcija {
  double a;
  double b;
  double c;

  public KvadratnaFunkcija(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  double vrednost(double x) {
    return a * x* x + b * x + c;
  }

  @Override
  double odvod(double x) {
    return 2*x*a + b;
  }
  
  
  
}
