package predavanje12;




class PraznaDatotekaException extends Exception {
  @Override
  public String getMessage() {
    return "Datoteka je prazna";
  }
}

/**
 * Podobno kot v razredu ObravnavaIzjem v je metodi preberiDatoteko() "nevarna"
 * koda zaprta v try blok; razlika: obravnavamo le eno izjemo (FileNotFoundException),
 * v primeru druge težave (deljenje z nič), pa sprožimo lastno izjemo (PraznaDatotekaException)
 * Ker je izjema tipa PraznaDatotekaException preverljiva, mora klicoča metoda 
 * primernu ukrepati (uporaba try bloka ali ukazxa throws). 
 * @author tomaz
 */
public class Izjema2 {

  static void preberiDatoteko() throws PraznaDatotekaException {
    try {
      java.util.Scanner sc = new java.util.Scanner(new java.io.File("viri/prazna"));
      
      int stVrstic=0;
      int celotnaDolzina = 0;
      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        stVrstic++;
        celotnaDolzina += vrstica.length();
      }        
      sc.close();
      
      if (stVrstic == 0)
        throw new PraznaDatotekaException();
      
      int povDolzina = celotnaDolzina/stVrstic;
      System.out.printf("Povprecna dolzina: %d\n", povDolzina);
    
    } catch (java.io.FileNotFoundException e) {
      System.out.println("Napaka - datoteka ne obstaja");
    } 
  }
    
  
  public static void main(String[] args) {
    try {
      preberiDatoteko();
    } catch (PraznaDatotekaException e) {
      System.out.println(e.toString());
    }
  }
}
