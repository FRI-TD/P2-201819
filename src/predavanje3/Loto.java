package predavanje3;

import java.util.Random;

/**
 * Izpis 7 števil za izpolnjevanje Loto listka
 * @author tomaz
 */
public class Loto {
  public static void main(String args[]) {
    Random rnd = new Random();
    for (int i = 1; i <= 7; i++) {
      int stevilo = rnd.nextInt(39)+1;            
      System.out.print(stevilo + " ");
    }
    System.out.println();
    
    // dodatek: kako ustvarim stevilo iz intervala od [a,b]
    int a=3, b=7;
    int x = a + rnd.nextInt(b-a+1);
    System.out.println(x);
  }
}
