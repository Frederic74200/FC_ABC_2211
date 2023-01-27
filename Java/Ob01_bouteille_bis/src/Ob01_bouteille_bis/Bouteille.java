package Ob01_bouteille_bis;
 import java.util.*;
public class Bouteille {
	
	// déclaration des attributs
	private String nomBouteille;
	private String typeLiquide;
	private String typeMateriau;
	
	private int capaciteCl;
	private int quantitePlusCl;
	private int quantiteMoinsCL;
		
	private int quantiteDansBouteille;
	private int volumeDispo;

	
	private boolean ouvrir;
	private boolean fermer;
	
	private boolean viderTout;
	private boolean remplirTout;
	
	
	
	// mise en place des méthodes
	
	
	public static void infoBouteille() {
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Veuillez saisir le nom de la bouteille ?");
		String nomBouteille = sc.nextLine();
		
		System.out.println("Veuillez saisir le type de liquide contenu dans la bouteille ?");
		String typeLiquide = sc.nextLine();
		
		System.out.println("Veuillez saisir le matériau de la bouteille ?");
		String typeMateriau = sc.nextLine();
		
		System.out.println(" La bouteille "+nomBouteille+"_Bouteille /r/n"
							+"/t Contient : "+typeLiquide
							+"/t est en : "+typeMateriau );	
		
	}
	
	
	public static int info2Bouteille() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la capacité de la bouteille en centilitres.");
		int capaciteCl = sc.nextInt(); 
		
		
		System.out.println("Veuillez saisir la quantité de liquide /r/n"
				+"actuellement présente de la bouteille en centilitres.");
		int quantiteDansBouteille = sc.nextInt(); 
		
		return capaciteCl + quantiteDansBouteille;
	}
	
	
	
	public static boolean ouvrir (boolean ouvrir) {
		Scanner sc = new Scanner(System.in);
		
		String verif = "o";
		
		System.out.println("Appuyez sur o pour ouvrir la bouteille ou sur une autre touche pour ignorer cette étape..");
		
		String ouverture = sc.nextLine();
		
		String ouvCasse = ouverture.toLowerCase();
		
		if (ouvCasse.equals(verif)) {
			
			System.out.println("La bouteille est ouverte.");
			
			ouvrir = true;
		}
		
		else {
			ouvrir = false;
		}	
		
		return ouvrir; 
	}
	
	
	public static boolean fermer (boolean fermer) {
		Scanner sc = new Scanner(System.in);
		
		String verif = "f";
		
		System.out.println("Appuyez sur f pour fermer la bouteille ou sur une autre touche pour ignorer cette étape..");
		
		String fermeture = sc.nextLine();
		
		String fermCasse = fermeture.toLowerCase();
		
		if (fermCasse.equals(verif)) {
			
			System.out.println("La bouteille est fermée.");
			
			fermer = true;
		}
		
		else {
			fermer = false;
		}	
		
		return fermer; 
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	
}
