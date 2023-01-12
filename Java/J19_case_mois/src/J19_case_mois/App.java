package J19_case_mois;

import java.util.Scanner;

/*
 * Écrivez un programme pour entrer le nom du mois et 
 * imprimez le nombre total de jours de ce mois en utilisant switch-case et en ignorant la casse
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		String mois;

		Scanner sc = new Scanner(System.in);

		// écrire lire mois

		System.out.println("saisiez un mois.");

		mois = sc.nextLine();

		// ignorer la casse !!!!!

		String moisCasse = mois.toLowerCase();

		// switch case

		switch (moisCasse) {

		case "janvier", "mars", "mai", "juillet", "aout", "octobre", "décembre":

			System.out.println(mois + " compte 31 jours;");
			break;

		case "février":

			System.out.println(mois + " compte 28 ou 29 jours;");
			break;

		case "avril", "juin", "septembre", "novembre":

			System.out.println(mois + " compte 30 jours;");
			break;

		}

		sc.close();

	}

}
