package predavanje13;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 * Demonstracija uporabe FlowLayout razporejevalnika - komponente, ki jih dodamo na
 * okno, ki ga nadzira FlowLayout razporejevalnik, se bodo razporedile v vrsto, 
 * oziroma, če bo v vrsti zmanjkalo prostora, v stolpce.
 * @author tomaz
 */
public class FlowLayoutTest {
public static void main(String[] args) {
    JFrame okno = new JFrame("Flow Layout test");
    okno.setSize(300,150);
    okno.setLocation(500,500);
    
    // komponente na oknu na razporeja razporejevalnik tipa FlowLayout,
    // komponente naj bodo poravnane na levi rob
    okno.setLayout(new FlowLayout(FlowLayout.LEFT)); 
    
    
    // ustvarim komponente ...
    JButton g1 = new JButton("Prvi");
    JButton g2 = new JButton("Drugi");
    JButton g3 = new JButton("Tretji");
    JButton g4 = new JButton("Četrti");
    JButton g5 = new JButton("Peti ");
    
    // ... in jih dodam na okno (razporejanje se pri tem opravi avtomatsko)
    okno.add(g1);
    okno.add(g2);
    okno.add(g3);
    okno.add(g4);
    okno.add(g5);
    
       
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
