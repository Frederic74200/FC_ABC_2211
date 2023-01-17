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
		int dix;
		int cent;
		int mille;
		int reste;
		int total;
		
		Scanner sc = new Scanner(System.in);
		// do while <0 >100
		
		do {
			System.out.println("Saisiser un nombre entre 0 et 1000.");
			nombre = sc.nextInt();
			
		} while (nombre < 0 || nombre > 1000);
		
		
		System.out.println("Le nombre est : "+ nombre);
		
			reste = nombre % 1000;
			
			mille = (nombre- reste) / 1000;
			
			nombre = reste; 
			
		System.out.println("Le mille est : "+ mille);
		
		reste = nombre % 100;
		
		cent = (nombre- reste) / 100;
		
		nombre = reste; 
		
		System.out.println("Le cent est : "+ cent);
		
		
		reste = nombre % 10;
		
		dix = (nombre- reste) / 10;
		
		
		
		System.out.println("Le dix est : "+ dix);
		
		
		System.out.println("Le reste est : "+ reste);
		
		
		// total
		
		total = mille + cent + dix + reste ;
		
		System.out.println("le total est : "+total );
			
		
		
	}

}
