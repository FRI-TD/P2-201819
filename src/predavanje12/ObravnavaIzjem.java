package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Primer pravilne obravnave izjem. 
 * @author tomaz
 */
public class ObravnavaIzjem {

  // V kodi metode preberiDatoteko() lahko pride do dveh izjem:
  // 1) izjema pri odpiranju datoteke (FileNotFoundException)
  // 2) izjama zaradi deljenja z nič (ArithmeticException)
  // Vsako izjemo obravnavamo v svojem catch bloku
  static void preberiDatoteko()  {
    try {
      // ker je koda napisana v "try" bloku, lahko izvajamo
      // tudi "nevarno" kodo; če bo pri izvajanju prišlo
      // do izjeme, se bo izvedel odgovarjajoči "catch" blok.
      
      Scanner sc = new Scanner(new File("viri/prazna"));
      
      int stVrstic=0;
      int celotnaDolzina = 0;
      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        stVrstic++;
        celotnaDolzina += vrstica.length();
      }        
      sc.close();
      
      int povDolzina = celotnaDolzina/stVrstic;
      System.out.printf("Povprecna dolzina: %d\n", povDolzina);
    
    // če datoteka ne obstaja, se bo "sprožil" ta blok ...
    } catch (FileNotFoundException e) {
      System.out.println("Napaka - datoteka ne obstaja");
      System.out.println(e.toString());
      System.out.println(e.getMessage());
      e.printStackTrace();
    // ... če pa pride do deljenja z nič, pa ta blok
    } catch (ArithmeticException e) {
      System.out.println("Deljenje z nič ni dovoljeno");
    }
  }
    
  
  public static void main(String[] args) {
    preberiDatoteko();
    
    
  }
}
