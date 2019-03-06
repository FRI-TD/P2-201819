
public class DN01b {
	
	public static void main (String[] args) {
		String ime="ime";
		String priimek="priimek";
		int vpisnaSt=63######;
		System.out.println("Moje ime je: " + ime + " " + priimek);
		System.out.printf ("Moje ime je: %s %s\n", ime, priimek);
		
		// dodatna snov
		String izpis = String.format("Moje ime je: %s %s\n", ime, priimek);
		System.out.print(izpis);
		
		
		System.out.println("Moja vpisna številka: " + vpisnaSt);
		System.out.println();
		
		for(int i=1;i<=50;i++) {
			System.out.print("!");
		}
		
		System.out.println();
		System.out.println("! Izjavljam, da sem prebral vsebino strani       !");
		System.out.println("! 'Samostojna izdelava programov' na eUčilnici.  !");
		System.out.println("! Vse obveznosti predmeta Programiranje 2 bom    !");
		System.out.println("! skladno s temi navodili opravil samostojno.    !");
		
		for(int i=1;i<=50;i++) {
			System.out.print("!");
		}
	}
	
		
}
