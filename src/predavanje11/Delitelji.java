package predavanje11;

import java.util.*;


/**
 * Program s pomocjo metode deliteji(a) ustvari množici
 * deliteljev dveh števil, nato pa izpiše skupne delitelje
 * (presek) in vse delitelje (unija) obeh števil
 * @author tomaz
 */
public class Delitelji {
  
  // Metoda vrne množico deliteljev stevila a
  static Set<Integer> delitelji(int a) {
    Set<Integer> result = new TreeSet<>();
    
    // pregledam vse možne kandidate - tista števila, ki
    // delijo a, dam v množico (ukaz add())
    for (int i = 1; i <= a/2; i++) {
      if (a % i == 0) result.add(i);
    }
    result.add(a); // dodam tudi a, saj a deli a
    return result;
  }
  
  public static void main(String[] args) {
    int a = 122;
    int b = 216;
            
    // pridobim delitelje števil a in b
    Set<Integer> da = delitelji(a);
    Set<Integer> db = delitelji(b);
    
    
    System.out.printf("Delitelji stevila %d so %s\n", a, da);
    System.out.printf("Delitelji stevila %d so %s\n", b, db);
    
    // unijo dobim z ukazom addAll() ...
    Set<Integer> vsi = new TreeSet();
    vsi.addAll(da);vsi.addAll(db);    
    System.out.printf("Vsi delitelji so %s\n", vsi);
    
    // ... presek pa z retainAll()
    Set<Integer> skupni = new TreeSet();
    skupni.addAll(da);
    skupni.retainAll(db);    
    System.out.printf("Skupni delitelji so %s\n", skupni);
    
  }

}
