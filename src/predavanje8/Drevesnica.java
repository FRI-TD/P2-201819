package predavanje8;

/**
 *
 * @author tomaz
 */
public class Drevesnica {
  

  public static void main(String[] args) {
   
    Rastlina.izpisiNavodilaZaObrezovanje();
    
   
    
    // uporaba statičnega atributa in statične metode razreda Math
    System.out.println(Math.PI);
    Math.sin(0);
    
    Rastlina r1 = new Rastlina();
    r1.mojaID = Rastlina.ID++;
    r1.nastviOznako("Vrtnica5");
    r1.starost = 1;
    r1.velikost = 10;
    r1.novMesec();r1.novMesec();r1.novMesec();
    
    Rastlina r2 = new Rastlina();
    r2.mojaID = Rastlina.ID++;
    r2.oznaka = "Lešnik";
    r2.starost = 18;
    r2.velikost = 80;
    r2.novMesec();r2.novMesec();
    
    // tabela, ki lahko hrani do 10 rastlin
    Rastlina[] rastline = new Rastlina[10];     
    for (int i = 0; i < 10; i++) {
      // ustvarimo 10 novih objektov in jih shranimo v tabelo
      rastline[i] = new Rastlina();
      rastline[i].mojaID = Rastlina.ID++;
    }

    r1.izpisiPodatke();
    r2.izpisiPodatke();
    
    System.out.println(rastline[9].mojaID);
  }
  
}
