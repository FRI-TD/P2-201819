package predavanje3;

/**
 *
 * @author tomaz
 */
public class DN02 {

  public static void main(String[] args) {
    // dodam za test delovanja (da lahko poganjam brez argumentov)
    args = new String[]{"To", "je", "poved", "iz", "šestih", "besed.", "Plus", "najdaljša."};

    if (args.length==0) return;
    
    // poiscem najdaljso besedo (okvir bo 4 znake 
    // sirsi od dolzine te besede)
    int najvecjaDolzina = args[0].length();  // Integer.MIN_VALUE;
    for (int i = 1; i < args.length; i++) {
      if (args[i].length() > najvecjaDolzina) 
        najvecjaDolzina = args[i].length();      
    }
    
    // niz sestavljen iz najvecjaDolzina+4 zvezdic
    String zvezdice = String.format("%"+(najvecjaDolzina+4)+"s", "").replaceAll(" ", "*");
    
    System.out.println(zvezdice);
    for (int i = 0; i < args.length; i++) {
      int levo  = (najvecjaDolzina - args[i].length())/2;
      int desno = (najvecjaDolzina - args[i].length()) - levo;
      String format = "*%"+(levo+1)+"s%s%"+(desno+1)+"s*\n";
      //System.out.print(format);
      System.out.printf(format, "", args[i], "");
    }
    System.out.println(zvezdice);    
  }
}