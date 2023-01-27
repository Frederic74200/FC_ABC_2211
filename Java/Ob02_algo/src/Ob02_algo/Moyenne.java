package Ob02_algo;

import java.util.*;

public class Moyenne {

	public static double moyenne(double a, double b) {

		double moy = (a + b) / 2;
		return moy;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nombre1;
		double nombre2;

		System.out.println("Veuillez saisir le premier nombre.");
		nombre1 = sc.nextDouble();

		System.out.println("Veuillez saisir le deuxième nombre.");
		nombre2 = sc.nextDouble();

		System.out.println(
				"La moyenne des nombres " + nombre1 + " et " + nombre2 + " est : " + moyenne(nombre1, nombre2));

	}

}
