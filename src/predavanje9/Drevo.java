package predavanje9;

/**
 * Razred za prikaz koncepta razširjanja razredov. "Drevo extends Rastline" pomeni,
 * da je Drevo razred, ki ima vse lastnosti (atribute in metode) kot Rastlina. 
 * V deklaraciji Drevesa lahko spremenimo pomen obstoječih metod ali dodamo 
 * nove metode in atribute. Zato je Drevo "Rastlina s popravki in dodatki".
 * @author tomaz
 */
public class Drevo extends Rastlina {
  
  // dodamo atribut, ki ga v Rastlina nimamo
  int sirina; // sirina drevesa v cm
  
  // prazen konstruktor, ki olajša dedovanje (če tega konstruktorja ni, moram
  // v vsakem podrazredu definirati vsaj en konstruktor)
  Drevo() {}
  
  Drevo(String oznaka) {
    super(oznaka); // klic konstruktorja nadrazreda (Rastlina(oznaka))
  }

  @Override
  // metodo mesecnaRast() v Drevesu napišem povsem na 
  // novo (drugače kot pri Rastlini); če bom na objektu tipa
  // Drevo klical mesecnaRast(), se bo poklicala ta metoda
  // (in ne mesecnaRast(), ki je definirana v razredu Rastlina)
  int mesecnaRast() {
    int m = starost % 12;
    if (m ==2 || m==3 || m==4)
      return 10;
    else
      return 0;
  }

  // napišem lahko tudi nove metode, ki jih v Rastlini ni
  void rastVSirino() {
    sirina = sirina+1;
  }
  
  void strizenje() {
    sirina = sirina - 5;
  }
  
}
