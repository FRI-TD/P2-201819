package predavanje11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Program dneve v tednu shrani v MNOŽICO (Set)
 * @author tomaz
 */
public class Dnevi {
  
  public static void main(String[] args) {
    Set<String> dnevi = new TreeSet();
    
    dnevi.add("Ponedeljek");
    dnevi.add("Torek");
    dnevi.add("Sreda");
    dnevi.add("Sreda");   // večkratno dodajanje ne vpliva na vsebino ...
    dnevi.add("Sreda");   // .. v množici bo kljub temu le ena "Sreda"
    dnevi.add("Sreda");    
    dnevi.add("Cetrtek");
    dnevi.add("Petek");
    
    // do elementov množice ne morem dostopati preko indeksa
    // (izraz "i-ti element množice" je nesmisel)
    //System.out.println(dnevi.get(0));

    
    // uporaba metod size() in contains()
    System.out.println("Število dni v tednu: " + dnevi.size());
    System.out.println("Ali je Ponedeljek dan v tednu? " + dnevi.contains("Ponedeljek"));
        System.out.println("Ali je Bla dan v tednu? " + dnevi.contains("Bla"));
        
    // izpis vseh elementov množicve s pomočjo iteratorja
    System.out.println();
    System.out.println("Dnevi tedna:");
    Iterator<String> it = dnevi.iterator();
    // iteartor uporabljam podobno kot Scanner za branje datoteke - metodi hasNext() in next()
    while (it.hasNext()) {
      String dan = it.next();
      System.out.println(dan);
      // s pomočjo iteratorja lahko elemente tudi brišem
      if (dan.equals("Ponedeljek")) it.remove();
    }
    
    // izpis vseh elementov množice s pomočjo "foreach" zanke
    System.out.println("Še enkrat:");
    for (String dan : dnevi) {
      System.out.println(dan);
    }
  }
}
