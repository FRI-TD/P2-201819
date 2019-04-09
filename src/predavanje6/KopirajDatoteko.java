package predavanje6;

import java.io.File;

/**
 * Demonstracija uporabe zunanje knjižnice - za kopiranje datotek uporabimo metod copyFile, 
 * ki je deklarirana v razredu org.apache.commons.io.FileUtils.
 * 
 * - na internetu poiščemo knjižnico commons-io (glej https://commons.apache.org/proper/commons-io/download_io.cgi)
 * - jar datoteko (commons-io-2.6.jar) dodamo v Netbeans projekt (Libraries / Add AJR/folder)
 * 
 * @author tomaz
 */
public class KopirajDatoteko {
  
  public static void main(String[] args) throws Exception {
    
    org.apache.commons.io.FileUtils.copyFile(new File("viri/passwd"), new File("viri/b.txt"));
        
  }

}
