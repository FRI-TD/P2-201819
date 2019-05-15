package predavanje11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author tomaz
 */
public class Tekmovanje {

  /**
   * Metoda prebere datoteko in ustvari slovar držav
   */  
  static Map<String, Drzava> preberiDrzave(String imeDatoteke) throws Exception {
    Map<String, Drzava> result = new HashMap();
    
    Scanner sc = new Scanner(new File(imeDatoteke));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":");
      String kratica = deli[0];
      String glMesto = deli[1];
      int prebivalci = Integer.parseInt(deli[2]);
      
      Drzava d  = new Drzava(kratica, glMesto, prebivalci);
      result.put(kratica, d);
      
    }    
    sc.close();
    
    return result;
  }
  
  public static void main(String[] args) throws Exception {
    Map<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");
    
    for (Drzava d : drzave.values()) {
      System.out.println(d);
    }
    
    System.out.println(drzave.keySet());
    
    Scanner tipkovnica = new Scanner(System.in);
    System.out.println("Vpiši kratico: ");
    String kratica = tipkovnica.nextLine();
    if (drzave.containsKey(kratica))
      System.out.println(drzave.get(kratica));
    else
      System.out.println("Ta drzava ne obstaja");
  }
  
}
