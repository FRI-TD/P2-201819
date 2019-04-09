package predavanje6;

/**
 *
 * @author tomaz
 */
public class Switch {
  public static void main(String[] args) {
     int ocena = 7;
     
     
//     if (ocena == 10) {
//       System.out.println("Odlično");
//     } else if (ocena == 9 || ocena == 8) {
//       System.out.println("Prav dobro");
//     } else if (ocena == 7) {
//       System.out.println("Dobro");
//     } else if (ocena == 6) {
//       System.out.println("Zadostno");
//     } else {
//       System.out.println("Nezadostno");
//     }
     
// namesto zgornje "verige" if stavkov lahko uporabimo switch,
// kar naredi prgram bolj pregleden

     switch (ocena) {
       case 10: 
         System.out.println("Odlično");
         break; // obvezen break na koncu vsake veje
       case 9:
       case 8:
         System.out.println("Prav dobro");
         break;
       case 7:
         System.out.println("Dobro");
         break;
       case 6:
         System.out.println("Zadostno");
         break;
       default:
         System.out.println("Nezadostno");
     }
     
  }
}
