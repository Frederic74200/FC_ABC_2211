package Ob02_fouchette_memoire;
import java.util.*;
public class Fourchette {

	// Attributs -------------------------------------------------
	Random r = new Random();
	private int min;
	private int max;
	private int nombreAtrouver;
	
	private int nombreDessais;
	private int gagnePerd; 
	
	
	// Constructeurs ----------------------------------------
	
	public Fourchette () {
		this.min = 0;
		this.max = 100;
		this.nombreDessais =10;
		this.gagnePerd = 0;
	}
	
	public Fourchette (int _min, int _max, int _nombreDessais, int _gagnePerd) {
		this.min = _min;
		this.max = _max;
		this.nombreDessais = _nombreDessais;
		this.gagnePerd = _gagnePerd;
	}
	
	
	
	
	// Accesseurs mutateurs ------------------------------------------------
	
	
	public int getNombreAtrouver() {
		this.nombreAtrouver = r.nextInt(this.min, this.max);
		return this.nombreAtrouver;
		}
	
	public int gatNombreDessais() {
		return this.nombreDessais;
	}
	
	public int getGagnePerd() {
		return this.gagnePerd;
	}
	
	public String retournerFourchette() {
		
		return "Le nombre à trouver est entre "+this.min+" et "+this.max;
	}
	// Fonctions ---------------------------------------------------------
	
	
	public int determinerPropositionPc(int _proposition) {		
		_proposition = r.nextInt(this.min, this.max);
		return _proposition;
	}
	
	public String jouer(int _proposition) {
		
		this.nombreDessais--;
		
		if (this.nombreDessais == 0) {
			this.gagnePerd = 1;
			return "Perdu ! ";
		}
		
		else if (_proposition == this.nombreAtrouver ) {
			this.gagnePerd = 2;
			return "Gagné !";
		}
		
		else if (_proposition < this.nombreAtrouver ) {
			this.min = _proposition;
			return "C'est plus !";
		}
		
		else if (_proposition > this.nombreAtrouver ) {
			this.max = _proposition;
			return "C'est moins !";
		}
		else {
			return "Erreur ! ";
		}
		
	}
	
	
	
}
