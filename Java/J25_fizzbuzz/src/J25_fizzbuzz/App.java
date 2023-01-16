package J25_fizzbuzz;

import java.util.*;

/* Écrivez une méthode qui renvoie « Fizz » pour des multiples de trois et « Buzz » pour des multiples de cinq.

Pour les nombres qui sont des multiples de trois et de cinq, retournez « FizzBuzz ».

Pour les nombres qui ne sont ni l’un ni l’autre, renvoyez le nombre saisi. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclarer les variables

		int nombre;
		boolean repete ;
		Scanner sc = new Scanner(System.in);

		// boucle do while

		do {
			System.out.println("saisiez un nombre.");
			nombre = sc.nextInt();

			if (nombre % 3 == 0 && nombre % 5 == 0) {
				System.out.println("FizzBuzz");
				repete = true;
			}

			else if (nombre % 3 == 0) {
				repete = true;
				System.out.println("Fizz");
			}

			else if (nombre % 5 == 0) {
				repete = true;
				System.out.println("Buzz");
			}

			else {
				repete = false;				
			}

		} while (repete == false);

		sc.close();
	}

}
