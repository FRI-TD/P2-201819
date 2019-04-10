package predavanje7;

/**
 *
 * @author tomaz
 */
public class TestKodiranja {
  
  public static void main(String[] args) {
    // iz paketa predvanje7 ne morem uporabiti spremenljivke predavanje6.Kodiranje.zamik, saj se 
    // razred Kodiranje nahaja v drugem paketu; če bi želel to spremenljivko uporabiti tudi v drugih 
    // razredih, bi morala biti deklarirana kot "public"
    System.out.println(predavanje6.Kodiranje.zamik);
  }

}
