package predavanje4;

/**
 *
 * @author tomaz
 */
public class Prirejanje {
  public static void main(String[] args) {
    int a = 5;
    int b = 7;
    
    System.out.println(a == b);
    System.out.println(a = b );
    
    // najprej a dobi vrednost b, nato c dobi vrednost izraza (a=b), torej b.
    int c = a = b;
    
    // izpis najmanjšega in največjega celega števila int in long
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);
  }
}
