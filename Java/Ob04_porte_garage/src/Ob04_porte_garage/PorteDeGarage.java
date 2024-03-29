package Ob04_porte_garage;

public class PorteDeGarage {

	private String nomPorteGrarage;

	private boolean verouillee;
	private int tauxOuverture;
	
	
	

	public PorteDeGarage() { // porte par défaut

		this.nomPorteGrarage = "Porte de gararge par défaut";

		this.verouillee = true;
		this.tauxOuverture = 0;
		
	}

	public PorteDeGarage(String _nomPorteDEGararge, boolean _verrouillee, int _tauxOuverture) {
		// porte à construie

		this.nomPorteGrarage = _nomPorteDEGararge;

		this.verouillee = _verrouillee;
		this.tauxOuverture = _tauxOuverture;
		
	}

	// ------------------------------------------------------------------------------

	public boolean verrouiller() {

		if (this.tauxOuverture == 0) {

			if (this.verouillee == true) {
				return false;}
			else {
				this.verouillee = true;
				return true;}
		}

		else {
			return false;
		}
	}  // Fin verrouiller
	

	public boolean deverrouiller() {
			if (this.verouillee == true) {
				this.verouillee = false;
				return true;}
			
			else {				
				return false;}		
	}  // Fin dseverrouiller
	

	
	public boolean ouvrirPartiel() {

		if (this.verouillee == false) {
			
			
		

			return true;}

		else {
			return false;
		}
	} // fin ouverture partielle 
	
	

	public boolean ouvrirEntier() {
		if (this.verouillee == false) {

			if (this.tauxOuverture != 100) {
				this.tauxOuverture = 100;
				
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	} // fin ouvert enier 

	public boolean fermer() {

		if (this.tauxOuverture != 0) {
			this.tauxOuverture = 0;
			
			return true;
		}

		else {
			return false;
		}

	} // fin fermer 
	
	
	
	
	// get return set ---------------------------------------------------------
	
	public int getTauxOuverture() {
		return this.tauxOuverture;
	}
	
	public boolean getVerrouille() {
		return this.verouillee; 
	}
	
	public void setTauxOuverture(int newTauxOuverture) {
		this.tauxOuverture = newTauxOuverture;
	
	}

	
	@Override
	public String toString() {

		return "Nom de la porte : " + this.nomPorteGrarage + "\r\n" 
		+ "Porte vérouillée : " + this.verouillee + "\r\n"
				+ "Taux d'ouverture : " + this.tauxOuverture  ;
		
	}

	
}
