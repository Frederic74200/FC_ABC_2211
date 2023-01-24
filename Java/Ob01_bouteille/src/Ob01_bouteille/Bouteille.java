package Ob01_bouteille;

import java.util.*;

public class Bouteille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables

		Scanner sc = new Scanner(System.in);

		String typeLiquide;
		String typeMateriau;
		int capaciteCl;
		int quantitePlusMoins;
		int quantiteDansBouteille;
		int volumeDispo;

		Boolean ouvert = false;
		// Boolean remplir;
		Boolean continuer = true;

		String ouvFer;
		String open = "o";
		String fermer = "f";

		String plusMoins;
		String plus = "a";
		String moins = "r";

		String contiQuit;
		String poursuivre = "p";
		String quit = "q";

		// vcaleurs variables test

		typeLiquide = "Soda";
		typeMateriau = "Plastique";
		capaciteCl = 150;
		quantiteDansBouteille = 150;
		volumeDispo = 0;

		// écrire variables

		System.out.println("La bouteille contient : " + typeLiquide);
		System.out.println("La matière de la bouteille est : " + typeMateriau);
		System.out.println("La capactité de la bouteille est de : " + capaciteCl + " centilitres.");
		System.out.println(
				"La quantité de liquide dans la bouteille est de : " + quantiteDansBouteille + " centilitres.");

		// ouvrir fermer ajouter enlever

		do {

			while (ouvert == false) {
				System.out.println("La bouteille est fermée ! Appuyez sur o pour l'ouvrir.");
				ouvFer = sc.nextLine();

				if (ouvFer.equals(open)) {
					System.out.println("La bouteille est ouverte !");
					ouvert = true;
				}
			} // fin ouvert

			
			
			System.out.println("Appuyez sur a pour ajouter du liquide ou sur r pour en retirer.");
			plusMoins = sc.nextLine();

			
			if (plusMoins.equals(plus)) {  // remplir

				System.out.println("Veuillez siasir la quantité de liquide à ajouter.");
				quantitePlusMoins = sc.nextInt();

				while (quantitePlusMoins > volumeDispo) {

					System.out.println(" Cette quantité ne rentre pas !");
					System.out.println("Veuillez siasir la quantité de liquide à ajouter.");
					quantitePlusMoins = sc.nextInt();
				} // fin while

				quantiteDansBouteille = quantitePlusMoins + quantiteDansBouteille;

				volumeDispo = capaciteCl - quantiteDansBouteille;
			} // fin if remplir

			
			
			else if (plusMoins.equals(moins)) {  // vider

				System.out.println("Veuillez siasir la quantité de liquide à retirer.");
				quantitePlusMoins = sc.nextInt();

				while (quantitePlusMoins > quantiteDansBouteille) {

					System.out.println(" Cette quantité ne peut pas être retirée!");
					System.out.println("Veuillez siasir la quantité de liquide à ajouter.");
					quantitePlusMoins = sc.nextInt();
				} // fin while

				quantiteDansBouteille = quantiteDansBouteille - quantitePlusMoins;

				volumeDispo = capaciteCl - quantiteDansBouteille;

			} // fin if vider
			
			
			

			System.out.println("La bouteille contient actuellement " + quantiteDansBouteille + " centilitres.");
			System.out.println(
					"Le volume disponible actuellement dans la bouteille est de " + volumeDispo + " centilitres.");

			
			
			System.out.println("Si vous souhaitez fermer la bouteille, appuyez sur f. Sinon appuyez sur o.");
			ouvFer = "";
			ouvFer = sc.nextLine();

			if (ouvFer.equals(open)) {
				System.out.println("La bouteille est ouverte !");
				ouvert = true;
			}

			if (ouvFer.equals(fermer)) {
				System.out.println("La bouteille est fermer !");
				ouvert = false;
			}

			System.out.println("Souhaitez-vous continuer ? ");
			System.out.println("Tapez sur p pour poursuivre ou sur q pour quitter");
			contiQuit = sc.nextLine();

			if (contiQuit.equals(poursuivre)) {
				continuer = true;
			}

			if (contiQuit.equals(quit)) {
				continuer = false;
			}

		} while (continuer == true); // fin grande boucle
		

		if (quantiteDansBouteille == capaciteCl) {
			System.out.println("La bouteille est pleine !");
		}

		else if (quantiteDansBouteille == 0) {
			System.out.println("La bouteille est vide !");
		}

		else {
			System.out.println("Il reste " + quantiteDansBouteille + " cl dans la bouteille.");
		}

	} // static

} // class
