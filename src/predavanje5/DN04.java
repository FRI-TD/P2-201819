package predavanje5;

import java.util.Locale;

/**
 * Se en način reševanja DN04. Osnovni princip: dve metodi: prvaBeseda() in ostanek() vrneta
 * (kot pove že njuno ime) prvo besedo danega niza in vse, kar ostane, če v nizu odrežemo 
 * prvo besedo. Z uporabo teh dveh metod geslo zlahka razbijemo na tri besede, nato le še
 * pogledamo, če so te besede vsebovane v tabelah prvaBeseda, drugaBeseda in tretjaBeseda.
 * @author tomaz
 */
public class DN04 {
  
  static String[] prvaBeseda   = {"Miha", "Micka", "Tone", "Lojze", "Mojca", "Pepca", "Franci", "Francka"};
  static String[] drugaBeseda  = {"Vozi", "Seka", "Potrebuje", "Gleda", "Barva", "Voha", "Lomi", "Popravlja"};
  static String[] tretjaBeseda = {"Kolo", "Avto", "Likalnik", "Sonce", "Vrtnico", "Drevo", "Lopato", "Sekiro"};

  // Metoda vrne true, če tabela vsebuje podano besedo
  static boolean vsebuje(String[] tabela, String beseda) {
    for (int i = 0; i < tabela.length; i++) {
      if (tabela[i].equals(beseda)) {
        return true;
      }
    }
    return false;
  }

  
  
  static String prvaBeseda(String niz) {
    if (niz.equals("")) 
      return ""; 
    
    int i=1;
        
    while (i < niz.length() && Character.isLowerCase(niz.charAt(i))) {
      i++;
    }
    return niz.substring(0, i);
  }
  
  static String ostanek(String niz) {
    if (niz.equals("")) 
      return ""; 
    
    int i=1;
        
    while (i < niz.length() && Character.isLowerCase(niz.charAt(i))) {
      i++;
    }
    return niz.substring(i);
  }
  
  public static void main(String[] args) {
    Locale.setDefault(new Locale("sl"));  
    
    String a = "3.3";
    a = a.replaceAll("[.]", ","); 
    
    
    System.out.println(a);
    
    args = new String[] {"MickaGledaSonce"};
    
    String geslo = args[0];
    String prva = prvaBeseda(geslo);
    geslo = ostanek(geslo);

    String druga = prvaBeseda(geslo);
    geslo = ostanek(geslo);
    
    String tretja = geslo;
    
    boolean gesloJePravo = 
      vsebuje(prvaBeseda, prva) && vsebuje(drugaBeseda, druga) && vsebuje(tretjaBeseda, tretja);
    
    System.out.println(gesloJePravo);    
  }

}
