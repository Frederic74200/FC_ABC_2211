package Ob02_Fourchette_Simpli;

import java.util.*;

public class Fourchette {

	Random r = new Random();

	// Les attributs
	// --------------------------------------------------------------------
	private int min;
	private int max;

	private int nombreAtrouver;

	private int proposition;

	private int gagnePerd = 0;
	private int nombreEssais;

	// constructeurs
	// ---------------------------------------------------------------------

	public Fourchette() {
		this.min = 0;
		this.max = 100;
		this.nombreEssais = 10;

	}

	public Fourchette(int _min, int _max, int _nombreEssais) {
		this.min = _min;
		this.max = _max;
		this.nombreEssais = _nombreEssais;

	}

	// get set
	// ----------------------------------------------------------------------

	public int getMin() {
		return this.min;
	}

	public int getMax() {
		return this.max;
	}

	public int getEssaisMax() {
		return this.nombreEssais;
	}
	
	public int getGagnePerd() {
		return this.gagnePerd; 
	}

	public int getNombreAleatoire() {
		return this.nombreAtrouver;
	}
	public void dupliqueNombreAleatoire(int _nombreAtrouver) {
		this.nombreAtrouver = _nombreAtrouver;
	}
	public void setProposition(int _proposition) {
		this.proposition = _proposition;
	}
	// Fonctions
	// -----------------------------------------------------------------------------

	public int nombreAleatoire() {
		this.nombreAtrouver = r.nextInt(this.min, this.max);
		return this.nombreAtrouver;
	}

	public int propositionComputer() {
		this.proposition = r.nextInt(this.min, this.max);
		return this.proposition;
	}

	public int phaseDejeu() { 
		this.nombreEssais--;
		if (this.proposition < this.nombreAtrouver) {
			this.min = this.proposition;
			return this.min;
		}
		else if (this.proposition > this.nombreAtrouver) {
			this.max = this.proposition;
			return this.max;
		} 
		else if (this.proposition == this.nombreAtrouver) {
			this.gagnePerd = this.gagnePerd + 1;
			return this.gagnePerd;
		} 
		else if (this.proposition != this.nombreAtrouver && this.nombreEssais == 0) {
			this.gagnePerd = this.gagnePerd + 2;
			return this.gagnePerd;
		}
		else {
			return this.proposition;
		}
	}

	// to string ----------------------------------------------------------

	public String toString() {

		return "Min : " + this.min + "\r\n" + "Max : " + this.max + "\r\n" + "Nombre essais : " + this.nombreEssais
				+ "\r\n" + "----------------";

	}

}
