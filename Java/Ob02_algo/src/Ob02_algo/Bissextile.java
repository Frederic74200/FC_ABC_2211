package Ob02_algo;

import java.util.*;

public class Bissextile {

	public static Boolean bissextile(int annee) {

		if ((annee % 100 == 0 && annee % 400 != 0) || annee % 4 != 0) {
			System.out.println("l'année " + annee + " n'est pas bissextile.");
			return false;
		}

		else {
			System.out.println("l'année " + annee + " est bissextile.");
			return true;
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int annee;

		Scanner sc = new Scanner(System.in);

		// lire écrire l'année
		System.out.println("Veuillez saisr  une année passée.");

		annee = sc.nextInt();

		System.out.println("Vous avez saisi l'année : " + annee);

		bissextile(annee);

		sc.close();
	}

}
