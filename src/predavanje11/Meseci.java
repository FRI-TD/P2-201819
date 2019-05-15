package predavanje11;

import java.util.HashMap;
import java.util.Map;

/**
 * Program mesece v letu in število njihovih dni hrani v slovarju (ključ je ime meseca, 
 * vrednost pa število dni). 
 * @author tomaz
 */
public class Meseci {
  public static void main(String[] args) {
    Map<String, Integer> meseci = new HashMap();
    
    meseci.put("Jan", 31);
    meseci.put("Feb", 28);
    meseci.put("Mar", 31);
    meseci.put("Apr", 30);
    meseci.put("Maj", 31);
    
    // v slovar lahko večkrat dodajam z istim ključem; 
    // v slovarju ostane le zadnja vrednost (v tem primeru 365, 28 se pobriše)
    meseci.put("Feb", 365);
    
    System.out.printf("Število mmesecev: %d\n", meseci.size());
    
    // uporaba metode containsKey()
    String mesec = "Feb";    
    if (meseci.containsKey(mesec))
      System.out.printf("Število dni v mesecu %s je %d\n", mesec, meseci.get(mesec));
    else
      System.out.printf("Mesec %s ne obstaja\n", mesec);
   
    // uporaba metode containsValue()
    int v = 27;
    System.out.println("Ali obstaja mesec z "+v+" dnevi? " + meseci.containsValue(v));

    // izpis vseh ključev ...    
    System.out.println("Ključi: " + meseci.keySet());
    // ... in vrednosti
    System.out.println("Vrednosti: " + meseci.values());
  }
}
