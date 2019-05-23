package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PraznaException extends RuntimeException {
  @Override
  public String getMessage() {
    return "Datoteka je prazna";
  }
}

/**
 * Podobno kot v Izjema2 tudi tu ustvarimo novo izjemo tipa PraznaException.
 * Razlika: ker je razred PraznaException naslednik razreda  RuntimeException
 * (torej gre za nepreverljivo izjemo), klicoči metodi izjeme ni treba 
 * obravnavati.
 * @author tomaz
 */
public class Izjema3 {

  static void preberiDatoteko() throws PraznaException {
    try {
      Scanner sc = new Scanner(new File("viri/prazna"));
      
      int stVrstic=0;
      int celotnaDolzina = 0;
      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        stVrstic++;
        celotnaDolzina += vrstica.length();
      }        
      sc.close();
      
      if (stVrstic == 0)
        throw new PraznaException();
      
      int povDolzina = celotnaDolzina/stVrstic;
      System.out.printf("Povprecna dolzina: %d\n", povDolzina);
    
    } catch (FileNotFoundException e) {
      System.out.println("Napaka - datoteka ne obstaja");
    } 
  }
    
  
  public static void main(String[] args) {
      preberiDatoteko();
  }
}
