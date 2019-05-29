package predavanje13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;


// Razred MojPoslusalec implementira vmesnik ActionListener (to pomeni, da je v njem
// definirana matoda actionPerformed) in ga lahko uporabim kot poslušalca za
// dogodek tipa Action; glaj spodaj pri klicu metode addActionListener na gumbu okGumb.
class MojPoslusalec implements ActionListener {
  public void actionPerformed(ActionEvent e) {    
    JFileChooser jfc = new JFileChooser();
    int razultat = jfc.showOpenDialog(null);
    if (razultat == JFileChooser.CANCEL_OPTION)
      System.out.println("Preklic izbire datoteke");
    else
      System.out.println(jfc.getSelectedFile().getAbsolutePath());
  }
}
/**
 * Demonstracija BorderLayout razporejevalnika, registracije poslušalca in
 * uporabe FIleChooserja in ColorPickerja.
 * @author tomaz
 */
public class BorderLayoutTest {
public static void main(String[] args) {
    JFrame okno = new JFrame("Moje prvo okno");
    okno.setSize(600,300);
    okno.setLocation(500,500);

    //okno.setLayout(new BorderLayout(10,10)); 
    
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    okno.add(jsp);
    
    JButton okGumb = new JButton("Prebrskaj...");
    //na OK gumb dodam poslušalca: ob vsakem pritisku na ta gumb, se bo klicala
    // metoda actionPerformed razreda MojPoslusalec.
    okGumb.addActionListener(new MojPoslusalec());
         
    JButton konecGumb = new JButton("Zapri");
    // veliko bolj priročno kot zgornji način (kjer smo definirali samostojen razred
    // MojPoslusalec in ga dodali gumbu okGumb z new MojPoslusalec()) je, da poslušalca 
    // definiramo na mestu, kjer ga potrebujemo. V ta nemen napišemo "anonimni notranji
    // razred" in v njem metodo actionPerformed.
    konecGumb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // ob kliku na konecGUmb, se bo program končal
        System.exit(0);
      }
    });
    
    // na komponento jta (JTextArea) dodam poslušalca: ob vsakem premiku miške
    // po tej komponenti, se bo na jta izpisala koordinata položaja miške
    jta.addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jta.append(String.format("(%d,%d)\n", e.getX(), e.getY()));
       }      
    });
    
    JButton barveGumb = new JButton("Barve");
    barveGumb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // odpren dialog za izbiro barv; po zaprtju dialoga izbrano barvo
        // "prenesem" v jta - vpisno področje obarvam z izbrano barvo
        Color barva = JColorChooser.showDialog(null, "Izberi barvo", Color.yellow);    
        jta.setBackground(barva);
      }
    });
    
    JButton imeGumb = new JButton("Vpiši ime...");
    imeGumb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // odprem dialog za vnos vsebine; vpisano vsebino zapišem v jta
        String ime = JOptionPane.showInputDialog(this, "Vpisi ime");
        jta.setText(ime);
      }
    });
        
    
    JPanel gumbiPanel = new JPanel();
    gumbiPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    gumbiPanel.add(okGumb);
    gumbiPanel.add(konecGumb);
    gumbiPanel.add(imeGumb);
    gumbiPanel.add(barveGumb);
    
    okno.add(gumbiPanel, BorderLayout.PAGE_END);
                
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
