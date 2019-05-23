package predavanje12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Branje binarne datoteke z razredom DataInputStream. 
 * 
 * Beremo datoteko tipa class (https://en.wikipedia.org/wiki/Java_class_file),
 * in sicer podatke magic (prvi štirje bajti), minor (bajta 5 in 6) ter 
 * major (bajta 7 in 8)
 * @author tomaz
 */
public class JavaVerzija {
  
  static void izpisiVerzijoRazreda(String imeDatoteke) {
    try {
      File f = new File(imeDatoteke);
      FileInputStream fis = new FileInputStream(f);
      DataInputStream dis = new DataInputStream(fis);

      int magic = dis.readInt();
      System.out.printf("%x\n", magic);
      
      int minor = dis.readShort();
      
      short verzija = dis.readShort();
      System.out.println("Verzija: " + (verzija-44));
      
      dis.close();
    } catch (Exception e) {
      System.out.println("Neznana verzija");
    }
    
  }

  // izpišemo magic (podpis) in verzijo razreda, podanega 
  // v prvem argumentu ob klicu prigrama
  public static void main(String[] args) { 
    izpisiVerzijoRazreda(args[0]);
  }
}
