package J12_nombre_premier;

import java.util.Scanner;

/*
 * Lire un nombre N et déterminer s’il est un nombre premier. Un nombre premier n'est divisible que par 1 et par lui-même. 
 */

public class App {
	public static void main(String[] args) {
	// déclarer les variables
	
	int nombre;
	int i=2;
	Scanner sc = new Scanner(System.in);
	
	// écrire lire nombre
	
	
	System.out.println("Savoir si un nombre est premier.");
	
	System.out.println("Veuillez saisir un nombre.");
	
	nombre = sc.nextInt();
	
	System.out.println("Vous avez saisi "+nombre);
	
	
	// boucle for
	
	/*for (int i=2; i < nombre; i++) {
		
		if(nombre%i ==0) {
			System.out.println("le nombre "+nombre+" n'est pas premier.");
			
		}
	}
	
	*/
	
	while (i>=2 && i<nombre) {
		
		if(nombre%i==0) {
			i++;
		}
		else {
			System.out.println("Le nombre "+nombre+" est premier.");
		}
		
	}
	
	
	}
	
	

}
