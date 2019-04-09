package predavanje6;

/**
 * Primer programa, ki je napisan v dveh razredih. Glavni program TestKodiranja 
 * v metodi main kliče metodi Kodiranje.kodiraj() in Kodiranje.odkodiraj(), ki 
 * sta deklarirani v razredu Kodiranje. Razred Kodiranje ne vsebuje metode main(), 
 * ker ni namenjen uporabi kot samostojni program (ampak nudi le metode, ki jih 
 * ostali programi lahko uporabijo).
 * 
 * @author tomaz
 */
public class TestKodiranja {
  
  public static void main(String[] args) {    
    
    String besedilo = "SREDA";
    
    // klic statične metode, deklarirane v razredu Kodiranje
    String kodirano = Kodiranje.kodiraj(besedilo);
    
    System.out.println(kodirano);
    
    
    String odkodirano = Kodiranje.odkodiraj(kodirano);
    System.out.println(odkodirano);    
  }

}
