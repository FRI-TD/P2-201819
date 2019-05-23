package predavanje12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Prenos dokumenta z internetnega naslova - uporaba razreda URL in Scanner 
 * @author tomaz
 */
public class Vreme {

  public static void main(String[] args) {
    String mesto = "Postojna";
    String beginMarker = "<td class=\"t\">";
    String endMarker   = "</td>";
    
    try {
      // povezava z internetnim naslovom ...
      URL url = new URL("https://meteo.arso.gov.si/uploads/probase/www/observ/surface/text/sl/observation_si_latest.html");
      // ... in odpiranje "toka podatkov" 
      Scanner sc = new Scanner(url.openStream()); 
      while (sc.hasNextLine()) {
        // datoteko beremo "vrstico po vrstici" ...
        String vrstica = sc.nextLine();
        // .. in obdelamo tisto vrstico, ki vsebuje podatek o mestu, ki nas zanima
        if (vrstica.contains(">"+mesto+"<")) {
          int kje = vrstica.indexOf(beginMarker);
          int kjeKonec = vrstica.indexOf(endMarker, kje);
          System.out.println(vrstica.substring(kje+beginMarker.length(), kjeKonec));
        }
      }
      sc.close();
    } catch (MalformedURLException e) {
      System.out.println("Napaka: " + e.toString());
    } catch (IOException ioe) {
      System.out.println("Napaka IO: " + ioe.toString());
    }
  }
  
}
