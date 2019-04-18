
import java.awt.Color;
import java.util.Random;



/**
 * Primeri slabe kode (in popravki), ki ste jo uporabili pri reševanju DN07. 
 * @author tomaz
 */
public class DN07 {

  public static void main(String[] args) {
    StdDraw.setScale(-100, 100);
    for (int n = 0; n < 100; n++) {
      Random rand = new Random();
      //!!
      int velikost = rand.nextInt(30);
      int w = rand.nextInt(100 + 1 + 100) - 100;
      int e = rand.nextInt(100 + 1 + 100) - 100;
      int r = rand.nextInt(8);
      narisiRozo(w, e, r, velikost);
    }
  }

  static void narisiRozo(int x, int y, int b, int v) {
    StdDraw.setPenColor(Color.green);
    StdDraw.line(x, y, x, y + v + v);
    StdDraw.setPenColor(Color.yellow);
    StdDraw.filledCircle(x, y + v + v, v);
    y = y + v + v;
    
    Color[] barve = { Color.green,     Color.red,     Color.blue,     Color.black,     Color.white,     Color.yellow,     Color.pink,     Color.gray};
    Color barva = barve[b];
    
    StdDraw.filledCircle(x + v, y + v, v);
    StdDraw.filledCircle(x - v, y + v, v);
    StdDraw.filledCircle(x + v, y - v, v);
    StdDraw.filledCircle(x - v, y - v, v);
  }

  static void risi() {
    int min = -100;
    int max = 100;

    for (int i = 0; i < 100; i++) {
      Random rnx = new Random();
      
      int x = rnx.nextInt(max - min) + min;
      int y = rnx.nextInt(max - min) + min;
      int v = rnx.nextInt(80);
      int R = rnx.nextInt(255);
      int G = rnx.nextInt(255);
      int B = rnx.nextInt(255);
      Color b = new Color(R, G, B);
      narisiRozo(x, y, B, v);
    }
  }
  
  
  static void izrisi(int x, int y, String b, int v){
        int debelina=v;
        StdDraw.setScale(-100, 100);
        
       
        int min=-90;
        int max=90;
        Random rand = new Random();
        
        //StdDraw.clear(new Color(255,255,255));
        StdDraw.setPenColor(Color.green);
        StdDraw.setPenRadius(0.01);
        StdDraw.line(x, y-debelina*5, x, y);
        if     (b.equals("BLACK")){StdDraw.setPenColor(StdDraw.BLACK);}
        else if(b.equals("BLUE")){StdDraw.setPenColor(StdDraw.BLUE);}
        else if(b.equals("CYAN")){StdDraw.setPenColor(StdDraw.CYAN);}
        else if(b.equals("DARK_GREY")){StdDraw.setPenColor(StdDraw.DARK_GRAY);}
        else if(b.equals("GRAY")){StdDraw.setPenColor(StdDraw.GRAY);}
        else if(b.equals("GREEN")){StdDraw.setPenColor(StdDraw.GREEN);}
        else if(b.equals("LIGHT_GRAY")){StdDraw.setPenColor(StdDraw.LIGHT_GRAY);}
        else if(b.equals("MAGENTA")){StdDraw.setPenColor(StdDraw.MAGENTA);}
    }
  
}
