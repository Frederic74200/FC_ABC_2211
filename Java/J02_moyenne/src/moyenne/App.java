package moyenne;

// importer composant scanner
import java.util.Scanner;

public class App {
	
	
	/*
	 * VARIABLES
		 * nombre1 est un entier; 
		 * nombre2 est un entier;
		 * moyenne est un réel;
	 * 
	 * 
	 * DEBUT PROGRAMME
		 * Ecrire « Programme de calcul de la moyenne de 2 nombres »
		 * 
		 *	Ecrire « Veuillez saisir un premier nombre »
		 *
			Lire nombre1
			
			Nombre1  est un entier
			
			Ecrire « Veuillez saisir un deuxième nombre »
			
			Lire nombre2
			
			Nombre2 est un entier
			
			Moyenne  (nombre1 + nombre2)/2
			
			Moyenne est un reel double precision
			
			Ecrire « La moyenne de » nombre1 « et » nombre2 « est » moyenne 
		FIN PROGRAMME
 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//VARIABLE
		int nombre1;
		int nombre2;
		double moyenne;
		// sc abréviation de scanner
		Scanner sc = new Scanner(System.in); // Permet de lire les saisies utilisateur
		
				
		//D2BUT PROGRAMME
		System.out.println("Programme de calcul de la moyenne de 2 nombres");
		
		
		// Saisie + lecteure 1er nombre
		System.out.println("Veuillez saisir le premier nombre");
		
		nombre1 = sc.nextInt(); // obliger l'utilsateur à saisir un nombre entier 
		
		System.out.println("Vous avez saisi : "+nombre1);
		
		// Saisie + lecture 2ème nombre 
		
		System.out.println("Veuillez saisir le deuxième nombre");
		
		nombre2 = sc.nextInt();
		
		System.out.println("Vous avez saisi : "+nombre2);
		
		// ajouter d azprès un nombre le rend réél double 
		moyenne = (nombre1+nombre2)/2d;
				
		System.out.println("La moyenne des deux nombres est : "+moyenne);

	}

}
