package Ob03_Fouchette_retour;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fourchette fork = new Fourchette();
		//------
		
		Boolean rejouer = fork.setJouerEncore(true); 
		String encore = "r";
		String again; 
		String againCasse;
		//-----
		
		
		Boolean jouerContreOrdi = fork.setJouerContrePC(true);
		String pc ="pc";
		String contrepc;
		String contrepcCase;
		//----
		
		Boolean joueurGagne = fork.victoireUser();
		Boolean pcGagne = fork.victoireComputer();
		Boolean egal = fork.egalite();
		Boolean perdu = fork.joueurPerdSeul();
		//------
		
		int proposition = fork.propositionUser(0);
		Boolean valide = fork.validerPropositionUser();
		
		int max = fork.getMaxUser();
		int min = fork.getMinUser(); 
		
		
		
		do {
			System.out.println("Saisissez PC si vous souhaitez jouer contre l'ordinateur sinon saisissez n'importe quelle lettre.");
			contrepc = sc.nextLine();
			contrepcCase =contrepc.toLowerCase();
			
			if (contrepcCase.equals(pc)) {
				jouerContreOrdi = true;
				fork.definirNombreAleatoire();
				fork.jouerContrePC();
				do {
					
					do {
						do {
							System.out.println("saisisez un nouveau nombre entre "+min+" et "+max);
							proposition = sc.nextInt();
							
							valide = fork.validerPropositionUser();
							
							if (valide == false) {  // ???????????????????????????????????????????????
								System.out.println("Saisie invalide ! Veuillez recommencer.");

							}
							
							else {
								valide = true;
								
							}
							
							
						} while (valide == false);
						
						fork.nouvelleFourcehtteUser();
						joueurGagne = fork.victoireUser();
						egal = fork.egalite();
						fork.definirPropositionComputer();
						System.out.println("L'ordinateur a joué.");
						pcGagne = fork.victoireComputer();
						egal = fork.egalite();
						
						
						
					} while (joueurGagne == false && pcGagne == false && egal == false ); 
					
					
					
					
					jouerContreOrdi = false;
					
					
					
				}				
				while (jouerContreOrdi == true) ;
				
			}
			//--------------------------------------------------------------------------
			else {
				jouerContreOrdi = false;
				
				do {
				do {
					do {
						System.out.println("saisisez un nouveau nombre entre "+min+" et "+max);
						proposition = sc.nextInt();
						
						valide = fork.validerPropositionUser();
						
						if (valide == false) {  // ???????????????????????????????????????????????
							System.out.println("Saisie invalide ! Veuillez recommencer.");

						}
						
						else {
							valide = true;
							
						}
						
						
					} while (valide == false);
					
					fork.nouvelleFourcehtteUser();
					joueurGagne = fork.victoireUser();
					perdu = fork.joueurPerdSeul(); 
					
					
					
				} while (joueurGagne == false && perdu == false  ); 
				}
				
				while (jouerContreOrdi == false) ;
			}
			
			
			
			
			
			
				
				
				
				
				
			
			
			
			
			System.out.println("Appuyez sur R jour rejouer ou sur une autre lettre pour quitter la partie");
			again = sc.nextLine();
			againCasse = again.toLowerCase();
			
			if (againCasse.equals(encore)) {
				rejouer = true;
			}
			
			else {
				rejouer = false;
			}
		} while (rejouer == true) ; 
		
		
		System.out.println("Merci d'avoir jouer et à bientot");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
