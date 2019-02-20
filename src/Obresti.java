public class Obresti {

  // Prvi program v Javi
  // Izpis stanja na računu po n letih, če vežemo
  // glavnico z obredtno mero p
  public static void main(String[] args) {
    // vsaki spremenljivki moramo dolociti tip
    double glavnica     = 1000;
    int    leta         = 5;
    double obrestnaMera = 4;
    
    // izracun koncne vsote
    // za potenciranje uporabimo metodo Math.pow()
    double koncniZnesek = glavnica * Math.pow(1 + obrestnaMera/100, leta);
    
    // v izpisu lahko "sestevamo" nize in druge tipe - java
    // bo pri tem vsak tip pretvorila v niz in vse dobljene 
    // nize zlepila (angl. concat) skupaj
    System.out.println("Glavnica:         " + glavnica);
    System.out.println("Stevilo let:      " + leta);
    System.out.println("Obrestna mera:    " + obrestnaMera);
    System.out.println("Stanje na racunu: " + koncniZnesek);

  }

}