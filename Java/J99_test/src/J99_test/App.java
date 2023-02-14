package J99_test;

import java.util.*;
public class App {
	
	public double testDouble(double _test) {
		_test =1.234567;
		return _test;
	}

	
	public static void main(String[] args) {      
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String lettres ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//	char caract ;
		String nouvelleChaine = "" ;
		
	// Arrays.sort(lettres, Collections.reverseOrder());

		
		for (int i = lettres.length() - 1; i >= 0 ; i--) {
			
			// caract = lettres.charAt(i);
			
			nouvelleChaine = nouvelleChaine + lettres.charAt(i);
		}
		
		System.out.println(nouvelleChaine);  
		
		
		int j = 0;
		
		
		/*
		System.out.println(lettres.charAt(i)); 
		int i = 5;
		
		char caractere = lettres.charAt(i);
		System.out.println("Lettre "+caractere);
		
		*/
		
		
		
		
		
	
	}

}
