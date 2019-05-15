package predavanje11;


import java.io.File;
import java.util.Scanner;

abstract class Lik {

  abstract public double povrsina();
}

class Kvadrat extends Lik {

  int a;

  Kvadrat(int a) {
    this.a = a;
  }

  public double povrsina() {
    return a * a;
  }
}

class Krog extends Lik {

  double r;

  public Krog(double r) {
    this.r = r;
  }

  @Override
  public double povrsina() {
    return Math.PI * r * r;
  }
}

class Pravokotnik extends Lik {

  int a, b;

  Pravokotnik(int a, int b) {

    this.a = a;
    this.b = b;
  }

  public double povrsina() {
    return a * b;
  }
}

/**
 *
 * @author tomaz
 */
public class DN10 {

  // največje dovoljeno stevilo likov
  private static final int N = 100;

  public static void main(String args[]) throws Exception {
    Object liki[] = new Object[N];
    int no = 0;

    // preberem like iz datoteke
    Scanner sc = new Scanner(new File(args[0]));
    while (sc.hasNextLine()) {
      String[] podatki = sc.nextLine().split(":");
      // morebitne napačne podatke v datoteki ignoriram
      if (podatki.length < 2) {
        continue;
      }
      switch (podatki[0]) {
        case "kvadrat":
          liki[no++] = new Kvadrat(Integer.parseInt(podatki[1]));
          break;
        case "krog":
          liki[no++] = new Krog(Integer.parseInt(podatki[1]));
          break;
        case "pravokotnik":
          if (podatki.length < 3) {
            continue;
          }
          liki[no++] = new Pravokotnik(Integer.parseInt(podatki[1]), Integer.parseInt(podatki[2]));
      }
    }
    sc.close();

    // izracunam povrsino vseh likov v tabeli   
    double vsota = 0;
    for (int i = 0; i < no; i++) {
      if (liki[i] instanceof Lik)
        vsota += ((Lik) liki[i]).povrsina();
    }
    System.out.printf("%.2f\n", vsota);
  }
}
