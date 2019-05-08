
import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author tomaz
 */
public class Pravokotnik extends Lik {

  int a;
  int b;
  
  Pravokotnik(int x, int y, int a, int b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }
  
  void narisi() {
    StdDraw.setPenColor(getBarva());
    StdDraw.filledRectangle(getX(), getY(), a, b);
  }

  @Override
  Rectangle getMeje() {
    return new Rectangle(getX()-a, getY()-b, 2*a, 2*b);
  }
  
  
  
}
