package predavanje9;

/**
 *
 * @author tomaz
 */
public class Planet {
  String ime;
  int radij;

  // privzet konstruktor (brez parametrov)
  public Planet() {}
  
  // konstruktor z omeba parametroma
  public Planet(String ime, int radij) {
    this.ime = ime;
    this.radij = radij;
  }
  
  double povrsina() {
    double povrsina = 4*Math.PI*radij*radij;
    return povrsina;
  }
}