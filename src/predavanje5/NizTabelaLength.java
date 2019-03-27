package predavanje5;

/**
 *
 * @author tomaz
 */
public class NizTabelaLength {
  public static void main(String[] args) {
    String a = "ponedeljek";
    // pri nizu je length() metoda ...                     - zato pišem s oklepaji ()
    System.out.println(a.length());
    
    String[] tab = {"a", "bc", "xyz"};
    // ... pri tabeli pa je length atribut (spremenljivka) - zato pišem brez oklepajev
    System.out.println(tab.length);
  }
}
