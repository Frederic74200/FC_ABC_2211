package J15_les_courses;

import java.util.Scanner;

/*
 * Barnabé fait ses courses dans plusieurs magasins. 
Dans chacun, il dépense 1 € de plus que la moitié de ce qu’il possédait en entrant.  
Dans le dernier magasin, il dépense le solde. 
Barnabé dépense au moins 1 € dans chaque magasin

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		int S =0;
		int mag = 0;
		double reste ;
		Scanner sc = new Scanner(System.in);
		// lire écrire somme

		do {
			System.out.println("La somme doit être supérieure à 1€");
			System.out.println("Veuillez saisir la somme de départ");
			S = sc.nextInt();

			
		} while (S < 1);
		
		
		
		reste = S; 
		

		// boucle

		while ( reste >=1) {
			
			reste = reste / 2 - 1;
		
			mag++;
		
			System.out.println(reste+" et "+mag);

			
		}
		
		mag = mag-1;

		System.out.println("Vous avez acheté dans " + mag + " magasins.");

		sc.close();

	}

}
