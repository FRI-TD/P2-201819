package predavanje10;

/**
 *
 * @author tomaz
 */
public class Sinus extends Funkcija {

  @Override
  double vrednost(double x) {
    return Math.sin(x);
  }

  @Override
  double odvod(double x) {
    return Math.cos(x);
  }

  
}
