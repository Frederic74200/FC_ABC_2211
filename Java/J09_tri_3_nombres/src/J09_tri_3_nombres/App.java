package J09_tri_3_nombres;

import java.util.Scanner;

/*
 Lire 3 nombres réel double précision a, b et c. Les écrire dans l'ordre croissant. 
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// déclarer les variables 
		
		double a;
		double b;
		double c;
		double p1;
		double p2;
		double p3;
		
		Scanner sc = new Scanner(System.in);
		
				
		// écrire lire les 3 nombres
		
		System.out.println("tri de 3 nombres réels dans l'ordre croissant.");
		
		
		System.out.println("Veuillez saisir le premier nombre.");
		a = sc.nextDouble();		
		
		System.out.println("Veuillez saisir le deuxième nombre.");
		b = sc.nextDouble();
		
		
		System.out.println("Veuillez saisir le troisième nombre.");
		c = sc.nextDouble();
		
		
		System.out.println("vous avez saisi : "+a+" , "+b+" et "+c);
		
		
		// si dans si + si dans si 
		
		
		if (a<b) { p1=a; p2=b;
				if (c>p2) {	p3=c;}
				else if (c<p1) {p3=p2; p2=p1; p1=c;	}
				else {p3=p2; c=p2;}
		}
		
		
		if (a>b) { p1=b; p2=a;
		if (c>p2) {	p3=c;}
		else if (c<p1) {p3=p2; p2=p1; p1=c;	}
		else {p3=p2; c=p2;}
}
		
		
		
		// afficher le résultat
		
		
		System.out.println( "l'ordre des nombres est : "+p1+" ; "+p2+" ; "+p3);
		
		
		
		
	}

}
