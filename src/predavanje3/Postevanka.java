package predavanje3;

import java.io.File;
import java.io.PrintWriter;

/**
 * Izpis besedila v tekstovno datoteko.
 * 
 * @author tomaz
 */
public class Postevanka {
  // Da se izognem težavamo z izjemami v glavo main metode dodam besedi "throws Exception".
  // To je slaba programerska praksa in jo bomo opustili takoj, ko bomo to znali!
  public static void main(String[] args) throws Exception {
   
    // z objektom pw razreda PrintWriter se povežem z datoteko na disku
    PrintWriter pw = new PrintWriter(new File("viri/veckratniki.txt"));
    
    int a = 3;
    for (int i = 0; i < 10; i++) {
      // izpis na zaslon
      System.out.printf("%d * %d = %d\n", i, a, i*a);
      
      // Izpis v datoteko; uporabljam enake ukaze, kot jih uporabljam za
      // izpis na zaslon; razlika: namesto "System.out" pišem "pw" (ime objektra)
      pw.printf("%d * %d = %d\n", i, a, i*a);
    }
    
    // obvezno zapiranje odprte datoteke po koncu pisanja
    pw.close();
  }
  
}
