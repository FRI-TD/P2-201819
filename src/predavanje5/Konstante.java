package predavanje5;

/**
 * Igranje s konstantami
 * @author tomaz
 */
public class Konstante {
  
  public static void main(String[] args) {
    char a = 'A';
    char pi = '\u03c0'; // znak z Unicode kodo 0x03C0
    
    char crkaA = '\u0041';// znak z Unicode kodo 0x0041
    
    // v javi lahko za imena spremenljivk in metod
    // uporabljam tudi ne-ascii črke (npr. π)
    double π = 3.14;
    System.out.println(π);
    
    System.out.println(a);
    System.out.println(pi);
    System.out.println(crkaA);
    
    
    // racunanje s crkami
    char x1 = 'A';
    char x2 = 'A';
    System.out.println(x1-x2);
    System.out.printf("%c", 97);
    System.out.printf("%d", (int)'B');
    
    System.out.println("---------");
    int a1 = 130;
    int a2 = 250;
    int a3 = 030;   // to je število v osmiškem sistemu (ker se začne z 0)
    int a4 = 0x30;
    
    System.out.println(a3);
    
    
  }

}
