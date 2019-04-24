package predavanje9;

import predavanje8.*;

/**
 *
 * @author tomaz
 */
public class Drevesnica {
  
  // Metoda lahko prejme katerikoli objekt tipa Rastlina - lahko tudi 
  // objekt tipa Drevo, saj je vsako Drevo tudi Rastlina. 
  // Metoda preveri, kakšnega tipa je prejeti objekt in na podlagi 
  // ugotovljenega tipa izpiše uvodno besedilo ("Drevo:" ali "Rastlina:")
  static void izpisi(Rastlina rast) {
    if (rast instanceof Drevo)
      System.out.println("Drevo: " + rast.oznaka);
    else
      System.out.println("Rastlina: " + rast.oznaka);
  }
  

  public static void main(String[] args) {
    Rastlina r1 = new Rastlina();
    Rastlina r2 = new Rastlina();
    Rastlina r3 = new Rastlina();
    System.out.println("Ko ustvarim tri objekte tipa Rastlina, je vrednost števca Rastlina.ID enaka " + Rastlina.ID);
   
    // vsaka rastlima pa ima svoj id
    System.out.println("ID rastline 2 je " + r2.mojaID);
    
    // rastlino lahko ustvarim s konstruktorjem brez parametrov (zgoraj), 
    // s konstruktorjem, ki prejme tri parametre ....
    Rastlina r4 = new Rastlina("Lipa", 10, 20);
    System.out.printf("Rastlina4: mojaID: %d, oznaka: %s, velikost: %d\n", r4.mojaID, r4.oznaka, r4.getVelikost());
    
    // ... ali s konstruktorjem, ki prejme samo en parameter
    Rastlina r5 = new Rastlina("Bezeg");
    
    
    // Tudi drevo je rastlina, zato se tudi v primeru, da ustvarim novo Drevo, 
    // vrednost števca Rastlina.ID poveča, drevo pa dobi svoj id
    Drevo d = new Drevo("Hrast");
    System.out.println("Drevo: " + d.oznaka);
    System.out.println("ID hrasta: " + d.mojaID);
    
    // drevo ima dodatne atribute (sirina) in metode (rastVSirino)
    d.sirina = 5;
    d.rastVSirino();
        
    // tip objekta preverim z operatorjem instanceof
    System.out.println("r1 je rastlina: " + (r1 instanceof Rastlina));
    System.out.println("d  je rastlina: " + (d instanceof Rastlina));
    System.out.println("r1 je drevo:    " + (r1 instanceof Drevo));
    System.out.println("d  je drevo:    " + (d instanceof Drevo));
    
    // klic metode, ki prejme parameter tipa Rastlina z r1 (Rastlina) ...
    izpisi(r1);
    // ... in d (Drevo)
    izpisi(d); 
    
    Bonsai b = new Bonsai();
    // pri izpisu objekta z metodo printf se kliče metoda toString
    System.out.println(b);              
  }
  
}
