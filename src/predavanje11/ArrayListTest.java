package predavanje11;

import java.util.ArrayList;

/**
 * Program, ki dneve tedna hrani v seznamu (ArrayList). Primerjava tega programa
 * s programom Dnevi (kjer so dnevi shranjeni v množici) pokaže glavne razlike med
 * množico in seznamom.
 * @author tomaz
 */
public class ArrayListTest {
  
  public static void main(String[] args) {
    ArrayList<String> dnevi = new ArrayList();
    
    // dneve v seznam dodajam z ukazom add (enako kot pri množici)
    dnevi.add("Ponedeljek");
    dnevi.add("Torek");
    dnevi.add("Sreda");
    dnevi.add("Sreda");  // večkratno dodajanje v seznam ima za posledico,
    dnevi.add("Sreda");  // da se v seznamu pojavi več sred (v tem primeru 4)
    dnevi.add("Sreda");    
    dnevi.add("Cetrtek");
    dnevi.add("Petek");
    
    System.out.println("Prvi dan tedna: " + dnevi.get(0));
    
    // v seznam lahko dodajam tudi na točno določeno mesto - v tem
    // primeru "Nedaljo" dodam na začetek seznama (ostali elementi se 
    // s tem pomaknejo eno mesto nižje v seznamu)
    dnevi.add(0, "Nedelja");
    // po dodajanju nedelje, prvi dan ni več ponedeljek!
    System.out.println("Prvi dan tedna: " + dnevi.get(0));

    // za sprehod po ArrayLČistu lahko uporabim foreach zanko
    for (String dan : dnevi) {
      System.out.println(dan);
    }
  }
}
