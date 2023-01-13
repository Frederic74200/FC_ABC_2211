package J22_table_multiplication;

import java.util.*;
/* écrire la table de multiplication d'un nombre donné de fois 1 à fois 10 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// déclarer les variables
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		int nombre;
		int multiple;
		
		// écrire lire nombre
		
		System.out.println("Saisissez un nombre.");
		nombre = sc.nextInt();
		
		// boucle while
		
		while (i<= 10) {
			multiple = i*nombre;
			System.out.println(nombre+" X "+i+" = "+multiple);
			i++;
			
		}
		
		for (i=1; i<=10; i++) {
			
			multiple = i*nombre;
			System.out.println("for "+nombre+" X "+i+" = "+multiple);
		}
		
		
		
		
	}

}
