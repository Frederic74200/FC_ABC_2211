package Ob97_test_abcdefg;

enum Abscisse {
	A, B, C, D, E, F, G
};

public class Robot {

	public static void main(String[] args) {
		

		for (Abscisse Xname : Abscisse.values()) {
			System.out.println("Xname : " + Xname + " = " + Xname.ordinal());
			
		}
		System.out.println("Fin");
	

	
	
	}
}
