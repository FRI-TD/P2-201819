package predavanje5;

import java.io.File;
import java.util.Scanner;

/**
 * Program prebere datoteko etc/passwd in izpise naslednji uid 
 * (pregleda vse uid-je, na koncu vrne stevilo, ki je za eno 
 *  večje od največjega prebranega uidja)
 *
 * @author tomaz
 */
public class Passwd {
  
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/passwd"));
    
    int max = 0;
    while (sc.hasNextLine()) {
      // primer prebrane vrstice:
      // lojze:x:1006:1006::/home/lojze:/bin/bash
      String vrstica = sc.nextLine();
      
      // razbitje vrstice na posamezne dele (ločilo je dvopičje)
      String[] deliVrstice = vrstica.split(":");
  
      // uid je v vrstici na mestu 2; pretvoriti ga je treba iz String v int
      int uid = Integer.parseInt(deliVrstice[2]);
      if (uid > max) {
        max = uid;
      }
    }
    
    sc.close();
    
    System.out.println("Naslednji ID: " + (max+1));
  }

}
