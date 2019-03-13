package predavanje3;

import java.util.Scanner;

/**
 * Program za računanje povprečja vpisanih ocen. 
 * 
 * Podrobneje: program na zaslon izpiše besedilo 
 * 
 * Vpiši oceno:  
 * 
 * in počaka, da uporabnik vpiše oceno in pritisne tipko Enter.  
 * Vpisano oceno naj program prebere in jo prišteje  vsoti  vseh 
 * prebranih ocen. Ta postopek naj se ponavlja, dokler uporabnik 
 * ne vpiše ocene 0. Takrat naj program izračuna povprečje 
 * vpisanih ocen in ga izpiše.

 * @author tomaz
 */
public class Ocene {
  
  public static void main(String[] args) {
    // objekt sc povežem s tipkovnico
    Scanner sc = new Scanner(System.in);
    
    int stOcen = 0; // koliko ocen sem prebral
    int vsota  = 0; // vsota vseh prebranih ocen

    int ocena = 0; // trenutna ocena
    do {
      System.out.print("Vpiši oceno: ");
      // preberem naslednjo vpsano oceno
      ocena = sc.nextInt();
      
      if (ocena != 0) {
        vsota = vsota + ocena;
        stOcen++;
      }
    } while (ocena != 0);
    
    if (stOcen == 0) { // preverim, da preprečim deljenje z nič
      System.out.println("Ok.");
    } else {
      // če sta oba operatorja celi števili, potem je / celoštevilsko deljenje
      // če želim, da deljenje ne bo celoštevilsko, moram enega od operatorjev
      // spremeniti v realno število; to naredim tako, da ga pomnožim z 1.0.
      System.out.printf("Povprecje: %.2f\n", 1.0 * vsota / stOcen);
    }
    
  }

}
