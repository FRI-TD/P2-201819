package predavanje11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

class MojPrimerjalnik implements Comparator<Integer> {
  public int compare(Integer o1, Integer o2) {
//    if (o1.intValue() == o2.intValue()) return 0;
//    if (o1.intValue() >  o2.intValue()) return -1;
//    else return 1;
    return o2-o1;
  }
}

/**
 * Urejanje različnih podatkov z javanskimi metodami sort
 * @author tomaz
 */
public class Urejanje {

  // Urejanje tabele celih števil
  static void celaStevila() {
    int[] stevila = {3,6,1,8,5,3,1,9};
    
    // za urejanje tabele, ki vsebuje primitivni tip
    // (int, byte, char, ....) uporabim metodo Arrays.sort
    Arrays.sort(stevila);
    
    // izpis tabele z enim samim ukazom:
    System.out.println(Arrays.toString(stevila)); 
    
    // izpis tabele s klasično zanko for
    for (int i = 0; i < stevila.length; i++) {
      System.out.print(stevila[i] + " ");
    }
    System.out.println("");
    
    // izpis tabele z zanko foreach
    for (int stevilo : stevila) {
      System.out.print(stevilo + " ");
    }
    System.out.println("");    
  }
  
  // Urejanje seznama (ArrayList) celih števil
  static void arrayList() {
    // Ustvarim seznam ...
    ArrayList<Integer> stevila = new ArrayList();
    // ... in vanj dodam števila
    stevila.add(3);stevila.add(6);stevila.add(1);
    stevila.add(8);stevila.add(5);stevila.add(3);
    stevila.add(1);stevila.add(9);
    
    // seznam uredim z metodo Collections.sort
    // Pri tem urejanju se uporabi privzet primerjalnik
    Collections.sort(stevila);
    
    // izpis seznama - klasična zanka for
    for (int i = 0; i < stevila.size(); i++) {
      System.out.print(stevila.get(i) + " ");
    }
    System.out.println("");
    
    // izpis seznama - zanka foreach
    for (int stevilo : stevila) {
      System.out.print(stevilo + " ");
    }
    System.out.println("");    
  }

  // Urejanje seznama števil z lastnim primerjalnikom
  static void arrayList2() {
    ArrayList<Integer> stevila = new ArrayList();
    stevila.add(3);stevila.add(6);stevila.add(1);
    stevila.add(8);stevila.add(5);stevila.add(3);
    stevila.add(1);stevila.add(9);
    
    // Pri klicu metode sort() podam primerjalnik, ki se bo 
    // uporabil za urejanje; od rezultata, ki ga vrača metoda
    // compare() tega primerjalnika, je odvisno, kako se bodo
    // elementi uredili
    // Primerjalnik definiram v razredu MojPrimerjalnik (glej zgoraj)
    Collections.sort(stevila, new MojPrimerjalnik());
        
    for (int stevilo : stevila) {
      System.out.print(stevilo + " ");
    }
    System.out.println("");    
  }  

  // Urejanje seznama s "priročnim" primerjalnikom (anonimni notranji razred)
  static void arrayList3() {
    ArrayList<Integer> stevila = new ArrayList();
    stevila.add(3);stevila.add(6);stevila.add(1);
    stevila.add(8);stevila.add(5);stevila.add(3);
    stevila.add(1);stevila.add(9);
    
    // Pri klicu metode sort() primerjalnik podam 
    // kot anonimni notranji razred
    Collections.sort(stevila, new Comparator<Integer>(){
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2-o1;
      }
    });
        
    for (int stevilo : stevila) {
      System.out.print(stevilo + " ");
    }
    System.out.println("");    
  }  
  
  
  static void drzave() throws Exception{
    // za branje drzav uporabim metodo preberiDrzave, ki smo jo 
    // napisali v razredu Tekmovanje
    Map<String, Drzava> drzave = Tekmovanje.preberiDrzave("viri/drzave.txt");
    
    // ustvarim seznam vseh držav (uporabim metodo drzave.values(), ki
    // vrne seznam, na podlagi katerega ustvarim ArrayList)
    ArrayList<Drzava> seznamDrzav = new ArrayList(drzave.values());
    // Če za urejanje uporabim metodo sort(), se uporabi
    // privzet primerjalnik (tisti, ki je z metodo compareTo() 
    // definiran v razredu Drzava).
    Collections.sort(seznamDrzav);
    
    for (Drzava drzava : seznamDrzav) {
      System.out.println(drzava);
    }
  }
  
  public static void main(String[] args)  throws Exception{
    //celaStevila();
    
    //arrayList();
    //arrayList2();
    //arrayList3();
    
    drzave();
  }
}
