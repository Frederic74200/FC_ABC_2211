package Ob01_Ultimate_Bouteille;

public class Bouteille {

	private String nomBouteille;
	private String nomLiquide;
	private int capactiteCl;
	private int volumePresentCl;
	private Boolean estOuverte;

	private int volumePlusCl;
	private int volumeMoinsCl;

	// Constructeurs
	// ----------------------------------------------------------------------------------------------

	// Bouteille par défaut

	public Bouteille() {
		this.nomBouteille = "Bouteille par défaut";
		this.nomLiquide = "Eau";
		this.capactiteCl = 100;
		this.volumePresentCl = 50;
		this.estOuverte = true;
	}

	// Bouteille à construire

	public Bouteille(String _nomBouteille, String _nomLiquide, int _capaciteCl, int _volumePresntCl,
			Boolean _estOuverte) {
		this.nomBouteille = _nomBouteille;
		this.nomLiquide = _nomLiquide;
		this.capactiteCl = _capaciteCl;
		this.volumePresentCl = _volumePresntCl;
		this.estOuverte = _estOuverte;
	}

	// fonctions
	// ------------------------------------------------------------------------------------------------------

	// ouvrir

	public boolean ouvrir() {
		if (this.estOuverte == false) {
			this.estOuverte = true;
			return true;
		} else {
			return false;
		}
	}

	// fermer

	public boolean fermer() {
		if (this.estOuverte == true) {
			this.estOuverte = false;
			return true;
		} else {
			return false;
		}
	}

	// remplir

	public boolean remplir() {
		if (this.estOuverte == true && this.volumePlusCl <= (this.capactiteCl - this.volumePresentCl)) {
			this.volumePresentCl = this.volumePresentCl + this.volumePlusCl;
			return true;
		} else {
			return false;
		}
	}

	// vider

	public boolean vider() {
		if (this.estOuverte == true && this.volumeMoinsCl <= this.volumePresentCl) {
			this.volumePresentCl = this.volumePresentCl - this.volumeMoinsCl;
			return true;
		} else {
			return false;
		}
	}

	// remplir tout

	public boolean remplirTout() {
		if (this.estOuverte == true) {
			this.volumePresentCl = this.capactiteCl;
			return true;
		} else {
			return false;
		}
	}

	// vider tout

	public boolean viderTout() {
		if (this.estOuverte == true) {
			this.volumePresentCl = 0;
			return true;
		} else {
			return false;
		}
	}

	// get set
	// ----------------------------------------------------------------------------------------------------------

	// get --------------------------
	// est ouverte

	public boolean getEstOuverte() {
		return this.estOuverte;
	}

	// capacité bouteille
	public int getCapaciteCl() {
		return this.capactiteCl;
	}

	// volume présent

	public int getVolumePresent() {
		return this.volumePresentCl;
	}

	// set -----------------------

	// volume plus
	public void setVolumePlusCl(int newVolumePlusCl) {
		this.volumePlusCl = newVolumePlusCl;
	}

	// volume moins
	public void setVolumeMoinsCl(int newVolumeMoinsCl) {
		this.volumeMoinsCl = newVolumeMoinsCl;
	}

	// to sting
	// --------------------------------------------------------------------------------------------------------

	@Override
	public String toString() {

		return 	"Nom de la bouteille : " + this.nomBouteille + "\r\n" + 
				"Nom du liquide : "+this.nomLiquide+"\r\n"+
				"Capacité de la bouteille en centilitres : "+ this.capactiteCl + "\r\n" + 
				"Volume présent dans la bouteille : " + this.volumePresentCl + "\r\n"+ 
				" Bouteille ouverte :" + this.estOuverte + "\r\n"
				+ "-----------------------------------------------------------------";
	}

}
