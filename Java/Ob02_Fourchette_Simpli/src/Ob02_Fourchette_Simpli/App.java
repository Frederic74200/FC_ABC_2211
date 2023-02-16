package Ob02_Fourchette_Simpli;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Fourchette fork = new Fourchette();
		
		int miniJoueur = fork.getMin() ; 
		int maxiJoueur = fork.getMax(); 
		int minPC = fork.getMin();
		int maxPC = fork.getMax();	
		
		
		
		
;		int nbCoupsMax = fork.getEssaisMax();
		
		
		System.out.println("min "+miniJoueur+" max "+maxiJoueur+" coups "+nbCoupsMax);
		
		
		
		
		
		
		
	}

}
