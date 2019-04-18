
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Risanje z uporabo razreeda StdDraw
 * @author tomaz
 */
public class Risanje {

  // Izris obeh diagonal  in dveh krogov
  static void izris1() {
    // nastavitev koordinatnega sistema
    StdDraw.setScale(-100, 100);

    StdDraw.line(-100, -100, 100, 100);
    StdDraw.line(-100, 100, 100, -100);
    StdDraw.circle(0, 0, 50);
    StdDraw.circle(0, 0, 100);
  }

  // tarča (10 rumenih krogov na črni podlagi)
  static void izris2() {
    StdDraw.setScale(-100, 100);
    
    // izbris celotne površine; za brisanje uporabi črno barvo
    StdDraw.clear(new Color(0, 0, 0));

    // debelina čopiča
    StdDraw.setPenColor(Color.yellow);
    for (int i = 0; i < 10; i++) {
      StdDraw.circle(0, 0, i * 10);
    }
  }

  // kvadratna spirala
  static void izris3() {
    StdDraw.setScale(-100, 100);

    // z izrisom začnem v točki (0,0)
    int x = 0;
    int y = 0;
    
    // na vsakem koraku se premaknem v eni štirih smeri
    int[][] smeri = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    int trSmer = 0;

    // premiki bodo vedno daljši; začnem s premikom dolžine 5, 
    // nato na vsakem koraku dolžino premika podaljšam za 5
    int trDolzina = 5;
    int deltaDolzina = 4;


    // izrišem 200 črt:
    for (int i = 0; i < 200; i++) {
      // nahajam se v (x,y), premaknil se bom v (nx, ny), ki je za trDolzina
      // odaljen od (x,y) in sicer v smeri trSmer
      int nx = x + trDolzina * smeri[trSmer][0];
      int ny = y + trDolzina * smeri[trSmer][1];

      StdDraw.line(x, y, nx, ny);

      x = nx;
      y = ny;

      // sprememba smeri: 0,1,2,3,0,1,2,3,0,1,2,3,0...
      trSmer = (trSmer + 1) % 4;
      
      trDolzina += deltaDolzina;
    }

  }

  // izris grafa funkcije; uporabim kodo iz razreda predavanje6.Graf,
  // spremenim jo le v tistem delu, kjer izrisujem - namesto v tabelo
  // v tem programu izrisujem direktno na zaslon (StdDraw.line)
  static void graf() {
    final int H = 250;  // visina
    final int W = 800;  // sirina

    int pi = -1;
    int pj = -1;

    StdDraw.setCanvasSize(1000, 1000);
    StdDraw.setXscale(0, W - 1);
    StdDraw.setYscale(0, H - 1);

    StdDraw.setPenRadius(0.005);

    StdDraw.line(0, H / 2, W - 1, H / 2);
    StdDraw.line(W / 2, 0, W / 2, H - 1);

    double x1 = -2 * Math.PI;
    double x2 = 2 * Math.PI;
    double y1 = -1;
    double y2 = 1;

    for (int i = 0; i < W; i++) {
      double x = i * (x2 - x1) / (W - 1) + x1;
      double y = Math.sin(x+0.5);

      int j = (int) ((H - 1) * (y - y1) / (y2 - y1));
      if (j >= 0 && j < H) {
        if (pi == -1) {
          StdDraw.line(i, H - j - 1, i, j);
        } else {
          StdDraw.line(pi, pj, i, j);
        }

        pi = i;
        pj = j;
      }
    }
  }

  /**
   * Izris kazalca; metoda je uporabna za izris radarja in za uro
   * @param dolzina Dolzina kazalca
   * @param kot Kot kazalca v stopinjah (0 pomeni navpično); večanje kota gre v smeri urinega kazalca
   * @param debelina Debalina čopiča za izris kazalca
   */
  static void kazalec(double dolzina, double kot, double debelina) {
    // Kazalec narišem od točke (0,0) do točke, podane v polarnih koordinatah (dolzina, kot)    
    // Pretvorba iz polarnih v kartezične koordinate
    double x = dolzina * Math.sin(2 * Math.PI * kot / 360);
    double y = dolzina * Math.cos(2 * Math.PI * kot / 360);

    StdDraw.setPenRadius(debelina);
    StdDraw.line(0, 0, x, y);
  }
 
