package predavanje9;

import java.io.File;

/**
 * Program za demonstracijo izpisa vsebine podanega folderja
 * @author tomaz
 */
public class Ls {
  
  public static void main(String[] args) {
    args = new String[]{"/delo"};
    
    // z objektom f "pokažem" na mapo (katere ime je podano v pervem argumentu)
    File f = new File(args[0]);
    // z ukazom list() dobim seznam vseh datotek in map, ki se nahajajo v mapi f
    String[] vsebina = f.list();
    // "sprehod" po vseh mapah ...
    for (int i = 0; i < vsebina.length; i++) {      
      // ... ustvarim objekt, ki kaže na posamezno datoteko ...
      File trFile = new File(f, vsebina[i]);
      // ... in izpišem v obliki "-/d velikost ime" 
      System.out.printf("%c %10d %s\n", 
        (trFile.isDirectory() ? 'd' : '-'), trFile.length(), vsebina[i]);
    }
  }

}
