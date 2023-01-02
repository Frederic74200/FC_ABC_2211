package J11_diviseurs_bis;

import java.util.Scanner;
/* Lire un nombre entier et afficher tous ses diviseurs autres que 1 et lui-même.   */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables 
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		// écrire lire nombre
		
		System.out.println("Afficher les diviseurs d'un nombre.");
		System.out.println("Veuillez saisir un nombre.");
		
		nombre = sc.nextInt();
		
		System.out.println("Vous avez saisi : "+nombre);
		
		
		// boucle for
		
		for(int i=2; i < nombre; i++) {
			
			if(nombre%i ==0) {
				System.out.println("Les diviseurs du nombre "+nombre+" sont "+i);
			}
			
	
			
		}
		
	}

}
