package predavanje11;

/**
 * Razred država - hrani podatke o eni državi (kratica, glavno mesto, število prebivalcev).
 * @author tomaz
 */
public class Drzava implements Comparable<Drzava> {

  private String kratica;
  private String glavnoMesto;
  private int steviloPrebivalcev;

  public Drzava(String kratica, String glavnoMesto, int steviloPrebivalcev) {
    this.kratica = kratica;
    this.glavnoMesto = glavnoMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  // Metodo potrebujem, če želim, na primer, objekt razreda
  // Drzava izpisati na zaslon v lepi obliki
  public String toString() {
    return String.format("Drzava: %s, Glavno mesto: %s, Prebivalci: %d", kratica, glavnoMesto, steviloPrebivalcev);
  }

  // Če želim objekte razreda Drzava urejati, mora Drzava implementirati 
  // vmesnik Comparable (to je, v razredu Drzava mora biti definirana
  // metoda compareTo, ki zna primerjati dva objekta razreda.
  public int compareTo(Drzava o) {
    // urejanje po stevilu prebivalecv
    //return this.steviloPrebivalcev - o.steviloPrebivalcev;
    
    // urejenja po abacednem redu
    return this.glavnoMesto.compareTo(o.glavnoMesto);
  }
  
  
  

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public int getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(int steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }
  
  
  
}
