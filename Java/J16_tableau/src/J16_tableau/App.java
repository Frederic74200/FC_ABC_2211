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
		Scanner sc = new Scanner(System.in);

		int N;
		int i ;
		boolean trouve ;
		int present =0;

		// construire tableau

		int[] tableau = new int[] { 2, 5, 23, 47, 55, 67, 85, 99 };

		// écriree lire nombre

		System.out.println("Veuillez saisir un nombre.");

		N = sc.nextInt();

		// parcourir tableau

		for ( i=0; i < tableau.length; i++) {
		
			if (tableau[i] == N) {
				trouve = true;
				present = present+1;
				break;
			}
			
			else if ( i==8) {
				trouve = true;
				break;
				
			}
			
			else {
				trouve = false;
			}
		}

		if (present==1) {
			
			System.out.println("Le nombre " + N + " est en indice " + i);
		}
		
		else  {
			System.out.println("404 Not found !");
		}
	}

}
