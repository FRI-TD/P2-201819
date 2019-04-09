package predavanje6;

/**
 * Zbirka metod za kodiranje in dekodiranje (Cezarjeva šifra). 
 * Razred Kodiranje ne vsebuje metode main() in ga ne moremo 
 * pognati kot samostojen program. Metode kodiraj() in odkodiraj()
 * lahko uporabljamo v drugih programih.
 * 
 * @author tomaz
 */
public class Kodiranje {
  
  static final int zamik = 3;
  
  static String kodiraj(String niz) {
    StringBuffer result = new StringBuffer();
    
    for (int i = 0; i < niz.length(); i++) {
      char oZnak = niz.charAt(i);
      
      char nZnak = (char) ((oZnak - 'A' + zamik) % 26 + 'A');
      result.append(nZnak);
    }
    
    return result.toString();
  }
  
  static String odkodiraj(String niz) {
    StringBuffer result = new StringBuffer();
    
    for (int i = 0; i < niz.length(); i++) {
      char oZnak = niz.charAt(i);
      
      char nZnak = (char) ((26 + oZnak - 'A' - zamik) % 26 + 'A');
      result.append(nZnak);
    }
    
    return result.toString();
  }
  

}
