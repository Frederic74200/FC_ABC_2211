package J18_case_semaine;

import java.util.*;

/*
 * Écrivez un programme pour Saisir le numéro du jour dans une semaine (1-7) 
 * et affichez le nom du jour à l'aide de switch case.
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		int jour;

		Scanner sc = new Scanner(System.in);

		// écrire lire numéro du jour

		do {
			System.out.println("saisissez le numéro du jour de la semaine.");

			jour = sc.nextInt();

		} while (jour < 0 || jour > 7);

		// switch case

		switch (jour) {

		case 1:
			System.out.println("Le jour " + jour + " est lundi.");
			break;

		case 2:
			System.out.println("Le jour " + jour + " est mardi.");
			break;

		case 3:
			System.out.println("Le jour " + jour + " est mercredi.");
			break;

		case 4:
			System.out.println("Le jour " + jour + " est jeudi.");
			break;

		case 5:
			System.out.println("Le jour " + jour + " est vendredi.");
			break;

		case 6:
			System.out.println("Le jour " + jour + " est samedi.");
			break;

		case 7:
			System.out.println("Le jour " + jour + " est dimanche.");
			break;

		}

		sc.close();
	}

}
