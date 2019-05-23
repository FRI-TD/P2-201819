package predavanje12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author tomaz
 */
public class DataInputStreamTest {
  
  public static void main(String[] args) {
    try {
      
      File f = new File("viri/podatki");  
      FileInputStream fos = new FileInputStream(f);
      DataInputStream dis = new DataInputStream(fos);
      
//      int a = dis.readInt();
//      System.out.println(a);
//      byte b = dis.readByte();
//      short c = dis.readShort();
//      char d = dis.readChar();
//      String s = dis.readUTF();
//      System.out.println(s);

      dis.readShort();
      int b = dis.readInt();
      System.out.println(b);

      dis.close();
      
    } catch (Exception e) {
      System.out.println("Napaka pri pisanju v datoteko");
    }
  }

}
