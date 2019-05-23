package predavanje12.izjeme;

import java.io.File;
import java.util.Scanner;

/**
 * Demonstracija "napačne" uporabe izjem. Običajno je 
 * treba izjemo obdelati na na mestu, kjer nastane. Praksa,
 * da izjemo "predajamo naprej" (ukaz throws) se uporablja
 * le izjemoma.
 * @author tomaz
 */
public class Izjema {
  
  static void preberiDatoteko() throws Exception {
    // ker je v podpisu metode dodan ukaz "throws", lahko
    // datoteko odpremo, ne da bi se menili za morebitno izjemo - 
    // če bo do nje prišlo, bo metode izjemo posredovala naprej 
    Scanner sc = new Scanner(new File("viri/passwd"));
    
    int stVrstic=0;
    int celotnaDolzina = 0;
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      stVrstic++;
      celotnaDolzina += vrstica.length();
    }        
    sc.close();
    
    System.out.printf("Povprecna dolzina: %.2f\n" , 1.0*celotnaDolzina/stVrstic);
  }
  
  public static void main(String[] args)   {
    // izjemo, ki je "nastala" v metodi preberiDatoteko() obdelamo tu;
    // alternativa - tudi v metodi main() bi lahko (čeprav je zaradi zgoraj
    // omenjenih razlogov to slaba praksa) posredovali naprej (ukaz throws ...)
    try {
      preberiDatoteko();
    } catch (Exception e) {
      
    }
  }
}
