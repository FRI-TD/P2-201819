package predavanje2;

/**
 *
 * @author tomaz
 */
public class FormatiranIzpis {

  public static void main(String[] args) {
    // dvojni narekovaj (") je z<a nize, enojni (') pa za znake
    System.out.printf("Znaki: %c %10c %c \n", 'a', 'b', 65);
    
    System.out.printf("Cela stevila: %d %d %d\n", 15, 20, 245309934);
    System.out.printf("Stevilo: %7d\n", 15);
    System.out.printf("Stevilo: %7d\n", 323454);
    System.out.printf("Stevilo: %7d\n", 345);
    
    System.out.printf("Realna stevila: %10f \n", 3.14159);
    System.out.printf("Realna stevila: %10f \n", 32.4);
    System.out.printf("Realna stevila: %10f \n", 1.59);
    
    
    System.out.printf("Realna stevila: %10.2f \n", 3.14159);
    System.out.printf("Realna stevila: %10.2f \n", 32.4);
    System.out.printf("Realna stevila: %10.2f \n", 1.59);
    
    System.out.printf("Realna stevila: %f %.15f %e %E\n", Math.PI, Math.PI, Math.PI, Math.PI);
    System.out.printf("Realna stevila: %e\n", 123456789.12345);
    
    System.out.printf("Osmiški sistem: %o \n", 100);
    System.out.printf("Sestnajstiski sistem: %x %X \n", 255, 255);

  }
}
