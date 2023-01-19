package evaluation_19_01_23_fc;

/*
PSEUDO CODE 


Ecrire : « Les jours pairs des mois impairs et les jours impairs des mois pairs.

// Déclarer les variables 

Entier mois
Booléen valide 
Entier incrémentation

Début programme 

	Faire 
		Ecrire "Saisissez un numéro de mois."
		Lire mois

			Si mois > 0 et mois < 13 
			Valide = vrai
			Sinon valide = faux
	Tant que valide = faux


Suivant cas mois
		Cas où 1:
			Ecrire "Le mois " + mois + " est janvier."
		cas où 2:
			Ecrire  "Le mois " + mois + " est février."
		cas où 3:
			Ecrire  "Le mois " + mois + " est mars."
		cas où 4:
			Ecrire  "Le mois " + mois + " est avril."
		cas où 5:
			 Ecrire "Le mois " + mois + " est mai. »
		cas où 6:
			Ecrire  "Le mois " + mois + " est juin."
		cas où 7:
			Ecrire "Le mois " + mois + " est juillet."
		cas où 8:
			Ecrire  "Le mois " + mois + " est août."
		cas où 9:
			Ecrire  "Le mois " + mois + " est septembre.
		cas où 10:
			Ecrire  "Le mois " + mois + " est octobre."
		cas où 11:
			Ecrire  Le mois " + mois + " est novembre."
		autres cas:
			Ecrire  "Le mois " + mois + " est décembre."


	Si mois = 2 
		Alors  écrire : « les jours impairs de ce mois n'étant pas des multiples de 3 sont : »
			Pour de  incrémentation = 1 à incrémentation < 29
				Si incrémentation mod 2 = 1 et incrémentation mod 3 différent 0
				Alors Ecrire «  incrémentation +  , »

	Sinon Si mois  mod 2 = 0 et mois < 7  
		Alors  écrire : « les jours impairs de ce mois n'étant pas des multiples de 3 sont : »
			Pour de  incrémentation = 1 à incrémentation  < 31
				Si incrémentation mod 2 = 1 et incrémentation mod 3 différent 0
				Alors Ecrire «  incrémentation +  , »

Sinon Si mois  mod 2 = 0 et mois > 7  
		Alors  écrire : « les jours impairs de ce mois n'étant pas des multiples de 3 sont : »
			Pour de  incrémentation = 1 à incrémentation  < 32
				Si incrémentation mod 2 = 1 et incrémentation mod 3 différent 0
				Alors Ecrire «  incrémentation +  , »



Sinon 
		Alors  écrire : « Les jours pairs de ce mois ne terminant pas par 0 sont :: »
			Pour de  incrémentation = 1 à incrémentation  < 32
				Si incrémentation mod 2 = 0 et incrémentation mod 10 différent 0
				Alors Ecrire «  incrémentation +  , »

Fin programme




 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Les jours pairs des mois impairs et les jours impairs des mois pairs");

		// Déclarer les variables

		Scanner sc = new Scanner(System.in);

		int mois;
		Boolean valide = false;

		// saisie valide ou invalide

		do {
			System.out.println("Saisissez un numéro de mois.");
			mois = sc.nextInt();

			if (mois > 0 && mois < 13) {
				valide = true;
			}

			else {
				System.out.println("Saisie invalide ! Veuillez recommencer.");
			}

		} while (valide == false);
		

		// corespondance numéro et mois

		switch (mois) {

		case 1:
			System.out.println("Le mois " + mois + " est janvier.");
			break;
		case 2:
			System.out.println("Le mois " + mois + " est février.");
			break;
		case 3:
			System.out.println("Le mois " + mois + " est mars.");
			break;
		case 4:
			System.out.println("Le mois " + mois + " est avril.");
			break;
		case 5:
			System.out.println("Le mois " + mois + " est mai.");
			break;
		case 6:
			System.out.println("Le mois " + mois + " est juin.");
			break;
		case 7:
			System.out.println("Le mois " + mois + " est juillet.");
			break;
		case 8:
			System.out.println("Le mois " + mois + " est août.");
			break;
		case 9:
			System.out.println("Le mois " + mois + " est septembre.");
			break;
		case 10:
			System.out.println("Le mois " + mois + " est octobre.");
			break;
		case 11:
			System.out.println("Le mois " + mois + " est novembre.");
			break;
		default:
			System.out.println("Le mois " + mois + " est décembre.");
			break;

		}
		

		// si février (année normale 28 jours)

		if (mois == 2) {

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 29; i++) {

				if (i % 2 == 1 && i % 3 != 0) {
					System.out.print(i + ", ");
				}
			}

		} // fin if février
		
		

		// si mois pair

		else if (mois % 2 == 0 && mois < 7) { // mois avril et juin 30 jours

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 31; i++) {

				if (i % 2 == 1 && i % 3 != 0) {
					System.out.print(i + ", ");
				}
			}

		} // fin if pair début année

		else if (mois % 2 == 0 && mois > 7) { // mois août, octobre, décembre 31 jours

			System.out.println("les jours impairs de ce mois n'étant pas des multiples de 3 sont : ");

			for (int i = 1; i < 32; i++) {

				if (i % 2 == 1 && i % 3 != 0) {
					System.out.print(i + ", ");
				}
			}

		} // fin if pair fin année
		
		

		// si mois impair

		else {

			System.out.println("les jours pairs de ce mois ne terminant pas par 0 sont : ");

			for (int i = 1; i < 31; i++) {

				if (i % 2 == 0 && i % 10 != 0) {
					System.out.print(i + ", ");
				}
			}

		} // fin if impair

	} // avant dernier
} // dernier
