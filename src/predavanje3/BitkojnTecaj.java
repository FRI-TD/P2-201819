package predavanje3;

import java.io.File;
import java.util.Scanner;

/**
 * Program prebere datoteko bitcoin.txt in izpiše najmanjše 
 * in največjo vrednost tečaja v podanem letu. 
 * @author tomaz
 */
public class BitkojnTecaj {

  // Da se izognem težavamo z izjemami v glavo main metode dodam besedi "throws Exception".
  // To je slaba programerska praksa in jo bomo opustili takoj, ko bomo to znali!  
  public static void main(String[] args) throws Exception {
    String leto = "2018";
    
    // odprem datoteko
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

    // začetne vrednosti za min in max    
    double minT = Double.MAX_VALUE;
    double maxT = Double.MIN_VALUE;
    
    // datumi minimalnega in maksimalnega tečaja
    String maxD="", minD="";
    
    // datoteko berem do konca (dokler je v njej še kakšna beseda)
    while (sc.hasNext()) {
      // preberem "besedo" datum in besedo "tecaj"
      String datum  = sc.next();
      String tecajS = sc.next();
      
      // preveri, ali se prebran datum nanaša na leto, ki me zanima
      if (datum.endsWith(leto)) {
        // tečaj iz stringoblike pretvorim v double ("13,50" -> 13.5)
        double tecaj = Double.parseDouble(tecajS);
        
        if (tecaj > maxT) {
          maxT = tecaj;
          maxD = datum;
        }
        if (tecaj < minT) {
          minT = tecaj;
          minD = datum;
        }        
      }
    }
    sc.close();

    System.out.printf("Minimum: %.2f na dan %s\n", minT, minD);
    System.out.printf("Maximum: %.2f na dan %s\n", maxT, maxD);
    
  }
}
