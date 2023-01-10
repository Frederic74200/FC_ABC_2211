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
		boolean vide;
		int ok = 0;
		int i = 0;
		int trouve = 0;
		Scanner sc = new Scanner(System.in);

		// écrire lire chaîne

		do {
			System.out.println("saisiez un mot ou une phrase.");
			chaine = sc.nextLine();
			chaine = chaine + point;
			
			if (chaine.equals(point)) {
				System.out.println("La chaîne est vide !");

				vide = false;
				ok = ok + 0;

			}

			else {
				vide = true;
				ok = ok + 1;
				break;
			}

		} while (ok == 0);

		// afficher occurence

		if (ok == 1) {

			System.out.println("Veuillez saisir la lettre à compter.");

			lettre = sc.nextLine();

		 char lettre2 = lettre.charAt(0);
		 char point2 = point.charAt(0);

			for (i = 0; i < chaine.length() ; i++ ) {
				
				char tmp = chaine.charAt(i);

				 if (tmp == lettre2) {

					trouve = trouve + 1;
					System.out.println(trouve);
			
					
				}

				else if (tmp == point2) {
					break;
					
				} 
			}

		}

		// abracadabra

		System.out.println("La lettre apparait " + trouve + " fois.");
	}

}
