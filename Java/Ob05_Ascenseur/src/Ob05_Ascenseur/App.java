package Ob05_Ascenseur;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		Ascenseur asc = new Ascenseur("Hôtel Hondor", "498 23 54", -2, 6, 0, false);
		 String newAsc = asc.toString();
		System.out.println(newAsc);
		
		/*	private int etageDemande;
	private Boolean ascenseurDoitMonter;
	private Boolean AscenseurDoitDescendre;
	*/
		
		 asc.setEtageDemande(4);
		Boolean tuMontes = asc.doitMonter();
		Boolean monte = asc.monter();
		Boolean ouvre = asc.ouvrir();
		Boolean 
		 
		 System.out.println(asc.toString()); 
		
		 System.out.println("Point d'arret");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
