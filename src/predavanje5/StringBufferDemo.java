package predavanje5;

/**
 * V tem razredu s pomočjo dveh metod generiram dolg niz sestavljen
 * iz n besed "abrakadabra". V prvi metodi to naredim z uporabo 
 * razreda String, v drugi pa z uporabo razredi StringBuffer.
 * Metodi getDolgString() in getDolgStringIzStringBufferja() toerj vrneta 
 * ISTI rezultat, a kot vidimo v metodi main za to porabita različno
 * časa - slednja metoda je VELIKO hitrejša
 * @author tomaz
 */
public class StringBufferDemo {
  
  // metoda vrne String sestavljen iz n besed "abrakadabra"
  static String getDolgString(int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result = result + "abrakadabra";
    }
    return result;
  }
  
  // metoda vrne String sestavljen iz n besed "abrakadabra"
  static String getDolgStringIzStringBufferja(int n) {
    StringBuffer result = new StringBuffer("");
    for (int i = 0; i < n; i++) {
      result.append("abrakadabra");
    }
    return result.toString();
  }
  
  public static void main(String[] args) {
    int n = 30000;
    
    System.out.print("Generiranje s pomočjo razreda String: ");
    long zacetek = System.currentTimeMillis();        
      String r1 = getDolgString(n);
    long konec = System.currentTimeMillis();
    System.out.println((konec-zacetek) + "ms");
    
    System.out.print("Generiranje s pomočjo razreda StringBuffer: ");
    zacetek = System.currentTimeMillis();    
      String r2 = getDolgStringIzStringBufferja(n);
    konec = System.currentTimeMillis();
    System.out.println((konec-zacetek) + "ms");

  }
  
}
