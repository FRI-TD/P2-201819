package predavanje10;

/**
 * y = k x + n
 * 
 * @author tomaz
 */
public class LinearnaFunkcija extends Funkcija {

  double k;
  double n;

  public LinearnaFunkcija(double k, double n) {
    this.k = k;
    this.n = n;
  }
  
  
  
  @Override
  double vrednost(double x) {
    return k * x + n;
  }

  @Override
  double odvod(double x) {
    return k;
  }
  
}
