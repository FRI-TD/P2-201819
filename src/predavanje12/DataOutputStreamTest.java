package predavanje12;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author tomaz
 */
public class DataOutputStreamTest {
  
  public static void main(String[] args) {
    try {
      
      File f = new File("viri/podatki");  
      FileOutputStream fos = new FileOutputStream(f);
      DataOutputStream dos = new DataOutputStream(fos);
      
      dos.writeInt(32);
      dos.writeByte(32);
      dos.writeShort(32);
      dos.writeChar('A');
      dos.writeUTF("Besedilo");
      
      dos.close();
      
    } catch (Exception e) {
      System.out.println("Napaka pri pisanju v datoteko");
    }
  }

}
