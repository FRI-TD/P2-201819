
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Abstraktni razred Lik. V njem je definirana vsa "skupna logika" likov (položaj x,y, barva, 
 * premakni(), narisiMeje(), ...) ter abstraktni metodi narisi() in getMeje(). 
 * @author tomaz
 */
abstract public class Lik {
  
  private static final int M = 3;

  private int x;
  private int y;
  private Color barva;
  
  private boolean selected;

  public Lik(int x, int y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
    this.selected = false;
  }

  // Na nivoju abrtraktnega lika metodi narisi() in getMeje() ne
  // moreta biti definirani, saj sta močno odvisni od narave 
  // posameznega lika (krog se nariše povsem drugače kot kvadrat).
  abstract void narisi();
  abstract Rectangle getMeje();
  
  
  void premakni(int deltaX, int deltaY) {
    this.x = this.x + deltaX;
    this.y = this.y + deltaY;
  }
  
  void narisiMeje() {
    Rectangle r = getMeje();
    StdDraw.rectangle(r.x, r.y, M, M);
    StdDraw.rectangle(r.x+r.width, r.y, M, M);
    StdDraw.rectangle(r.x, r.y+r.height, M, M);
    StdDraw.rectangle(r.x+r.width, r.y+r.height, M, M);
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Color getBarva() {
    return barva;
  }

  public void setBarva(Color barva) {
    this.barva = barva;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }
  
  
  
}
