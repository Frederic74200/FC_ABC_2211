package Ob05_Ascenseur;

public class Ascenseur {

	// privates variables

	private String nomImmeuble;
	private String numAscenseur;
	private int etageMin;
	private int etageMax;
	private int positionEtage;
	private Boolean porteOuverte;

	private int etageDemande;
	private Boolean ascenseurDoitMonter;
	private Boolean AscenseurDoitDescendre;
	
	
	// Constructeurs
	// -----------------------------------------------------------------------------------------------------------------

	public Ascenseur() {

		this.nomImmeuble = "Tour CRM";
		this.numAscenseur = "Ascenseur 1";
		this.etageMin = 0;
		this.etageMax = 9;
		this.positionEtage = 7;
		this.porteOuverte = true;
	}

	public Ascenseur(String _nomImmeuble, String _numAscenseur, int _etageMin, int _etageMax, int _positionEtage,
			Boolean _porteOuverte) {

		this.nomImmeuble = _nomImmeuble;
		this.numAscenseur = _numAscenseur;
		this.etageMin = _etageMin;
		this.etageMax = _etageMax;
		this.positionEtage = _positionEtage;
		this.porteOuverte = _porteOuverte;
	}

	// Fonctions
	// ----------------------------------------------------------------------------------------------------------------

	// numérotation étages
	

	// ouvrir
	public boolean ouvrir() {

		if (this.porteOuverte == false) {
			this.porteOuverte = true;
			return true;
		} else {
			return false;
		}
	}

	// fermer
	public boolean fermer() {

		if (this.porteOuverte == true) {
			this.porteOuverte = false;
			return true;
		} else {
			return false;
		}
	}

	// doit monter
	public boolean doitMonter() {

		if (this.porteOuverte == false && this.etageDemande > this.positionEtage && this.etageDemande <= this.etageMax) {
		
			this.ascenseurDoitMonter = true;
			this.AscenseurDoitDescendre = false;
			return true;
		} else {
			return false;
		}
	}

	// doit descendre

	public boolean doitDescendre() {

		if (this.porteOuverte == false &&this.etageDemande < this.positionEtage && this.etageDemande >= this.etageMin) {

			
			this.ascenseurDoitMonter = false;
			this.AscenseurDoitDescendre = true;
			return true;
		} else {
			return false;
		}
	}

	// monter

	public boolean monter() {

		if (this.porteOuverte == false && this.ascenseurDoitMonter == true) {
			this.positionEtage = this.etageDemande;

			return true;
		} else {
			return false;
		}
	}

	// descendre

	public boolean descendre() {

		if (this.porteOuverte == false && this.AscenseurDoitDescendre == true) {
			this.positionEtage = this.etageDemande;
			return true;
		} else {
			return false;
		}
	}
	
	
	// get set
	// -------------------------------------------------------------------------------------------------------------------

	// get ---------------------

	public int getEtageMin() {
		return this.etageMin;
	}
	
	public int getEtageMax() {
		return this.etageMax;
	}
	
	public int getPositionEtage() {
		return this.positionEtage;
	}
	
	public int getEtageDemande(){
		return this.etageDemande;
	}

	public boolean getPorteOuverte() {
		return this.porteOuverte;
	}
	
	public boolean getDoitMonter() {
		return this.ascenseurDoitMonter;
	}
	
	public boolean getDoitDescendre() {
		return this.AscenseurDoitDescendre; 
	}

	// set ---------------------------------

	public int setEtageDemande(int newEtageDemade) {
		this.etageDemande = newEtageDemade;
		return newEtageDemade;
	}
	
	public void setPorteOuverte (Boolean newPorteOuverte) {
		this.porteOuverte = newPorteOuverte;
	}
	
	// fonctions de fonctions
	
	public void leFaireMonter() {
		
		fermer();
		doitMonter();
		monter();
		ouvrir();				
	}
	
	
	public void leFaireDescendre() {
		
		fermer();
		doitDescendre();
		descendre();
		ouvrir();				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// toString
	// ---------------------------------------------------------------------------------------------------------------------

	@Override
	public String toString() {
		
		return "Nom de l'immeuble : "+this.nomImmeuble+"\r\n"
				+"Numéro de l'assenseur : "+this.numAscenseur+"\r\n"
				+"Etage le plus bas : "+this.etageMin+"\r\n"
				+"Etage le plus haut : "+this.etageMax+"\r\n"
				+" Position actulle : Etage n° "+this.positionEtage+"\r\n"
				+"Porte ouverte ? "+this.porteOuverte+"\r\n"
				+"--------------------------------------------------------------";		
	}
	
}
