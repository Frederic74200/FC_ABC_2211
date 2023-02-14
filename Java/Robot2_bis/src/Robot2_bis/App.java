package Robot2_bis;


import java.util.*;


public class App {

	/**
	 * 	objectif : ramasser toutes les piles avec un robot sans qu'il soit en manque d'energie, modifier le code selon les resultats
		
		/etapes a suivre :
		- allumer le robot 
		- cartographier la carte
		- tourner pour changer de direction puis avancer
		- ramasser toutes les piles
		- consommer les piles pour avoir suffisamment d'energie
		- veiller
		- commenter la partie pour verifier si c'est fini
		/conseils : 
		- utiliser le constructeur par defaut
		- afficher la carte pour voir o� en est le robot
		- utiliser toString pour voir la position du robot et d'autres variables
		
	 * @param args
	 */
	public static void main(String[] args) {
		
		Robot bot = new Robot();
		Scanner sc = new Scanner(System.in);
		
		String commande = ""; 
		
		String allume = "a"; 
		
		
		
		// afficher la carte 
		
		bot.cartographier();
		
		bot.afficherCarte();
		
		int nombrePiles = bot.compterPilesCarte();
		
		String affciherBot =  bot.toString();
		
		System.out.println(affciherBot);
		
		System.out.println("Appuyer sur a pour allumer la robot");
		commande = sc.nextLine();
		
		if (commande.equals(allume)) {			
		bot.allumer();	
		System.out.println("Le robot est allumé");
		}
		
		
		do {
			
			
			
		} while(nombrePiles > 0 );
		
		
		
		
		
		
		
		
		
				
	}
}
