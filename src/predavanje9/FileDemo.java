package predavanje9;

import java.io.File;

/**
 * Demonstracija uporabe razreda File
 * @author tomaz
 */
public class FileDemo {
  public static void main(String[] args) {
    // objekt razreda File uporabim za "sklicevanje" na datoteko ...
    File f1 = new File("/delo/datoteka.txt");
    System.out.println(f1.exists()); 
    
    // ... ali na mapo (folder)
    File f2 = new File("/delo");
    System.out.println(f2.canWrite());
    
    // f1 je datoteka, zato bo isDirectory()==false ...
    System.out.println(f1.isDirectory());
    // ... f2 pa je mapa, zato bo isDirectory()==true
    System.out.println(f2.isDirectory());
    
    // s File se lahko sklicujem tudi na neobstoječo mapo ali datoteko ...
    File f3 = new File("/delo/test/p2");
    // ... ki jo potem z ukazom mkdir() ali mkdirs() ustvarim
    boolean jeUspelo = f3.mkdirs();
    System.out.println(jeUspelo);
  }
}
