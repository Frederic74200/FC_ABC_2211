package J13_km_miles;

/*L'utilisateur saisit une valeur en kilomètres comprise entre 0.01 et 1 000 000.
 * 
 *  Si la valeur est hors limite, l'utilisateur est invité à saisir une nouvelle valeur. 
 *  Si la valeur est égale à "q", le programme se termine et se ferme.  
Formule km vers mi :   	1 miles = 1.609 kilomètres 
Le programme affiche le résultat de la conversion sous forme de nombre réel double précision. 
*/

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		String chaine;
		String quit = "q";
		Boolean termine = false;
		double nombre;
		double miles;

		Scanner sc = new Scanner(System.in);

		// Ecrire lire valeur boucle

		System.out.println("Conversion kilomètres miles");

		// System.out.println("Le nombre est"+nombre);

		do {

			System.out.println("Veuillez saisir le nombre de kilomètres.");

			chaine =sc.next();

			System.out.println("Vous avez saisi : " + chaine);

		

			if (chaine.equals(quit) ) {
				
				System.out.println("programme terminé !");
				termine = true;
				break;
			}
			
			
				try{
		             nombre = Double.parseDouble(chaine);
		            System.out.println(nombre); 
		          
		        }
		        catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
				
				
				
			for (nombre = 0.01d; nombre < 1000000d;) {
					termine = true;
					
			}
				
				
			
			
		} while (termine = false );

		// quitter ou calcul

	

			miles = nombre / 1.609d;

			System.out.println(nombre + " kilomètres équivalent à " + miles + " miles.");

		

		sc.close();
		

	}

}
