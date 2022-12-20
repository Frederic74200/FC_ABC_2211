package J03_sphere;

import java.util.Scanner;

/*
	 * Ecrire « Veuillez écrire la valeur du rayon R » 
	Lire R
	R est un entier
	Aire4 π R²
	Aire est un reel double
	Volume 4/3 π R3    	
	Volume est un réel double
	Ecrire « l’aire de la sphère est » +Aire
	Ecrire  « Le volume de la sphère est de » +Volume
	 
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Déclarer les variables 
		
		int rayon;
		// attribuer la valeur Pi à une variable 
		double pi = Math.PI;
		double aire ;
		double volume ;
		
		Scanner sc = new Scanner(System.in);
		
		// Saisie lecture du rayon
		
		System.out.println("Calcul de l'aire et du volume d'une sphère");
		
		System.out.println("Veuillez saisir le rayon : ");
		
		rayon = sc.nextInt();
		
		System.out.println("Vous avez saisi : "+rayon);
		
		
		
		// Calcul aire
		
		
		// puissances Math.pow ( nombre , puissance )
		
		
		aire = 4*pi*Math.pow(rayon, 2);
		
		System.out.println("L'aire de la sphère est : "+aire);
		
		
		// calcul volume

		
		volume = (4*pi*Math.pow(rayon, 3))/3d;
		
		System.out.println("Le volume de la sphère est : "+volume);
	}

}
