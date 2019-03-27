package predavanje5;

/**
 * Demonstracija uporabe večdimenzionalnih tabel.
 * 
 * Program zmnoži dve kvadratni matriki (glej https://en.wikipedia.org/wiki/Matrix_multiplication)
 * @author tomaz
 */
public class MnozenjeMatrik {
  
  // dve vhodni matriki
  static int [][] a = {{1,2}, {3,4}};
  static int [][] b = {{1,2}, {3,4}};
  
  // program dela tudi z večjimi matrikami
  //static int [][] a = {{1,2,3,4}, {3,4,2,1}, {3,2,4,1}, {3,2,4,1}};
  //static int [][] b = {{4,3,1,3}, {1,0,1,4}, {4,3,2,1}, {5,0,1,2}};
  
  
  public static void main(String[] args) {
    // rezultat (metrika c) je enako velika kot vhodni matriki
    int[][] c = new int[a.length][a.length];
    
    // množenje po standardni formuli; zunanji for zanki se z indeksema
    // (i,j) "sprehodita" po vseh elementih matrike c
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        c[i][j] = 0;
        // notranja zanka po standardni formuli izracuna element cij
        for (int k = 0; k < a.length; k++) {
          c[i][j] = c[i][j] + a[i][k]*b[k][j];
        }
      }
    }
    
    // izpis rezultata
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.printf("%3d", c[i][j]);
      }
      System.out.println("");
    }
    
  }

}
