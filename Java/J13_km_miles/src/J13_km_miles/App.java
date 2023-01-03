package J13_km_miles;

/*L'utilisateur saisit une valeur en kilomètres comprise entre 0.01 et 1 000 000.
 * 
 *  Si la valeur est hors limite, l'utilisateur est invité à saisir une nouvelle valeur. 
 *  Si la valeur est égale à "q", le programme se termine et se ferme.  
Formule km vers mi :   	1 miles = 1.609 kilomètres 
Le programme affiche le résultat de la conversion sous forme de nombre réel double précision. 
*/

import java.util.*;


public class App {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarer les variables
		
		String texte;
		double miles;
	
		Scanner sc = new Scanner(System.in);
		
		// Ecrire lire valeur boucle 
		
		System.out.println("Conversion kilomètres miles");
		
	System.out.println("Veuillez saisir le nombre de kilomètres.");
		
		texte = sc.next() ;
		
		
		if (texte=="q") {
			
			System.out.println("Fin de programme");
		}
	
		
		else {	
			
			
			double dnum = new Double(texte);
			
			System.out.println("La valeur est"+dnum);
		}
			
		
		
		
		
		
		
		
		
		// conversion
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
