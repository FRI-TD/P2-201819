package predavanje6;

/**
 * Program za izris grafov funkcij na tekstovni zaslon.
 * 
 * Program uporablja dvodimenzionalno tabelo velikost 80x25; graf "riše" 
 * v to tabel, nato vsebino tabele vrstico po vrstici izpiše na zaslon.
 * 
 * @author tomaz
 */
public class Graf {
  
   final int H = 25;  // visina
   final int W = 80;  // sirina
  
   char[][] zaslon = new char[H][W];
  
   void pobrisiZaslon() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        zaslon[i][j] = ' ';
      }
    }
  }
  
   void koordinatniSistem() {
    for (int i = 0; i < W; i++) {
      zaslon[H/2][i] = '-';
    }
    for (int i = 0; i < H; i++) {
      zaslon[i][W/2] = '|';
    }
    zaslon[H/2][W/2] = '+';
  }
  
   void graf() {
    double x1 = -2*Math.PI;
    double x2 =  2*Math.PI;
    double y1 = -1;
    double y2 = 1;
    
    for (int i = 0; i < W; i++) {
      double x = i*(x2-x1)/(W-1)+x1;
      double y = Math.sin(x);
      
      int j = (int)((H-1) * (y-y1)/(y2-y1));
      if (j >= 0 && j < H)
        zaslon[H-j-1][i] = '*';
    }
    
  }
  
  void izris() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(zaslon[i][j]);
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    Graf g = new Graf();
    g.pobrisiZaslon();
    g.koordinatniSistem();
    g.graf();
    g.izris();
  }
  

}