  static void radar() {
    StdDraw.setScale(-100, 100);

    double kot = 0;
    // neskončna zanka (radar se ne neha vrteti)
    for (;;) {

      StdDraw.clear(Color.black);

      StdDraw.setPenColor(Color.green);
      StdDraw.setPenRadius(0.01);
      for (int i = 0; i < 5; i++) {
        StdDraw.circle(0, 0, 20 * i);
      }

      kazalec(80, kot, 0.01);
      kot = kot + 2;

      // ob ukazu show(t) se dogajanje ustavi za t milisekund;
      // z uporabo tega ukaza lahko izvajam animacijo
      StdDraw.show(10);
    }

  }

  // izris različnih spiral; tip spirale je odvisen od načina, kako je
  // oddaljenost od središča odvisna od kota
  static void spirala() {
    StdDraw.setScale(-10, 10);
    StdDraw.setPenRadius(0.01);

    // spiralo rišem tako, da se s kotom "vrtim" v krogih (na vsakem koraku
    // kot povečam za deltaKot) in pri vsakem kotu izračunam oddaljenost od 
    // središča in narišem točko (oddaljenost, kot)  (polarne koordinate)
    
    double kot = 0;
    double deltaKot = 10;

    double d = 1;

    double px = 0;
    double py = 0;

    for (int i = 0; i < 500; i++) {
      double x = d * Math.cos(2 * Math.PI * kot / 360);
      double y = d * Math.sin(2 * Math.PI * kot / 360);

      StdDraw.line(px, py, x, y);
      px = x;
      py = y;

      kot = kot + deltaKot;

      //d = d + 0.2;
      //d = 50 / Math.sqrt(kot);
      d = 1.005 * d;
    }
  }

  // izris n povezanih n-kotnikov
  static void nRoza(int n) {
    StdDraw.setScale(-100, 100);

    double trKot = 0;
    double deltaKot = 360 / n;

    double dolzina = 20;

    double x = 0;
    double y = 0;

    for (int k = 0; k < n; k++) {

      for (int i = 0; i < n; i++) {
        double nx = x + Math.cos(2 * Math.PI * trKot / 360) * dolzina * (i == n - 1 ? 3 : 1);
        double ny = y + Math.sin(2 * Math.PI * trKot / 360) * dolzina * (i == n - 1 ? 3 : 1);

        StdDraw.line(x, y, nx, ny);
        x = nx;
        y = ny;

        if (i != n - 1) {
          trKot = trKot + deltaKot;
        }
      }
    }
  }

  // Prikaz trenutne ure
  static void ura() {
    StdDraw.setScale(-100, 100);

    for (;;) {
      StdDraw.clear();

      StdDraw.setPenRadius(0.03);
      for (int i = 0; i < 12; i++) {
        double x1 = 85 * Math.sin(2 * Math.PI * i / 12);
        double y1 = 85 * Math.cos(2 * Math.PI * i / 12);
        double x2 = 90 * Math.sin(2 * Math.PI * i / 12);
        double y2 = 90 * Math.cos(2 * Math.PI * i / 12);

        double x3 = 98 * Math.sin(2 * Math.PI * i / 12);
        double y3 = 98 * Math.cos(2 * Math.PI * i / 12);

        StdDraw.line(x1, y1, x2, y2);
        StdDraw.text(x3, y3, Integer.toString(i == 0 ? 12 : i));
      }
      StdDraw.setPenRadius(0.005);
      for (int i = 0; i < 60; i++) {
        double x1 = 85 * Math.sin(2 * Math.PI * i / 36);
        double y1 = 85 * Math.cos(2 * Math.PI * i / 36);
        double x2 = 90 * Math.sin(2 * Math.PI * i / 36);
        double y2 = 90 * Math.cos(2 * Math.PI * i / 36);
        StdDraw.line(x1, y1, x2, y2);
      }

      SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SS");
      String ura = sdf.format(new Date());

      String[] uraP = ura.split(":");
      int hh = Integer.parseInt(uraP[0]);
      int mm = Integer.parseInt(uraP[1]);
      int ss = Integer.parseInt(uraP[2]);
      int SS = Integer.parseInt(uraP[3]);

      kazalec(90, 6 * (ss + 1.0 * SS / 1000), 0.005);
      kazalec(80, 6 * (mm + 1.0 * ss / 60), 0.02);
      kazalec(60, 30 * (hh + 1.0 * mm / 60), 0.03);

      StdDraw.text(-85, 95, String.format("%02d:%02d:%02d", hh, mm, ss));
      StdDraw.show(10);
    }
  }

  public static void main(String[] args) {
    //izris1();
    //izris2();
    //izris3();

    graf();
    //radar();
    //spirala();
    //nRoza(6);
    
    //ura();
  }

}
