package J16_tableau;

import java.util.*;


/*
 * Soit un tableau de nombres entier triés par ordre croissant. 
Chercher si un nombre donné N figure parmi les éléments.  
Si oui, afficher la valeur de l'indice correspondant. Sinon, afficher « 404 Not found ». 

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables
		Scanner sc= new Scanner(System.in);
		
		
		int N;
		
		
		// construire tableau
	
		int[] tableau = new int[] {2, 5, 23, 47, 55, 67, 85, 99};
		
		
		// écriree lire nombre
		
		System.out.println("Veuillez saisir un nombre.");
		
		N = sc.nextInt();

		
		
		// parcourir tableau
		
		for (int i=0; i< tableau.length; i++) {
			
			if(N > tableau[i]) {
				i++;
			}
			
			else if (N == tableau[i]) {
				System.out.println("Le nombre "+N+" est en indice "+i);
				break;
			}
			
			else  {
				
				System.out.println("404 Not found !");
				break;
			
			}
		}
		
		
	
		
		
	}

}
