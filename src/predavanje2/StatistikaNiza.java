package predavanje2;

/**
 *
 * @author tomaz
 */
public class StatistikaNiza {
  public static void main(String[] args) {
    String niz = "Danes je lep dan!";
    
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
    System.out.println("Stevilo besed    " + steviloBesed);
    System.out.println("Celotna dolzina: " + niz.length());
    System.out.print  ("Obrnjen niz:     ");
    for(int j=niz.length()-1; j>=0; j--) {
     System.out.print(niz.charAt(j));
    }
    System.out.println();
    System.out.println();

    niz = "To je pa en drug niz";
    
    System.out.println("Niz:             " + niz);
    System.out.println("Prva crka:       " + niz.charAt(0));
    System.out.println("Zadnja crka:     " + niz.charAt(niz.length()-1));
    
    System.out.print  ("Brez presledkov: ");
    for (i=0; i<niz.length(); i++) {
      if (niz.charAt(i) != ' ') {
        System.out.print(niz.charAt(i));
      }
    }
    System.out.println();
    
    nizBrezPresledkov = niz.replaceAll(" ", "");
    System.out.println("Brez presledkov: " + nizBrezPresledkov);
    
    steviloBesed = niz.length() - nizBrezPresledkov.length() + 1;
    System.out.println("Stevilo besed    " + steviloBesed);
    System.out.println("Celotna dolzina: " + niz.length());
    System.out.print  ("Obrnjen niz:     ");
    for(int j=niz.length()-1; j>=0; j--) {
     System.out.print(niz.charAt(j));
    }
    System.out.println();

    
  }
}
