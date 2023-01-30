package Ob01_bouteille_bis;

import java.util.*;

public class Bouteille {

	// déclaration des attributs
	private String nomBouteille;
	// private String typeLiquide;
	// private String typeMateriau;

	private int capaciteCl;
	private int quantitePlusCl;
	private int quantiteMoinsCL;

	private int quantiteDansBouteille;
	private int volumeDispo;

	private boolean estOuverte;

	private boolean remplir;
	private boolean vider;

	private boolean viderTout;
	private boolean remplirTout;

	// mise en place des méthodes

	// CONSTRUCTEUR PAR DEFAULT

	public Bouteille() {

		this.capaciteCl = 100;
		this.quantiteDansBouteille = 50;
		this.estOuverte = false;
		this.nomBouteille = "";

	}

	// CONSTRUTEUR CLASSIC OU AUTRE NOM

	// déclarer les mêmes variables que par défaut avec des underscores

	public Bouteille(int _capaciteCl, int _quantiteDansBouteille, boolean _estOuverte, String _nomBouteille) {

		this.capaciteCl = _capaciteCl;
		this.quantiteDansBouteille = _quantiteDansBouteille;
		this.estOuverte = _estOuverte;
		this.nomBouteille = _nomBouteille;

	}

	public boolean ouvrir() { // ouvrir

		if (this.estOuverte = true) {
			
			System.out.println("La bouteille est ouverte !");
			return false;
		}

		else {
			
			return true;
		}

	}

	public boolean fermer() { // fermer

		if (this.estOuverte = false) {
			
			return true;
		}

		else {
			System.out.println("La bouteille est fermée !");			
			return false;
		}

	}

	public boolean viderTout() { // vider toute la bouteille

		if (this.viderTout = true) {

			this.quantiteMoinsCL = this.quantiteDansBouteille;
			System.out.println("La bouteille est vide !");
			return true;
		}

		else {
			return false;
		}
	}

	public boolean remplirTout() { // !remplier toute la bouteille

		if (this.remplirTout = true) {

			this.quantitePlusCl = this.volumeDispo;
			System.out.println("La bouteille est pleine !");
			return true;
		}

		else {
			return false;
		}
	}

	public boolean vider() { // retirer du liquide

		if (this.vider = true) {

			this.quantiteMoinsCL = 0 - this.quantiteMoinsCL;
			return true;

		}

		else {
			return false;
		}
	}

	public boolean remplir() { // ajouter du liquide

		if (this.remplir = true) {

			return true;

		}

		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bouteille btl = new Bouteille();

		btl.ouvrir();
		btl.viderTout();
		btl.fermer(); 

	}

}
