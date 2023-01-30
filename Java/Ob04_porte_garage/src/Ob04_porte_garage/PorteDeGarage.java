package Ob04_porte_garage;
import java.util.*;

public class PorteDeGarage {
	
	private String nomPorteGrarage;
	
	private boolean verouillee;
	private int tauxOuverture ;
	private boolean ouvertPartiel ;
	private boolean ouvertEntier;
	private boolean fermee;
	
	
	
	
	public PorteDeGarage() { // porte par défaut
		
		this.nomPorteGrarage = "Porte de gararge par défaut";
		
		this.verouillee = true;
		this.tauxOuverture  = 0;
		this.ouvertPartiel = false; 
		this.ouvertEntier = false;
		this.fermee = true;		
	}
	
	

	public PorteDeGarage( String _nomPorteDEGararge, boolean  _verrouillee,  
			int _tauxOuverture, boolean _ouvertPartiel , boolean _ouvertEntier, boolean _fermee ) { // porte à construie
		
		this.nomPorteGrarage = _nomPorteDEGararge;
		
		this.verouillee =  _verrouillee;
		this.tauxOuverture  = _tauxOuverture ;
		this.ouvertPartiel = _ouvertPartiel ;
		this.ouvertEntier = _ouvertEntier;
		this.fermee =_fermee;		
	}
	
	
	
	
	public void nomPorte() { // infos porte
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le nom de la porte de garage.");
		this.nomPorteGrarage = sc.nextLine();
		
		System.out.println("Le nom de la porte est : "+this.nomPorteGrarage );
		
	}
	
	
	
	public boolean verrouiller() {
		
		
		if (this.fermee == true) {
		
			if (this.verouillee == true ) {
		
				System.out.println("La porte est vérouillée ! ");
				return false;
			}
			else {
				return true;
			}		
		
		} 		// if fermme
		
		else {
			return false; 
		}
	}
	
	

	
	public boolean ouvrirPartiel() {
		
		if (this.verouillee == false && this.tauxOuverture > 0 && this.tauxOuverture < 100) {
		
		if (this.ouvertPartiel == true ) {
			System.out.println("La porte est ouverte à :"+this.tauxOuverture+" %.");
			return false;
		}
		else {
			return true;
		}
		}
		
		else {
			
			return true;
		}
	}
	
	
	public boolean ouvrirEntier() {ouvertPartiel 
		if (this.verouillee == false ) {
		
		if (this.ouvertEntier == true ) {
			this.tauxOuverture = 100;
			System.out.println("La porte est complétement ouverte ! ");
			return false;
		}
		else {
			return true;
		}
		}
		else {
			return true;
		}
	}
	
	
	public boolean fermer() {
		
		if (this.fermee == true ) {
			this.tauxOuverture = 0; 
			System.out.println("La porte est fermée ! ");
			return false;
		}
		else {
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {  
		
		
		
		
		
		
		
		
		System.out.println("_____________________________________________________");
		
	}

	
	public static void bis(String[] args) {  
		
		
		
		
	}
	
	
	public static void ter(String[] args) {  
		
		
		
		
	}
	
	
	public static void quad(String[] args) {  
		
		
		
		
	}
}
