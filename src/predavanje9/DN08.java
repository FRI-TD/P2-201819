package predavanje9;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class DN08 {

  public static void main(String[] args) throws Exception {
    // za lazje testiranje na začetku napolnim tabelo args
    args = new String[]{"viri/planeti.txt", "Jupiter"};
    
    Planet [] planeti = new Planet[9];
    int i = 0;
    
    // če vem, v kakšnem formatu je zakodirana vhodna datoteka, format (npr. UTF-8)
    // podam kot drugi argument pri klicu konstruktorja razreda Scanner
    Scanner sc = new Scanner(new File(args[0]), "UTF-8");
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String [] deli = vrstica.split(":");
      
      if (deli.length == 2) {
        planeti[i] = new Planet();
        planeti[i].ime = deli[0];
        planeti[i].radij = Integer.parseInt(deli[1]);
        i=i+1;
      }
    }
    sc.close();
    
    String poizvedba = args[1];                 
    String [] deliPoizvedba = poizvedba.split("[+]+");  //"Zemlja+Mars++Jupiter" -> {"Zemlja","Mars","Jupiter"}
    double vsota = 0;
    for(int k=0; k<deliPoizvedba.length; k++) { // sprehod po vseh poizvedbah
      int p = -1;
      for (int j = 0; j < i; j++) { // sprehod po vseh planetih
        if (planeti[j].ime.equalsIgnoreCase(deliPoizvedba[k])) p=j;
        // namesto equalsIgnoreCase lahko primerjavo naredim tudi ročno takole:
        //if (planeti[j].ime.toLowerCase().equals(deliPoizvedba[k].toLowerCase())) p=j;
      }
      if (p!=-1){
        vsota += planeti[p].povrsina();
      } 
    }
    System.out.printf("Povrsina planetov \"%s\" je %.0f milijonov km2\n", poizvedba, vsota/1000000);
  }
}