package J10_annee_bissextile;

import java.util.Scanner;
/*
 * Lire une année A.  
Déterminer si l'année A est bissextile. Si A n'est pas divisible par 4, l'année n'est pas bissextile. Si A est divisible par 4, l'année est bissextile sauf si A est divisible par 100 et pas par 400. 
Afficher le message « Bissextile » ou « Non bissextile » suivant le cas. 

 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclarrer les variables
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisr l'année ");

		annee = sc.nextInt();
		
		
		
		// lire écrire l'année
		while (annee % 1 == 0d) {
			System.out.println("Veuillez saisr l'année ");
			annee = sc.nextInt();
		}
		
		// if et else if 
		
		

	}

}
