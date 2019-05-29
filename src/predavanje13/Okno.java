package predavanje13;

import java.awt.Color;
import javax.swing.*;

/**
 * Izdelava preprostega okna (JFrame).
 * Na okno dodamo eno samo komponento - uokvirjeno odlagalno površino (JPanel)
 * @author tomaz
 */
public class Okno {
  
  public static void main(String[] args) {
    JFrame okno = new JFrame("Moje prvo okno");
    okno.setSize(300,300);
    okno.setLocation(500,500);
    okno.setResizable(true);
    
    // "odlagalno površino" - JPanel ...
    JPanel p = new JPanel();
    // ... obarvam rumeno ...
    p.setBackground(Color.yellow);        
    // ... jo oukvirim ...
    p.setBorder(BorderFactory.createTitledBorder("Naslov okvirja"));
    // ... in dodam na formo
    okno.add(p);
       
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }

}
