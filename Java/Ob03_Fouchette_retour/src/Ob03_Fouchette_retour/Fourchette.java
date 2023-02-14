package Ob03_Fouchette_retour;

import java.util.*;

public class Fourchette {

	// Les attributs
	// --------------------------------------------------------------------
	Random r = new Random();

	private int min;
	private int max;
	private int minUser;
	private int maxUser;
	private int minComputer;
	private int maxComputeur;
	private int nombreAtrouver;
	private int propositionUser;
	private int propositionComputer;
	private int nombreEssaisUser;
	private int nombreEssaisComputer;
	private int nombreEssaisMax;
	private Boolean rejoueEncore;
	private Boolean jpueContrePC;
	private Boolean gagneUser;
	private Boolean gagneComputer;
	// Les constructeurs
	// --------------------------------------------------------------------

	public Fourchette() {
		this.min = 0;
		this.max = 100;
		this.nombreEssaisMax = 10;
		this.jpueContrePC = true;
	}

	public Fourchette(int _min, int _max, int _nombreEssaisMax, Boolean _jpueContrePC) {
		this.min = _min;
		this.max = _max;
		this.nombreEssaisMax = _nombreEssaisMax;
		this.jpueContrePC = _jpueContrePC;
	}

	// get
	// ---------------------------------------------------------------------------------

	// les fonctions
	// -----------------------------------------------------------------------------

	public int definirNombreAleatoire() {
		this.nombreAtrouver = r.nextInt(this.min, this.max);
		return this.nombreAtrouver;
	}

	public int definirPropositionComputer() {
		this.propositionComputer = r.nextInt(this.min, this.max);
		return this.propositionComputer;
	}

	public boolean validerPropositionUser() {
		if (this.propositionUser >= this.min && this.propositionUser <= this.max) {
			return true;
		} else {
			return false;
		}
	}

	public boolean JouerEncore() {

		if (this.rejoueEncore == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean jouerContrePC() {
		
		if (this.jpueContrePC == true) {
			this.minUser = this.min;
			this.maxUser = this.max;
			this.minComputer = this.min; 
			this.maxComputeur = this.max;
			return true;
		}
		else {
			this.minUser = this.min;
			this.maxUser = this.max;
			return false;			
		}
		
	}
 	
	public int nouvelleFourcehtteUser() {
		
		if (this.propositionUser < this.nombreAtrouver) {
			this.minUser = this.propositionUser;
			return this.minUser;			
		}
		
		else if (this.propositionUser > this.nombreAtrouver) {
			this.maxUser = this.propositionUser;
			return this.maxUser;
		}
		else {
			this.gagneUser = true;
			return this.propositionUser;
		}
		
	}
	
	
	public int nouvelleFourcehttePC() {
		
		if (this.propositionComputer < this.nombreAtrouver) {
			this.minComputer = this.propositionComputer;
			return this.minComputer;			
		}
		
		else if (this.propositionComputer > this.nombreAtrouver) {
			this.maxComputeur = this.propositionComputer;
			return this.maxComputeur;
		}
		else {
		
			return this.propositionComputer;
		}
		
	}
	
	
	public boolean victoireUser() {
		
		if (this.jpueContrePC == true)
			if ( this.nombreEssaisUser <= this.nombreEssaisMax ) {
				this.gagneComputer = false;
				
				
			}
		
		
		
	} // fin jouecontrepc true
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
