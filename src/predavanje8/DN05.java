package predavanje8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Primeri slabe kode, ki ste jo uporabili pri reševanju DN05. 
 * @author tomaz
 */
public class DN05 {
  PrintWriter pw;
  void temp(int[] tabela, int temp) {
    //...

    for (int j = 4; j >= 0; j--) {
      if (temp > tabela[5]) {
        tabela[0] = tabela[1];
        tabela[1] = tabela[2];
        tabela[2] = tabela[3];
        tabela[3] = tabela[4];
        tabela[4] = tabela[5];
        tabela[5] = temp;
        break;

      }

      if (temp > tabela[4]) {
        tabela[0] = tabela[1];
        tabela[1] = tabela[2];
        tabela[2] = tabela[3];
        tabela[3] = tabela[4];
        tabela[4] = temp;
        break;

      }
      if (temp > tabela[3]) {
        tabela[0] = tabela[1];
        tabela[1] = tabela[2];
        tabela[2] = tabela[3];
        tabela[3] = temp;
        break;

      }

      if (temp > tabela[2]) {
        tabela[0] = tabela[1];
        tabela[1] = tabela[2];
        tabela[2] = temp;
        break;

      }
      if (temp > tabela[1]) {
        tabela[0] = tabela[1];
        tabela[1] = temp;
        break;

      }
      if (temp > tabela[0]) {
        tabela[0] = temp;

      }
    }
  }

  public static void analizirajTemperature(String a) throws FileNotFoundException {
    Scanner sc = new Scanner(new File(a));
    float sestevek = 0;
    int stevila = 0;
    float prva = -100;
    float druga = -100;
    float tretja = -100;
    float cetrta = -100;
    float peta = -100;
    String ena = "";
    String dva = "";
    String tri = "";
    String stiri = "";
    String pet = "";
    while (sc.hasNext()) {
      String nova = sc.next();
      float i = Float.parseFloat(nova.replace(",", "."));
      sestevek = sestevek + i;
      stevila++;
      if (prva <= i) {
        peta = cetrta;
        cetrta = tretja;
        tretja = druga;
        druga = prva;
        prva = i;

        pet = stiri;
        stiri = tri;
        tri = dva;
        dva = ena;
        ena = nova;
      } else if (druga <= i && i < prva) {
        peta = cetrta;
        cetrta = tretja;
        tretja = druga;
        druga = i;

        pet = stiri;
        stiri = tri;
        tri = dva;
        dva = nova;
      } else if (tretja <= i && i < druga) {
        peta = cetrta;
        cetrta = tretja;
        tretja = i;

        pet = stiri;
        stiri = tri;
        tri = nova;
      } else if (cetrta <= i && i < tretja) {
        peta = cetrta;
        cetrta = i;

        pet = stiri;
        stiri = nova;
      } else if (peta < i && i < cetrta) {
        peta = i;

        pet = nova;
      }
    }
    String h = String.format("%.2f", sestevek / stevila);
    String s = h.replace('.', ',');
    System.out.printf("Povprecje zapisanih temperatur je %s.\n", s);
    System.out.printf("Najvisjih 5 temperatur:\n%s\n%s\n%s\n%s\n%s", ena, dva, tri, stiri, pet);
    sc.close();
  }

  int[] vsotaPoDiagonali(int[][] resitev) {
    return null;
  }
  
  boolean preveriSudoku(int[][] tabela) {
    return false;
  }
  
  void razno(int[][] tabela, int[][] resitev, int prvi, int drugi, int[] stolpeck, int[] stolpecj) {
    for (int stol1 = 0; stol1 < resitev[0].length; stol1++) {
      if (stol1 == drugi) {
        for (int y = 0; y < resitev[0].length; y++) {
          stolpeck[y] = resitev[y][stol1];
        }
      }
    }

    for (int x = 0; x < resitev.length; x++) {
      for (int c = 0; c < resitev[x].length; c++) {
        if (x == prvi) {
          resitev[c][x] = stolpeck[c];
        } else if (x == drugi) {
          resitev[c][x] = stolpecj[c];
        }
      }
    }

    if (preveriSudoku(tabela)) {
      System.out.println("Resitev je pravilna.");
    } else {
      System.out.println("Resitev NI pravilna.");
    }

    for (int i = 0; i < 25; i++) {
      // tak izpis ni primeren ...
      pw.printf("%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d\r\n",
              tabela[i][0], tabela[i][1],   tabela[i][2],  tabela[i][3],  tabela[i][4],  tabela[i][5], 
              tabela[i][6], tabela[i][7],   tabela[i][8],  tabela[i][9],  tabela[i][10], tabela[i][11], 
              tabela[i][12], tabela[i][13], tabela[i][14], tabela[i][15], tabela[i][16], tabela[i][17], 
              tabela[i][18], tabela[i][19], tabela[i][20], tabela[i][21], tabela[i][22], tabela[i][23], 
              tabela[i][24]);
      
      // ...  namesto tega raje pišite
      for (int j = 0; j <= 24; j++) {
        pw.printf("%3d", tabela[i][j]);
      }
      System.out.println("");
    }

    int[] vsote = vsotaPoDiagonali(resitev);
    System.out.printf("Vsota na diagonalah je %d, %d in %d.\n", 
       vsote[0], vsote[1], vsote[2]);
  }

}
