package Ob02_algo;

import java.util.*;

public class Triangle {

	public static double perimetre(double a, double b, double c) {

		double p;

		p = a + b + c;

		return p;

	}

	public static double aire(double a, double b, double c) {

		double intermediaire;
		double er;
		double p = perimetre(a, b, c);

		intermediaire = ((p / 2 - a) * (p / 2 - b) * (p / 2 - c));
		er = Math.sqrt(intermediaire);

		return er;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir la longueur du premier côté du triangle.");
		double d = sc.nextDouble();

		System.out.println("Veuillez saisir la longueur du deuxième côté du triangle.");
		double e = sc.nextDouble();

		System.out.println("Veuillez saisir la longueur du troisième côté du triangle.");
		double f = sc.nextDouble();

		System.out.println("Les 3 côtés du triangle mesurent : " + d + ", " + e + " et " + f);

		System.out.println("Le périmètre du triangle mesure :" + perimetre(d, e, f));

		System.out.println("L'aire du traingle est : " + aire(d, e, f));

	}

}
