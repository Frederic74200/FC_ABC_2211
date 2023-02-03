package Ob05_Ascenseur;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclaration des classes
		Scanner sc = new Scanner(System.in);

		Ascenseur asc = new Ascenseur("Hôtel Hondor", "498 23 54", -2, 6, 0, false);

		// Infos ascenseur
		String newAsc = asc.toString();
		System.out.println(newAsc);

		// déclarer nles variables

		Boolean enFonction = true;
		int etageVoulu;
		int getEtageVoulu;
		
	//	Boolean porteOuverte ;
	//	Boolean getPorteOuverte = asc.getPorteOuverte();
		
		
		int max = asc.getEtageMax();
		 int min = asc.getEtageMin();
		int etageActuel = asc.getPositionEtage();

		Boolean controle = false;
		
		
		// quel étage ?

		do {

			do {
				System.out.println("Etage actuel : " + etageActuel);
				System.out.println("A quel étage souhaitez-vous aller ?");
				etageVoulu = sc.nextInt();
				asc.setEtageDemande(etageVoulu);
				getEtageVoulu = asc.getEtageDemande();
				
				System.out.println("Etage voulu : " + getEtageVoulu);

				if (etageVoulu > min && etageVoulu < max && etageVoulu != etageActuel) {
					controle = true;
				} else {
					System.out.println("Etage incorrect ! Veuillez recommencer !");
					controle = false;
				}

			} while (controle == false);
			
			//--------------------------------------------------------------

			if (etageVoulu < etageActuel) {
			/*	asc.leFaireDescendre();
				

		/*	if (getPorteOuverte == true) {
				Boolean ferme = asc.fermer();
				System.out.println("Statut ferme : " + ferme);
			}
				
				
				System.out.println("Statut porteOuverte : " + getPorteOuverte);

				Boolean doitdesc = asc.doitDescendre();
				System.out.println("Statut doitdesc " + doitdesc);

				Boolean descend = asc.descendre();
				System.out.println("Statut descend " + descend);

				Boolean ouvre = asc.ouvrir();
				System.out.println("Statut ouvre : " + ouvre);
				System.out.println("Statut porteOuverte : " + getPorteOuverte); */
				System.out.println("Vous êtes arrivé.e ! ");

			} // fin descendre
			
			
			//-------------------------------------------------------------------------

			else {
		//		asc.leFaireMonter();

				/* if (getPorteOuverte == true) {
					Boolean ferme = asc.fermer();
					System.out.println("Statut ferme : " + ferme);
					
				}

				System.out.println("Statut porteOuverte : " + getPorteOuverte);

				Boolean doitMont = asc.doitMonter();
				System.out.println("Statut doitMont " + doitMont);

				Boolean monte = asc.monter();
				System.out.println("Statut descend " + monte);

				Boolean ouvre = asc.ouvrir();
				System.out.println("Statut ouvre : " + ouvre);
				System.out.println("Statut porteOuverte : " + getPorteOuverte); */
				System.out.println("Vous êtes arrivé.e ! ");

			} // fin monter

		} while (enFonction == true); // fin grande boucle do while

	}

}
