package Ob02_algo;

import java.util.*;
public class App {

	
	public static void inverser_nombres(int a, int b) {		
	
		
	int tmp;
	
	tmp = a;
	a =b;
	b = tmp;
	System.out.println("Le nouvel ordre est : "+ a + " " + b);
	
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Veuillez siasir le nombre a");
		int nombre1 = sc.nextInt();
		
		System.out.println("Veuillez siasir le nombre b ");
		int nombre2 = sc.nextInt();
		
		inverser_nombres(nombre1,nombre2);
		
		sc.close();
		

	}

}
