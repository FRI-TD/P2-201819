package predavanje2;

/**
 *
 * @author tomaz
 */
public class Tabele {
  public static void main(String[] args) {
    int[] stevila; // deklaracija
    
    stevila = new int[10]; // ustvarim tabelo velikosti 10
    System.out.println(stevila.length);
    
    stevila[5] = 3;
    System.out.println(stevila[5]);
  }
}
