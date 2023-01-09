package J17_chaine_occurence;

import java.util.*;

/*
 * 
 * Soit une chaîne de caractères terminée par le caractère « . ».  
Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée (« a » par exemple) dans cette chaîne.  
Si la chaîne de caractères est vide ou n'est composée que du caractère « . », le message « LA CHAINE EST VIDE » sera affiché. 
 

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables

		String chaine;
		String point = ".";
		String lettre;
		String rien = "";
		boolean vide = false;
		Scanner sc = new Scanner(System.in);

		// écrire lire chaîne

		do {
			System.out.println("saisiez un mot ou une phrase.");
			chaine = sc.next();
			chaine = chaine + point;

			if (chaine.equals(point) || chaine.equals(rien)) {
				System.out.println("La chaîne est vide !");

				vide = false;

			}

			else {
				vide = true;

			}

		} while (vide = false);
		
		
		// afficher occurence

		if (vide = true) {
			System.out.println("Vous avez saisi : " + chaine);

			System.out.println("Veuillez saisir la lettre à compter.");

			lettre = sc.next();

		}

	}

}
