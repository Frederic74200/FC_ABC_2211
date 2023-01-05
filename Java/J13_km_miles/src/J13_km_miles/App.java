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
		
		String chaine;
		char texte = 112;
		double nombre = -1.0;
		double miles;
		
		Scanner sc = new Scanner(System.in);
		
		// Ecrire lire valeur boucle 
		
		System.out.println("Conversion kilomètres miles");
		
		 
			//  System.out.println("Le nombre est"+nombre);
			     
      		
		while ( texte != 113   || nombre<0.01d || nombre>1000000d ) {
			
			System.out.println("Veuillez saisir le nombre de kilomètres.");
			
			chaine = sc.next() ;
			
			System.out.println("Vous avez saisi : "+chaine);
			texte = chaine.charAt(0); 
			nombre = Double.parseDouble(chaine);
		}
		
		
		if (texte==113) {
			
			System.out.println("programme terminé !");
		
			
		}
		
		
		else {
			
			miles = nombre*1.609;
			
			System.out.println(nombre+" kilomètres équivalent à "+miles+" miles.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
