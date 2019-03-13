package predavanje3;

/**
 * Demonstracija pretvorbe iz String v int
 * @author tomaz
 */
public class Racunalo {
  
  public static void main(String[] args) {
    // pri izpisu args[0]+args[1] dobim stik dveh nizov ("13"+"7"="137")
    System.out.println(args[0] + "+" + args[1] + "=" + args[0]+args[1]);
    System.out.printf("%s + %s = %s\n", args[0], args[1], args[0]+args[1]);
    
    
    // če želim dejansko sešteti 13+7, moram nize pretvoriti v števila
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    // sedaj bo (a+b) enak vsoti števil 13 in 7 (13+7=20)
    System.out.println(args[0] + "+" + args[1] + "=" + (a+b));    
    System.out.printf("%s + %s = %d\n", args[0], args[1], a+b);
  }

}
