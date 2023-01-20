package J30_prenoms_groupe;

import java.util.*;

/*
 * Soit un tableau de chaines de caractère contenant les prénoms du groupe ABC Dev
Chaque stagiaire est identifié par un numéro de 1 à 12
On demande à l’utilisateur de saisir un numéro de stagiaire et en fonction de son choix on affiche un message contenant le
prénom correspondant au numéro demandé.
*/

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables
		Scanner sc = new Scanner(System.in);

		String groupe[] = new String[] { "Terence", "Samba", "Stefan", "Raphaêl", "Olivier", "Natana", "Mustapha",
				"Mickaêl", "Kevin", "Guillaume", "Frédéric", " Florian" };

		int rang;
		int index;

		System.out.println(
				"Pour connaîte quel numéro a été attribué à quel stagiaire, veuillez saisir un nombre entre 1 et 12.");
		rang = sc.nextInt();
		
		if (rang >0 && rang < 13) {
			index = rang-1;
			System.out.println("Le stagiaire auquel a été attribué le numéro : "+rang+" est : "+groupe[index]);
			
		}
		else {
			System.out.println("error 404 not found !");
		}

	}

}
