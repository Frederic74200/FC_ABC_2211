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
	private int maxComputer;
	private int nombreAtrouver;
	private int propositionUser;
	private int propositionComputer;
	private int nombreEssaisUser;
	private int nombreEssaisComputer;
	private int nombreEssaisMax;
	private Boolean rejoueEncore;
	private Boolean jpueContrePC;

	// Les constructeurs
	// --------------------------------------------------------------------

	public Fourchette() {
		this.min = 0;
		this.max = 100;
		this.nombreEssaisMax = 10;

	}

	public Fourchette(int _min, int _max, int _nombreEssaisMax) {
		this.min = _min;
		this.max = _max;
		this.nombreEssaisMax = _nombreEssaisMax;

	}

	// set
	// ---------------------------------------------------------------------------------

	public boolean setJouerEncore(Boolean _rejoueEncore) {
		this.rejoueEncore = _rejoueEncore;

		if (_rejoueEncore == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setJouerContrePC(Boolean _jpueContrePC) {
		this.jpueContrePC = _jpueContrePC;

		if (_jpueContrePC == true) {
			return this.jpueContrePC;
		} else {
			return this.jpueContrePC;}

	}
	
	public int propositionUser(int _propositionUser ) {
		this.propositionUser = _propositionUser;
		return this.propositionUser;		
	}
	
	// get -------------------------------------------------------------------------
	
	public int getMinUser() {
		return this.minUser;
	}

	public int getMaxUser() {
		return this.maxUser;
	}
	
	public int getEssaisMax() {
		return this.nombreEssaisMax;
	}
	
	// les fonctions
	// -----------------------------------------------------------------------------

	public int definirNombreAleatoire() {
		this.nombreAtrouver = r.nextInt(this.min, this.max);
		return this.nombreAtrouver;
	}

	public int definirPropositionComputer() {
		this.propositionComputer = r.nextInt(this.minComputer, this.maxComputer);
		return this.propositionComputer;
	}

	public boolean validerPropositionUser() {
		if (this.propositionUser >= this.minUser && this.propositionUser <= this.maxUser) {
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
			this.maxComputer = this.max;
			return true;
		} else {
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
		} else {

			return this.propositionUser;
		}

	}

	public int nouvelleFourcehttePC() {

		if (this.propositionComputer < this.nombreAtrouver) {
			this.minComputer = this.propositionComputer;
			return this.minComputer;
		}

		else if (this.propositionComputer > this.nombreAtrouver) {
			this.maxComputer = this.propositionComputer;
			return this.maxComputer;
		} else {

			return this.propositionComputer;
		}

	}

	public boolean victoireUser() {

		if (this.jpueContrePC == true) {
			if (this.nombreEssaisUser <= this.nombreEssaisMax && this.propositionUser == this.nombreAtrouver) {

				System.out.println("Bravo ! Vous avez gagné !");

			}
			return true;
		} else if (this.jpueContrePC == false) {
			if (this.nombreEssaisUser <= this.nombreEssaisMax && this.propositionUser == this.nombreAtrouver) {

				System.out.println("Bravo ! Vous avez gagné !");
			}
			return true;
		} else {
			return false;
		}

	}

	public boolean victoireComputer() {

		if (this.jpueContrePC == true) {
			if (this.nombreEssaisComputer <= this.nombreEssaisMax && this.propositionComputer == this.nombreAtrouver) {

				System.out.println("L'ordinateur a gagné. Le nombre à trouver étéit : " + this.nombreAtrouver);

			}
			return true;
		} else {
			return false;
		}

	}

	public boolean egalite() {

		if (this.jpueContrePC == true) {
			if (this.nombreEssaisComputer == this.nombreEssaisMax && this.propositionComputer != this.nombreAtrouver
					&& this.nombreEssaisUser == this.nombreEssaisMax && this.propositionUser != this.nombreAtrouver) {

				System.out.println("Egalité !");
			}
			return true;
		} else {
			return false;
		}

	}

	public boolean joueurPerdSeul() {
		
		if (this.jpueContrePC == false) {
			if ( this.nombreEssaisUser == this.nombreEssaisMax && this.propositionUser != this.nombreAtrouver) {
				System.out.println("Vous avez perdu ! Le nombre à trouver étéit : " + this.nombreAtrouver);
			}
			return true;
		}
		else {
			return false; 
		}
	}
}
