package Ob04_porte_garage;

public class App {
	
	
	public static void main(String[] args) {

		PorteDeGarage prt1 = new PorteDeGarage("Porte atelier 1", false, 100);

		String prt1String = prt1.toString();
		int tauxOuv = prt1.getTauxOuverture();
		Boolean verrou = prt1.getVerrouille();
		
		System.out.println("Contrôles"); 
		System.out.println(verrou); 
	 	System.out.println(tauxOuv); 		
		System.out.println(prt1String);
		System.out.println("_____________________________________________________");

		System.out.println("Fermeture"); 
		Boolean fermerPrt = prt1.fermer();
		System.out.println(fermerPrt);
		System.out.println(prt1.getTauxOuverture()); 
		System.out.println(prt1.toString());
		System.out.println("_____________________________________________________");

		System.out.println("Verrrouillage"); 
		Boolean verrouPrt = prt1.verrouiller();
		System.out.println(verrouPrt);
		System.out.println(prt1.getTauxOuverture()); 
		System.out.println(prt1.toString());
		System.out.println("_____________________________________________________");

		System.out.println("Déerrrouillage"); 
		Boolean deverrouPrt = prt1.deverrouiller();
		System.out.println(deverrouPrt);
		System.out.println(prt1.getTauxOuverture()); 
		System.out.println(prt1.toString());
		System.out.println("_____________________________________________________");
		
		System.out.println("ouverture partielle"); 
		 prt1.setTauxOuverture(30);
		System.out.println(prt1.getTauxOuverture()); 
		System.out.println(prt1.toString());
		System.out.println("_____________________________________________________");
	}

}
