package predavanje2;

/**
 * Prikaz uporabe metod na objektu tipa String
 * 
 * @author tomaz
 */
public class Nizi {
  public static void main(String[] args) {
    // indeks znakov v nizu se začne z 0
    //            0123456789.....
    String niz = "Pomlad prihaja!";
    
    // za dolzino niza uporabim metodo length()
    int dolzina = niz.length();
    System.out.println(dolzina);
    System.out.println(niz.length());
    
    // i-ti znak niza ... metoda charAt()
    char znak = niz.charAt(3);
    System.out.println(znak);
    
    // podniz od indeksa i (vključno) do j: substr(i,j)
    System.out.println(niz.subSequence(0, 5));
    
    // kje v nizu se pojavi crka p?
    System.out.println(niz.indexOf("p")); 
            
    // kje v nizu se pojavi crka x?
    System.out.println(niz.indexOf("x")); 
    
    // kaj pa podniz "mla"?
    System.out.println(niz.indexOf("mla")); 
    
    // zamenjava vseh pojavitev podniza z drugim nizom: replaceAll
    String novNiz = niz.replaceAll("a", "x");
    System.out.println(novNiz);
    
    // primerjavo dveh števil opravim z operatorjem ==
    int a=5; 
    int b=5;
    if (a==b) {
      System.out.println("Vrednosti a in b sta enaki");
    } else {
      System.out.println("Vrednosti a in b nista enaki");
    }

    // pri primerjavi dveh nizov pa ne smem uporabiti operatorja ==,
    // ker je rezultat take primerjave napačen!
    String n1= "Java" + a; 
    String n2= "Java" + b;
    System.out.println(n1);
    System.out.println(n2);
    if (n1==n2) { // NAPAKA - nizov NIKOLI ne smemo  primerjati z ==
      System.out.println("Vrednosti n1 in n2 sta enaki");
    } else {
      System.out.printf("Vrednosti '%s' in '%s' nista enaki \n", n1, n2);
    }
    // namesto tega niza primerjam s pomočjo metode equals
    if (n1.equals(n2)) { // PRAVILNO!!!
      System.out.println("Vrednosti n1 in n2 sta enaki");
    } else {
      System.out.printf("Vrednosti '%s' in '%s' nista enaki \n", n1, n2);
    }
    
  }
}
