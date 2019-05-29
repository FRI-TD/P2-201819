package predavanje13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Računanje cene sladoleda.
 * 
 * Glavno okno programa vsebuje dve vpisni polji, v katera uporabnik vpiše 
 * ceno ene kepice in število kepic, program pa ob pritisku na gumb "Racunaj"
 * izračuna skupno ceno naročila.
 * 
 * Komponente so na oknu razporejene z absolutnim pozicioniranjem - za vsako komponento
 * povemo položaj (x in y koordinato) ter velikot (širino in višino).
 * @author tomaz
 */
public class Sladoled {

  public static void main(String[] args) {
    JFrame okno = new JFrame("Sladoled");
    okno.setSize(250, 140);
    okno.setLocation(500, 500);

    JPanel p = new JPanel();
    
    // s tem izklopim vse razporejevalnike na panelu p, 
    // komponente na njem bodo pozicionirane absolutno
    p.setLayout(null);       

    // vsako komponento najprej naredim ...
    JLabel l1 = new JLabel("Cena kepice");
    // ... nato povem, kje na formi naj se nahaja
    l1.setBounds(10, 10, 100, 20);
    p.add(l1);

    JLabel l2 = new JLabel("Število kepic");
    l2.setBounds(10, 40, 100, 20);
    p.add(l2);

    JButton gumb = new JButton("Računaj");
    gumb.setBounds(10, 70, 100, 20);
    p.add(gumb);

    JTextField cenaTF = new JTextField();
    cenaTF.setBounds(130, 10, 100, 20);
    p.add(cenaTF);

    JTextField steviloTF = new JTextField();
    steviloTF.setBounds(130, 40, 100, 20);
    p.add(steviloTF);

    JTextField skupajTF = new JTextField();
    skupajTF.setBounds(130, 70, 100, 20);
    p.add(skupajTF);

    // na gumb "Računaj" dodam poslušalca - ko bo uporabnik 
    // pritisnil ta gumb, se bo poklicala metoda actionPerformed()
    gumb.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e) {
        // obe kontroli najprej pobarvam v belo (ker pomeni: ni napake)
        cenaTF.setBackground(Color.white);
        steviloTF.setBackground(Color.white);

        int cena = 0, stevilo = 0;
        try {
          // pretvorba podatka iz String v int
          cena = Integer.parseInt(cenaTF.getText());
        } catch (Exception ex) {
          // če pride pri pretvorbi do napake, komponento obarvam rdeče
          skupajTF.setText("Napaka");
          cenaTF.setBackground(Color.red);
          return;
        }
        try {
          stevilo = Integer.parseInt(steviloTF.getText());
        } catch (Exception ex) {
          skupajTF.setText("Napaka");
          steviloTF.setBackground(Color.red);
          return;
        }

        // če pridem do sem, ni bilo napake (sicer bi metodo koncal z enim od "return")
        // v skupajTF zapišem rezultat
        skupajTF.setText(Integer.toString(cena * stevilo));
      }
    });

    okno.add(p);
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
