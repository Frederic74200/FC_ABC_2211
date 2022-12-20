package J06_inversion2valeurs;

import java.util.Scanner;

/*Lire  A
A est un entier
Ecrire « Valeur de A » A
Lire B
B est un entier
Ecrire « Valeur de B» B
CA
AB
BC
Ecrire « A »
Ecrire « B »
Fin
*/


public class App {

	
	public static void main(String[] args) {
		
		
		// Déclarer variables
		
		int nombreA;
		int nombreB;
		int tmp;
		
		Scanner sc= new Scanner(System.in);
		
		
		// écrire lire nombre a et b
		
		System.out.println("Echange de deux nombres.");
		System.out.println("Veuillez saisir le nombre A.");
		nombreA = sc.nextInt();
		
		System.out.println("Veuillez saisir le nombre B.");
		nombreB = sc.nextInt();
		
		System.out.println("vous avez saisi "+nombreA+" et "+nombreB);
		
		
		// inverser les nombres
		
		tmp = nombreB ;
		nombreB = nombreA;
		nombreA = tmp;
	
		System.out.println("Le nouvel ordre est "+nombreA+" et "+nombreB);
		
		
		
		
		
	}
	
	
	
	
}
