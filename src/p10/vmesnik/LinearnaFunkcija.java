package p10.vmesnik;



/**
 * y = k x + n
 * 
 * @author tomaz
 */
public class LinearnaFunkcija implements Funkcija {

  double k;
  double n;

  public LinearnaFunkcija(double k, double n) {
    this.k = k;
    this.n = n;
  }
  
  
  
  public double vrednost(double x) {
    return k * x + n;
  }

  public double odvod(double x) {
    return k;
  }
  
}
