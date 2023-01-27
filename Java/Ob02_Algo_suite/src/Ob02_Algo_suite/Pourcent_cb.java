package Ob02_Algo_suite;

import java.util.*;

public class Pourcent_cb {

	public static double arrondi(double nombre) {

		double arrondi;

		arrondi = Math.round(nombre * 100);

		arrondi = arrondi / 100;

		return arrondi;
	}

	public static void pourcent(double a, double b, double c) {

		double total = a+b+c;
		double pourcentA;
		double pourcentB;
		double pourcentC;

		pourcentA = a / (a + b + c) * 100;

		pourcentA = arrondi(pourcentA);

		pourcentB = b / (a + b + c) * 100;

		pourcentB = arrondi(pourcentB);

		pourcentC = c / (a  + b + c) * 100;

		pourcentC = arrondi(pourcentC);

		System.out.println("Vous avez émis : " + Math.round(total) + " ordres de débit dont : \r\n"
				+ pourcentA+ " % par Carte Bleue \r\n" 
				+ pourcentB + " % par cheque \r\n" 
				+ pourcentC + "  % par virement");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cb;
		int chq;
		int vir;
		

		System.out.println("Veuillez saisir le nombre de payements par carte bleue.");
		cb = sc.nextInt();

		System.out.println("Veuillez saisir le nombre de chèques émis.");
		chq = sc.nextInt();

		System.out.println("Veuillez saisir le nombre de virements auttomatiques.");
		vir = sc.nextInt();
		
		pourcent(cb, chq, vir); 
		
	}
}
