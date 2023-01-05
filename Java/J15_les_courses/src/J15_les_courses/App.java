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

		int S;
		int mag;
		int depense;
		Scanner sc = new Scanner(System.in);
		// lire écrire somme

		do {
			System.out.println("La somme doit être supérieure à 1€");
			System.out.println("Veuillez saisir la somme de départ");
			S = sc.nextInt();

			if (S >= 1) {
				break;
			}
		} while (S < 1);

		for (mag = 0; mag < S; mag++) {
			S = S / 2 - 1;

			if (S < 1) {
				break;
			}
		}

		System.out.println("Vous avez acheté dans " + mag + " magasins.");

		sc.close();

	}

}
