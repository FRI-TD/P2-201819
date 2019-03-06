package predavanje2;



/**
 * Program izpiše vse argumente, s katerimi je bil pognan
 * @author tomaz
 */
public class Args {
  public static void main(String[] args) {
    // stevilo argumentov dobimo z "args.length"
    System.out.println("Stevilo argumentov: " + args.length);
    
    // arguemnti so args[0], args[1], ..., args[args.length-1]
    for (int i = 0; i < args.length; i++) {
      System.out.printf("Argument %d: %s\n", i+1, args[i]);
    }
  }
}
