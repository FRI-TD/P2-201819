package predavanje3;


import java.util.Scanner;

/**
 * Demonstracija osnovnega branja iz tipkovnice
 * @author tomaz
 */
public class Pozdrav {
  public static void main(String[] args) {
    String ime;
    
    System.out.print("Vpiši ime: ");
    
    Scanner sc = new Scanner(System.in); // se povezem s tipkovnico
    ime = sc.nextLine();                 // preberem ime iz tipkovnice
    
    System.out.println("Pozdravljen, " + ime);
    
    System.out.print("Vpiši starost: ");
    int starost = sc.nextInt();          // preberem starost iz tipkovnice
    System.out.println("Olala, a res že "+ starost);
  }
}
