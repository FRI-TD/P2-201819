package predavanje9;

import predavanje8.*;

/**
 *
 * @author tomaz
 */
public class Rastlina extends Object {
  // statičen atribut - ima enako vrednost v vseh objektih (ker je to atribut razreda)
  static int ID = 0;  // največja oznaka rastline
  
  // atributi razreda Rastlina; ker spodnji atributi niso statični, 
  // bo vsak objekt razreda Rastlina imel svojega 
  String oznaka;      // oznaka rasline
  int    starost;     // starost (v mesecih)
  private int    velikost;    // visina (v centimetrih)
  int mojaID;         // enolična oznaka objekta
  
  // privzeta vrednost za mesecno rast
  int rastMladaRastlina = 3;  // prve pol let
  int rastStaraRastlina = 1;  // kasneje
    
  // privzet konstruktor
  Rastlina() {
    ID = ID + 1;   // povecam števec izdelanih rastlin
    mojaID = ID;
    
    // nastavim privzete vrednosti atributov
    oznaka   = "?";
    starost  = 0;
    velikost = 0;
  }
  
  Rastlina(String oznaka, int starost, int velikost) {
    // klic privzetega konstruktorja
    this();
    
    this.oznaka   = oznaka;
    this.starost  = starost;
    this.velikost = velikost;
  }
  
  Rastlina(String oznaka) {
    this(oznaka, 0, 0);
  }
  
  public int getVelikost() {
    return velikost;
  }
  public void setVelikost(int novaVelikost) {
    this.velikost = novaVelikost;
    
    this.starost = novaVelikost % 3;
  }
  
  
  int mesecnaRast() {
    if (this.starost <= 6)
      return this.rastMladaRastlina;
    else
      return this.rastStaraRastlina;
  }
  
  void novMesec() {
    this.starost  = this.starost + 1;               // rastlina se postara za 1 mesec
    this.velikost = this.velikost + mesecnaRast();  // rastlina zraste za ... cm
  }

  void nastviOznako(String oznaka) {
    this.oznaka = oznaka;
  }
  
  void izpisiPodatke() {
    System.out.printf("%c %s, starost: %d, velikost: ", 'ꕤ', oznaka, starost);
    for (int i = 0; i <= velikost / 10; i++) {
      System.out.print(".");
    }
    System.out.println();
  }
  
  static void izpisiNavodilaZaObrezovanje() {
    System.out.println("Rastline se obrezuje spomlad....");
  }

  @Override
  public String toString() {
    return String.format("Moja oznaka: %s, moj id: %d", oznaka, mojaID);
  }
  
  
}
