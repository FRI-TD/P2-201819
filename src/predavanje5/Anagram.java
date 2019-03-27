package predavanje5;

import java.util.Random;

/**
 *
 * @author tomaz
 */
public class Anagram {

  // metoda niz pretvori v tabelo znakov, znake premeša,
  // na koncu pa tabelo pretvori nazaj v niz
  static String premesaj(String beseda) {
    char[] znaki = beseda.toCharArray();
    
    Random rnd = new Random();
    // ponovim večkrat:
    for (int x = 0; x < rnd.nextInt(100); x++) {
      // izberem par (i,j) ...
      int i = rnd.nextInt(beseda.length());
      int j = rnd.nextInt(beseda.length());
      // ... in zamenjam i-to in j-to črko
      char tmp = znaki[i];
      znaki[i] = znaki[j];
      znaki[j] = tmp;
    }
    
    return new String(znaki);
  }
  
  
  public static void main(String[] args) {
    String beseda = "ABCDEF";
    System.out.println(premesaj(beseda));
  }
}
