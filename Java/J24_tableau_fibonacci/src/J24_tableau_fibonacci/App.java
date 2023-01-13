package J24_tableau_fibonacci;


/* Les 20 premiers nombres de la suite de Fibonacci dans un tabbleau */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables
		
		int tableau[];
		int i=0;
		tableau = new int[20];
		tableau[0] =0;
		tableau[1] = 1;
		tableau[2] = tableau[1] + tableau[0];
		// construire le tableau
		
		for (i=0; i<20; i++ ) {
			
			tableau[i] = tableau[i-1] + tableau[i-2];
			
			System.out.println(tableau[i]);
		}
		
		
		
		
		
		
		
		
	}

}
