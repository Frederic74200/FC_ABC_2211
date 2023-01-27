package Ob02_Algo_suite;

import java.util.*;

public class Diviseur {

	public static boolean diviseur(int a, int b) {

		if (a % b == 0) {
			System.out.println("Le nombre " + a + " et le nombre " + b + " sont divisibles.");
			return true;
		}

		else {
			System.out.println("Le nombre " + a + " et le nombre " + b + " ne sont pas divisibles.");
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nb1;
		int nb2;

		System.out.println("Veuillez saisir le premier nombre.");
		nb1 = sc.nextInt();

		System.out.println("Veuillez saisir le deuxième nombre.");
		nb2 = sc.nextInt();

		diviseur(nb1, nb2);

	}

}
