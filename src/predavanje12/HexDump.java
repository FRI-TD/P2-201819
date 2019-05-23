package predavanje12;

import java.io.File;
import java.io.FileInputStream;

/**
 * Branje datoteke "bajt-po-bajtu" in izpis vsakega bajta v šestnajstiški obliki.
 * @author tomaz
 */
public class HexDump {

  public static void main(String[] args) {
    try {
      // povezava na datoteko za branje po bajtih
      FileInputStream fis = new FileInputStream(new File("viri/passwd"));
      int koliko = 0;
      
      // branje lahko izvajam dokler so bajti v datoteki
      // še na razpolago (oziroma, dokler fis.available() > 0)
      while(fis.available() > 0) {
        
        // preberem naslednji bajt ...
        int bajt = fis.read();
        
        // ... in ga izpišem na zaslon
        System.out.printf("%02x ", bajt);
        koliko++;
        
        if (koliko == 16) {
          System.out.println();
          koliko=0;
        }
      }
      fis.close();      
    } catch (Exception e) {
      System.out.println("Napaka pri branju!");
    }
  }
  
}
