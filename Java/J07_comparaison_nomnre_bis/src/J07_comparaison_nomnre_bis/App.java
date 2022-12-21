package J07_comparaison_nomnre_bis;

import java.util.Scanner;

/*
 * Lire un nombre a correspondant à un âge (en années). 
Afficher "Vous êtes majeur" ou "Vous êtes mineur" selon le cas. La majorité est fixée à 18 ans.  
Pour un nombre négatif le message doit être "Vous n'êtes pas encore né". 

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// déclarer les variables
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		// écrire lire âge
		
		System.out.println("Étas-vous majeur.e ?");
		
		System.out.println("veuillez indiquer votre âge.");
		
		age = sc.nextInt();
		
		System.out.println("Vous avez indiqué "+age+" ans");
		
		
		// si âge sinon si, sinon
		// afficher résultat
		
		if (age<0) {
			System.out.println("Vous n'êtes pas encore né.e !");
		}
		
		
		else if (age>=0 && age<18) {
			System.out.println("Vous êtes mineur.e !");
		}
		
		else if (age>=18 && age<122) {
			System.out.println("Vous êtes majeur.e !");
		}
		
		else {
			System.out.println("Vous êtes un dinosaure ! 🦕");
		}
		
		
	}

}
