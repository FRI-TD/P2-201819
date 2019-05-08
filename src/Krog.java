
import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author tomaz
 */
public class Krog extends Lik {

  int r;

  public Krog(int x, int y, int r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }
  
  
  @Override
  void narisi() {    
    StdDraw.setPenColor(this.getBarva());
    StdDraw.filledCircle(getX(), getY(), r);
  }

  @Override
  Rectangle getMeje() {
    return new Rectangle(getX()-r, getY()-r, 2*r, 2*r);   
  }

}
