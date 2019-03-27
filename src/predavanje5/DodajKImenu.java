package predavanje5;

/**
 *
 * @author tomaz
 */
public class DodajKImenu {
  
  // Metoda doda dodatek k imenu datoteke. Primer:
  // "imeDatoteke.txt" + "CRC" -> "imeDatotekeCRC.txt"
  static String dodaj(String imeDatoteke, String dodatek) {
    StringBuffer sb = new StringBuffer(imeDatoteke);
    // kje se v imenu datoteke nahaja pika
    int i = sb.indexOf(".");
    if (i == -1)
      return imeDatoteke + dodatek;
    else 
      // na mesto pred piko vrinem (insert) dodatni niz
      return sb.insert(i, dodatek).toString();        
  }
  
  public static void main(String[] args) {
    System.out.println(dodaj("imeDatoteke.txt", "CRC"));
  }

}
