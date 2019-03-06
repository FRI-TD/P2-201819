package predavanje2;

/**
 * 
 * @author tomaz
 */
public class PrestejBesede {
  
  // metoda pregleda tabelo besede in pošteje, koliko besed se začne na crko z
  static int steviloBesed(String[] besede, char z) {
    int b = 0; // število besed, ki se začne na z
    
    // ... sprehod preko celotne tabele
    for(int i=0; i<besede.length; i++) {
      // je prva crka besede enaka z?
      if (besede[i].charAt(0) == z) { 
        b = b+1; 
      }
    }
    return b;
  }
  
  public static void main(String[] args) {
    
    // deklaracija tabele ...
    String[] besede = new String[4];
    // ... in inicializacija vrednosti 
    besede[0] = "lipa";
    besede[1] = "javor";
    besede[2] = "jesen";
    besede[3] = "bor";
    
    int stBesed = steviloBesed(besede, 'j');
    System.out.println(stBesed);
    
    
    // tabelo lahko tudi hkrati deklariramo in inicializiramo (krajsi nacin)
    String[] besede2 = new String[] {"lipa", "javor", "jesen", "bor"};
    
    System.out.println(steviloBesed(besede2, 'p'));
  } 
   
}
