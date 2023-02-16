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
	
//	private int nombreEssais;	
	private int nombreEssais;
	
	public static Boolean rejoueEncore; 
	public static Boolean jpueContrePC; 
	
	
	// constructeurs ---------------------------------------------------------------------
	
	public Fourchette() {
		this.min = 0;
		this.max = 100;
		this.nombreEssais = 10;

	}

	public Fourchette(int _min, int _max, int _nombreEssais) {
		this.min = _min;
		this.max = _max;
		this.nombreEssais= _nombreEssais;

	}

	
	// get set ----------------------------------------------------------------------
	
	
	public int getMin() {
		return this.min;
	}

	public int getMax() {
		return this.max;
	}
	
	public int getEssaisMax() {
		return this.nombreEssais;
	}
	
	
	//  Fonctions -----------------------------------------------------------------------------
	
	public int NombreAleatoire() {
		this.nombreAtrouver = r.nextInt(this.min, this.max);
		return this.nombreAtrouver;
	}
	
		
	public int PropositionComputer() {
		this.proposition = r.nextInt(this.min, this.max);
		return this.proposition;
	}
	
	
	
	public int nouvelleFourchette() { // nouvelle fourchette inclure essais 

		if (this.proposition < this.nombreAtrouver) {
			this.min = this.proposition;
			this.nombreEssais--;
			return this.min;
		}

		else if (this.proposition > this.nombreAtrouver) {
			this.max = this.proposition;
			this.nombreEssais--;
			return this.max;
		} else {
			// victoire
			this.nombreEssais--;
		}
			// perdu 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
