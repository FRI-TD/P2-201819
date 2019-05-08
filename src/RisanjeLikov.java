
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author tomaz
 */
public class RisanjeLikov {

  
  public static void main(String[] args) {
    StdDraw.setScale(-100,100);
    
    int stLikov = 0;
    Lik[] liki  = new Lik[100];

    liki[stLikov++] = new Krog(10, 10, 5, Color.red);    
    liki[stLikov++] = new Pravokotnik(50, 50, 20, 40, Color.blue);
    liki[stLikov++] = new Kvadrat(-30, -30, 40, Color.green);

    while (true) {
      StdDraw.clear(Color.white);
      
      if (StdDraw.mousePressed()) {
        double mouseX = StdDraw.mouseX();
        double mouseY = StdDraw.mouseY();
        
        if (!StdDraw.isKeyPressed(KeyEvent.VK_SHIFT))
          for (int i = 0; i < stLikov; i++) {
            liki[i].setSelected(false);
          }
        
        for (int i = 0; i < stLikov; i++) {
          if (liki[i].getMeje().contains(mouseX, mouseY))
            liki[i].setSelected(true);
        }
      }
     
      if (StdDraw.hasNextKeyTyped()) {
        char znak = StdDraw.nextKeyTyped();
        switch (znak) {
          case 'w':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isSelected())
                liki[i].premakni(0, 3);
            }
            break;
          case 's':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isSelected())              
                liki[i].premakni(0, -3);
            }
            break;
          case 'a':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isSelected())            
                liki[i].premakni(-3, 0);
            }
            break;
          case 'd':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isSelected())            
                liki[i].premakni(3, 0);
            }
            break;
        }
      }
     
      for (int i = 0; i < stLikov; i++) {
        liki[i].narisi();
        if (liki[i].isSelected())
          liki[i].narisiMeje();
      }
      
      StdDraw.show(100);
    }
  }
}
