package J20_tableau_tests;

/*  afficher un tableau d'entiers random entre 0 et 50. l'utilisateur détermine taille du tabbleau
 * 
 */

import java.util.*;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables
		int tableau[];
		int taille;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// renseigner taille tableau
		System.out.println("saisisez la longueur du tableau");
		taille = sc.nextInt();

		System.out.println("La taille du tableau est " + taille);

		tableau = new int[taille];

		for (int i = 0; i < tableau.length; i++) {

			tableau[i] = r.nextInt(50);
			System.out.print(tableau[i] + ", ");

		}

		sc.close();

	}

}
