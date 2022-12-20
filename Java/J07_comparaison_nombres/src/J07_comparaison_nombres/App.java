package J07_comparaison_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer les variables
		
		int age;		
		
		Scanner sc = new Scanner(System.in);
		
		// Ecrire lire age
		
		System.out.println("Étes-vous majeur.e ?");
		System.out.println("Veuillez saisir votre âge.");
		age = sc.nextInt();
		
		System.out.println("Votre âge est : "+age);
		
		
		// Si -  aussi SI - SINON
		
		
		if (age<0) {
			 
			System.out.println("Vous n'êtes pas encore né.e !");
			
		}
		// && et || ou
		else if (age>0 && age<18) {
			
			System.out.println("Vous êtes mineur.e.");
		}
		
		
		else if (age>=18 && age<=122) {
			
			System.out.println("Vous êtes majeur.e.");
		}
		
		else {
			
			System.out.println("Vous êtes un fantôme ! 👻");
		}
	}

}
