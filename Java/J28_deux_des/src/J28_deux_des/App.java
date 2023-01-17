package J28_deux_des;

import java.util.*;

/*
 * 
 * Soit 2 dés, le joueur a droit à 6 lancers. A chaque lancer, on cumule le nombre de points
des 2 dés qui s’ajoutent aux points des tours précédents. Si le joueur fait un double,
il a droit à 1 lancer supplémentaire. Si le joueur fait un double 6, il a droit à 2 lancers supplémentaires. 

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String lancer;
		String lancerPoint;
		String point = ".";
		int de1;
		int de2;
		int tours = 6;
		int cumul = 0;
		int total = 0;

		do {
			System.out.println("Appuyez sur entrée pour lancer les dès");
			lancer = sc.nextLine();

			lancerPoint = lancer + point;

			if (lancerPoint.equals(point)) {

				de1 = r.nextInt(1, 6);
				de2 = r.nextInt(1, 6);
				System.out.println("Votre lancé : " + de1 + " " + de2);

				cumul = de1 + de2;
				System.out.println("Vous avez marqué : " + cumul + " points.");

				total = total + cumul;
				System.out.println("Votre total est de : " + total + " points.");

				if (de1 == de2) {
					tours++;
				}

				else if (de1 + de2 == 12) {
					tours = tours + 2;
				}

				tours--;
				System.out.println("Il vous reste : " + tours + " lancers");
			}

		} while (tours > 0);

		System.out.println("Bravo ! Votre score est de : " + total + " points !");

	}

}
