package predavanje12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Kopiranje datoteke v drugo datoteko. Predstavljene so tri metodo:
 * 1) kopiraj() bere in piše bajt-po-bajtu. Metoda je zelo počasna
 * 2) kopiraj1() bere in piše v blokih po 1024 bajtov; metoda je bistveno hitrejša od kopiraj()
 * 3) kopiraj2() bere in piše po blokih poleg tega pa uporablja BufferedInputStream
 *    in BufferedOutputStream in je zaradi tega hitrajša od kopiraj1()
 * @author tomaz
 */
public class KopirajDatoteko {
  
  static void kopiraj(String inFileName, String outFileName) {
    try {
      FileInputStream  fis = new FileInputStream(new File(inFileName));
      FileOutputStream fos = new FileOutputStream(new File(outFileName));
      
      while (fis.available() > 0) {
        int b = fis.read();
        fos.write(b);
      }
      
      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }

  // branje in pisanje blkok po bloku
  static void kopiraj1(String inFileName, String outFileName) {
    try {
      FileInputStream  fis = new FileInputStream(new File(inFileName));
      FileOutputStream fos = new FileOutputStream(new File(outFileName));
      
      byte[] buffer = new byte[1024];
      
      while (fis.available() > 0) {
        int koliko = fis.read(buffer);
        fos.write(buffer,0, koliko);
      }
      
      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
  
    // branje in pisanje blok po bloku + uporaba BufferedStream
  static void kopiraj2(String inFileName, String outFileName) {
    try {
      FileInputStream  fis = new FileInputStream(new File(inFileName));
      FileOutputStream fos = new FileOutputStream(new File(outFileName));
      
      BufferedInputStream bis  = new BufferedInputStream(fis);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      
      byte[] buffer = new byte[1024];
      
      while (bis.available() > 0) {
        int koliko = bis.read(buffer);
        bos.write(buffer,0, koliko);
      }
      
      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
  
  public static void main(String[] args) {
    kopiraj1("viri/medoX.jpg", "viri/medoXNov.jpg");
  }
  
}
