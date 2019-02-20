public class JavaZakonFor {

  // 10x izpis besedila Java je zakon!
  static void izpis() {
    int i;  // deklaracija celostevilske spremenljivke
    
    for (i=1; i<=10; i++) {
      // vrstice ostevilcimo - pred besedilom izpisemo zaporedno stevilko
      System.out.println(i + " - Java je zakon!");    
    }  
  }

  static void izpis2() {
    int i;  // deklaracija celostevilske spremenljivke
    
    for (i=1; i<=42; i++) {
      // izpis z uporabo ukaza printf - namesto %d bo
      // java vstavila vrednost spremenljivke i
      System.out.printf("%d - Java je zakon! \n", i);    
    }  
  }


  public static void main(String[] args) {
    // izpis();
    
    izpis2();
  }

}
 