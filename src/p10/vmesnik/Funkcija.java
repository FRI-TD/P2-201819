package p10.vmesnik;

/**
 * Vmesnik, v katerem sta deklarirani dve metodi - vrednost in odvod.
 * Vsak razred, ki bo implementiral vmesnik Funkcija, mora omenjeni
 * metodi tudi definirati. 
 * @author tomaz
 */
public interface Funkcija {
  public double vrednost(double x);
  public double odvod(double x);  
  
  
  // Za razliko od abstraktnega razreda vmesnik ne more vsebovati
  // običajnih (implementiranih) metod
  //void log(String msg) {
  //  System.out.println(msg);
  //}
  
}
