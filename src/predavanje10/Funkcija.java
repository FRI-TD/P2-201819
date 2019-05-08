package predavanje10;

/**
 * Razred, v katerem sta deklarirani dve abstraktni metodi - vrednost() in odvod().
 * Vsak razred, ki bo razširil razred Funkcija, mora omenjeni metodi tudi definirati
 * (sicer bo tudi sam abstrakten).
 * 
 * @author tomaz
 */
abstract public class Funkcija {
  abstract double vrednost(double x);
  abstract double odvod(double x);
  

  
  // Abstraktni razred lahko poleg abstraktnih metod vsebuje
  // tudi "konkretne" (implementirane) metode
  void log(String msg) {
    System.out.println(msg);
  }

}
