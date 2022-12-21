package J08_tri_nombres;

import java.util.Scanner;

/*
 * Lire 2 nombres entier a et b puis les afficher dans l'ordre croissant
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclarer les variables
		
		int nombreA;
		int nombreB;
		
		Scanner sc = new Scanner(System.in);
		
		// écrire lire les nombres
		
		System.out.println("classement de 2 nombres.");
		
		System.out.println("Veuillez sasir le premier nombre.");
		nombreA = sc.nextInt();
		
		System.out.println("Veuillez saisir le deuxième nombre.");
		nombreB = sc.nextInt();
		
		System.out.println("Vous avez saisi "+nombreA+" et "+nombreB);		
		
		// trier les nombres
		// afficher le résultat
		
		
		if (nombreA==nombreB) {
			System.out.println("Les nombres sont égaux.");
		}
		
		else if (nombreA<nombreB) {
			System.out.println(" l'ordre des nombres est : "+nombreA+" , "+nombreB);
		}
		

		else {
			System.out.println(" L'ordre des nombres est : "+nombreB+" , "+nombreA);
		}
	}

}
