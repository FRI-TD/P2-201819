package predavanje2;

/**
 *
 * @author tomaz
 */
public class StatistikaNizaZMetodo {
  
  static void statistika(String niz) {    
    System.out.println("Niz:             " + niz);
    System.out.println("Prva crka:       " + niz.charAt(0));
    System.out.println("Zadnja crka:     " + niz.charAt(niz.length()-1));
    
    System.out.print  ("Brez presledkov: ");
    int i;
    for (i=0; i<niz.length(); i++) {
      if (niz.charAt(i) != ' ') {
        System.out.print(niz.charAt(i));
      }
    }
    System.out.println();
    
    String nizBrezPresledkov = niz.replaceAll(" ", "");
    System.out.println("Brez presledkov: " + nizBrezPresledkov);
    
    int steviloBesed = niz.length() - nizBrezPresledkov.length() + 1;
    System.out.println("Število besed    " + steviloBesed);
    System.out.println("Celotna dolzina: " + niz.length());
    System.out.print  ("Obrnjen niz:     ");
    for(int j=niz.length()-1; j>=0; j--) {
     System.out.print(niz.charAt(j));
    }
    System.out.println();
    
  }
  
  public static void main(String[] args) {
    statistika("Danes je lep dan!");
    statistika("To je se en niz");
  }
}
