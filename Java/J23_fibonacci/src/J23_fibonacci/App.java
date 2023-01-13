package J23_fibonacci;

/* Les 50 premiers nombres de la suite de Fibonacci  */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables

		long precedent = -1;
		long nombre = 1;
		long suivant;
		long i;

		// boucle + nafficher la suite

		

		for (i = 0; i < 50; i++) {

			suivant = precedent + nombre;
			System.out.println(i + " -> " + suivant);
			precedent = nombre;
			nombre = suivant;

		}

	}

}
