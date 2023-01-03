package J04_secteur_angulaire;

import java.util.Scanner;


/*
 * 
 * Ecrire « saisir le rayon R d'un cercle et un angle A »

Lire R
R est un entier
Lire A
A est un entier
Aire  𝝅𝑹 𝟐𝑨/ 𝟑𝟔𝟎
Aire est un reel double
Ecrire « L’aire du secteur angulaire est : » aire

 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarer variables
		
		int rayon;
		int angle;
		double pi = Math.PI;
		double aire;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// écrire et lire rayon et angle
		
		System.out.println("Calcul de la surface d'un secteur circulaire.");
		
		System.out.println("Veuillez saisir le rayon : ");
		
		rayon = sc.nextInt();
		
		System.out.println("Vous avez saisi : "+rayon);
		
		System.out.println("Veuillez saisir l'angle ; ");
		
		angle = sc.nextInt();
		
		System.out.println("Vous avez saisi : "+angle);
		
		
		
		// Calcul de l'aire
		
		
		aire = (pi*Math.pow(rayon, 2)*angle)/360d;
		
		System.out.println("la surface du secteur est : "+aire);
		
		
		
		sc.close();

	}

}
