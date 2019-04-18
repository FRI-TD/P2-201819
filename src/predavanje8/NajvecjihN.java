package predavanje8;

import java.util.Arrays;

/**
 *
 * @author tomaz
 */
public class NajvecjihN {

  static final int N = 5;
  
  int dolzinaBesede;
  
  // metodA pogleda, ce je nextT vecja od katerega elementa v tabeli;
  // ce je večja, jo vstravi na pravo mesto
  static void dodajCeVecja(float[] t, float nextT) {
    for (int i = 0; i < t.length; i++) {
      if (nextT > t[i]) {
        // vse elemente prepisem za 1 "dol"
        for (int j = t.length-1 ; j > i; j--) {
          t[j] = t[j-1];
        }
        t[i] = nextT;
        break;
      }
    }
  }

  public static void main(String[] args) {
    float[] temp = new float[N];
    for (int i = 0; i < N; i++) {
      temp[i] = Float.NEGATIVE_INFINITY;
    }
    
    float[] stevila = {-3f,-4f,-7f,-1f,-8f,-5f,-2f};
    for (int i = 0; i < stevila.length; i++) {
      dodajCeVecja(temp, stevila[i]);
    }
    
    System.out.println(Arrays.toString(temp));
  }

}
