package predavanje5;

import java.io.File;
import java.util.Scanner;

/**
 * Primer branja datoteke z enim samim ukazom
 * @author tomaz
 */
public class BeriDatoteko {
 public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/passwd"));
    // s tem ukazom scannerju narocimo, naj kot "besedo" razume vse
    // od začetka do konca datoteke
    sc.useDelimiter("\\Z");    
    // datoteko sedaj preberemo z enim samim ukazom
    String vsebina = sc.next();    
    sc.close();    
    
    System.out.println(vsebina);
  }

}


