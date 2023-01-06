package J12_nombre_premier;

import java.util.Scanner;

/* Lire un nombre N et déterminer s’il est un nombre premier. Un nombre premier n'est divisible que par 1 et par lui-même. 
 * */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		int nombre;
		int i;
		int test = 0;

		Scanner sc = new Scanner(System.in);

		// Ecrire lire nombre

		System.out.println("Déterminer si un nombre est premier");

		System.out.println("Veuillez saisir un nombre.");

		nombre = sc.nextInt();

		System.out.println("Vous avez saisi : " + nombre);

		// boucle

		for (i = 2; i < nombre; i++) {

			if (nombre % i == 0) {
				test++;

			}

		}

		if (test == 0) {

			System.out.println("Le nombre " + nombre + " est premier.");
		}

		else {
			System.out.println("Le nombre " + nombre + " n'est pas premier.");
		}

	}

}
