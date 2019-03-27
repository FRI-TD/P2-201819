package predavanje5;

/**
 * Razbitje niza s pomočjo metode split
 * @author tomaz
 */
public class SplitDemo {
  
  public static void main(String[] args) {
    String vrstica = "Micka Gleda  Sonce";
    // ce je locilo lahko "en ali več presledkov", za 
    // locilo uporabim " +"
    String[] deliVrstice = vrstica.split(" +");
    
    for (int i = 0; i < deliVrstice.length; i++) {
      System.out.println(deliVrstice[i]);
    }
    
    
    vrstica = "A.B.C";
    // če je ločilo pika, potem to zapišem kot "[.]"
    deliVrstice = vrstica.split("[.]");
    
    for (int i = 0; i < deliVrstice.length; i++) {
      System.out.println(deliVrstice[i]);
    }    
  }

}
