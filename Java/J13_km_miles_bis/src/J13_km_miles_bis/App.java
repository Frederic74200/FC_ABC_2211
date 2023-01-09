package J13_km_miles_bis;

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
		
		double km; 
		double miles;
		String quit = "q";
		String saisie_utilisateur;
		boolean fermeture_prog = false;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(!fermeture_prog)
	    {
	        System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
	        saisie_utilisateur = sc.nextLine();
	        if(saisie_utilisateur.equals(quit))
	        {
	        	fermeture_prog = true;
	        	System.out.println("programme terminé !");
	        }
	        else 
	        {
	            km = Double.parseDouble(saisie_utilisateur);
	            if(km < 0.01 || km > 1000000)
	            {
	            System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
	            saisie_utilisateur = sc.nextLine();
	            }
	            else 
	            {
	            miles = km/1.609;
	            System.out.println(km + " kilomètres valent : "+miles+" miles");
	            }
	        }
	    }     
		
		
		
		

	}

}
