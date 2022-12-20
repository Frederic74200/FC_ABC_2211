package J05_calcul_interets;

import java.util.Scanner;


/*
 * Lire la somme S placée sur un compte, l'intérêt i offert par la banque et le nombre N d'années de placement de la somme S. 
 
Calculer et afficher la valeur acquise par la somme S placée pendant N années 

 * Ecrire « Veuillez entrer la somme »
Lire S
S est un entier
Ecrire « Veuillez entrer le taux d’intérêt »
Lire i
I est un entier
Ecrire  « Veuillez entrer le nombre d’années du placement »
Lire N
N est un entier
Somme1  S * ( 1 + N * i )
Somme1 Est un  reel double
Somme2  S * (1 + i ) N 
Somme2 est un réel double
Ecrire « La somme avec un intérêt simple est » ; somme1 ;  « et la somme avec un intérêt composé est » ; somme 2
Fin

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// déclarer les variables
		
		int somme;
		int tauxInteret;
		int nbAnnees;
		double interetSimple;
		double interetCompose;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// écrire lire somme, taux inérêt , années
		
		
		System.out.println("Calcul d'un intérêt simple et d'un intérêt composé.");
		
		System.out.println("Veuillez siaisr la somme de départ.");
		somme = sc.nextInt();
		System.out.println("Vous avez saisi : "+somme);
		
		
		System.out.println("Veuillez siaisr le taux d'intérêts.");
		tauxInteret = sc.nextInt();
		System.out.println("Vous avez saisi : "+tauxInteret);
		
		
		System.out.println("Veuillez siaisr le nombre d'années.");
		nbAnnees = sc.nextInt();
		System.out.println("Vous avez saisi : "+nbAnnees);
		
		
		
		// calcul intére^t simple et intéreêt composé 
		
	/*	interetSimple = (somme*(1+nbAnnees*tauxInteret/100d))-somme ;
		
		
		interetCompose =  (somme*Math.pow(1+tauxInteret/100d, nbAnnees))-somme ;
		
		*/
		
		
		interetSimple = somme*(1+nbAnnees*tauxInteret/100d);
		
		interetCompose =  somme*Math.pow(1+tauxInteret/100d, nbAnnees) ;
		
		
		System.out.println("L'intérêt simple est : "+interetSimple);
		
		System.out.println("L'intérêt composé est : "+interetCompose);
		
		

	}

}
