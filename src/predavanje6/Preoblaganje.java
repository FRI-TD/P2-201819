package predavanje6;

import java.util.Random;

/**
 * Primer preobložene metode - metoda izpisi, je spodaj definirana 
 * na več načinov (z različnim stevilom parametrov).
 * Spodnji primer nakazuje, kako lahko s preoblaganjem (angl. overloading)
 * "simuliramo" privzete parametre, kot jih pozna, na primer, Python.
 * 
 * @author tomaz
 */
public class Preoblaganje {

  // izpise n presledkov, nato besedilo
  static void izpisi(int n, String besedilo) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
    System.out.println(besedilo);
  } 
  
  static void izpisi(String besedilo) {
    izpisi(0, besedilo);
  }
  
  static void izpisi(int n) {
    izpisi(n, "OPOZORILO");
  }
  
  static void izpisi() {
    izpisi(0);
  }
  
  public static void main(String[] args) {
    izpisi(10, "OPOZORILO!");
    
    izpisi("OBVESTILO");
    izpisi("INFO");
    
    izpisi(7);
    izpisi(15);
    
    izpisi();
    
  }
  
}
