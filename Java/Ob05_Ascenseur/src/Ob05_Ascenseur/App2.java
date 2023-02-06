package Ob05_Ascenseur;

import java.util.*; 


public class App2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Ascenseur asc2 = new Ascenseur();
		
		String printAsc2 = asc2.toString();
		
		System.out.println(printAsc2);
		
		
		// Variables 
		
		int etageActuel = asc2.getPositionEtage();
		int etageVoulu;
	
		
		System.out.println("Etage actuel : " + etageActuel);
		System.out.println("A quel étage souhaitez-vous aller ?");
		etageVoulu = sc.nextInt();
		
		
		int etageDemande = asc2.setEtageDemande(etageVoulu);
		
		System.out.println("Etage voulu : "+etageDemande);
		
		
		asc2.fermer();
		asc2.doitDescendre();
		asc2.descendre(); 
		System.out.println("Etage actuel : " + etageActuel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}  
