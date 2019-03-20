package predavanje4;

/**
 *
 * @author tomaz
 */
public class Dvojisko1 {
  
  static String vDvojisko(int x) {
    String rezultat = "";
    while (x>0) {
//    if ((x & 1) == 1) {
//      rezultat = "1" + rezultat;        
//    } else {
//      rezultat = "0" + rezultat;        
//    }
// namesto na dolg (koda zgoraj), lahko to isto naredimo na 
// kratek način z uporabo operatorja ?:(koda spodaj)
      rezultat = ((x & 1) == 1 ? "1" : "0") + rezultat;      


      x = x >> 1;
    }

//  if (rezultat.isEmpty()) 
//    return "0";
//  else 
//    return rezultat;
// namesto na dolg (koda zgoraj), lahko to isto naredimo na 
// kratek način z uporabo operatorja ?: (koda spodaj)
    return (rezultat.isEmpty() ? "0" : rezultat);
  }
  
  static int vDesetisko(String x) {
    int rezultat = 0;
    
    int bit = 1;
    for(int i = x.length()-1; i>=0; i--) {
      if (x.charAt(i) == '1') {
        rezultat += bit;
      }
      bit = bit << 1; 
    }
    
    return rezultat;
  } 

  public static void main(String[] args) {
    int x = 0;
    String xPoDvojisko = vDvojisko(x);
    
    System.out.println(vDesetisko(xPoDvojisko));
  }
}
