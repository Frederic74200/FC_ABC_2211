package J21_carre_cercle;

 import java.util.Scanner;
/* a/ Dessine un carré de côté x cm et mesure la diagonale du carré au mm près.
     b/ Calcule le périmètre du cercle qui passe par les 4 sommets du carré. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// déclarer les variable
		
		int coteCm;
		int coteMm;
		Double diagonale;
		Double diagnoleCarre;
		Double circonference;
		Double pi = Math.PI;
		
		
		Scanner sc = new Scanner(System.in);
		
		// renseigner côter du carré
		
		System.out.println("Saisissez le côté du carré en centimètres.");
		coteCm = sc.nextInt();
		
		
		
		// conversion cm mm
		
		coteMm = 10*coteCm;
		
		
		// calculer la diagonale 
		
		diagnoleCarre =2* Math.pow(coteMm, 2);
		diagonale = Math.sqrt(diagnoleCarre);
		
		
		
		
		// Calculer le périmètre
		
		 circonference = diagonale*pi;
		
		int diagonaleInt = (int) Math.round(diagonale);
		int circonferenceInt = (int) Math.round(circonference);
		
		System.out.println("La diagonale du carré mesure "+diagonaleInt+" milimètres");
		System.out.println("La circonférence du cercle mesure "+circonferenceInt+" milimètres");
	}

}
