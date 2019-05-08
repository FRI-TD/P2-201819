package predavanje10;

/**
 * Razred študent vsebuje podatke o enem študentu - ime, seznam ocen in status.
 * Status se računa na podlagi seznama ocen in ima vrednost "Odličen", če je 
 * povprečje ocen >= 9 oziroma "Dober" sicer. 
 * Da bi preprečili morebiten napačen poseg v vrednost atributa "status", smo 
 * ga skrili (private) in nastavljanje njegove vrednosti opravili v metodi 
 * dodajOceno().
 * 
 * @author tomaz
 */
class Student {
  private String ime;
  
  private int stOcen;
  private int[] ocene;
  
  private String status;
  
  Student(String ime) {
    this.ime = ime;
    
    stOcen = 0;
    ocene = new int[100];
    
    status = "?";
  }

  // dodajanje ocene; uporabnik lahko oceno doda samo z uporabo metode dodajOcena();
  // hkrati z dodajanjem ocene se osveži tudi status
  public void dodajOceno(int ocena) {
    this.ocene[stOcen++] = ocena;
    
    int sum=0;
    for (int i = 0; i < stOcen; i++) {
      sum += ocene[i];
    }    
    status = (sum / stOcen >= 9) ? "Odličen" : "Dober";
  }
  
  public String getStatus() {
    return status;        
  }
  
  @Override
  public String toString() {
    return String.format("%s, status: %s", this.ime, this.getStatus());
  }
  
  
}

/**
 *
 * @author tomaz
 */
public class Ocene {
  
  public static void main(String[] args) {
    Student s1 = new Student("Jože");
    s1.dodajOceno(10);
    s1.dodajOceno(9);
    s1.dodajOceno(10);
    System.out.println(s1.getStatus());
    System.out.println(s1.toString());
    
    Student s2 = new Student("Viktor");
    s2.dodajOceno(8);
    System.out.println(s2);
  }

}
