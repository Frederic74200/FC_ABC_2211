package J27_add_chiffres_nb;

import java.util.Scanner;
/*

Écrivez un programme qui lit un entier entre 0 et 1000 et
 calcul la somme de tous les chiffres. 
 Par exemple, le nombre 122, la somme de tous ses chiffres est 5

*/
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables
		
		int nombre;
		String chaine;
		int taille;
		int tableau[];
		
		Scanner sc = new Scanner(System.in);
		// do while <0 >100
		
		do {
			System.out.println("Saisiser un nombre entre 0 et 1000.");
			nombre = sc.nextInt();
			
		} while (nombre < 0 || nombre > 1000);
		
		
		System.out.print("Le nombre est : "+ nombre);
		// total
		
		chaine = String.valueOf(nombre); // conversion nombre en chaîne
		
		
		
		tableau = new int[chaine.length()];
		
		
		for (int i =0 ; i< tableau.length; i++) {
			
			tableau[i] = Integer.valueOf(chaine[i]);
			
		}
		
	}

}
