package J14_fourchette;
import java.util.*;


/*
 * L'ordinateur « choisit » aléatoirement un nombre mystère (entier compris entre 0 et 100). Le joueur essaie de le deviner.  
Lors de chaque essai, l'ordinateur affiche la « fourchette » dans laquelle se trouve le nombre qu'il a choisi.  
Le choix du nombre mystère sera simulé par génération d'un nombre aléatoire : N <-- RANDOM(0,100). 
Lorsque l'utilisateur a trouvé le nombre mystère, le programme affiche "Bravo vous avez trouvé en X essais". 


 */




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	// variables
	
	int nombre;
	int proposition;
	int i =1;
	int min =0;
	int max =100;
	
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	
	// nombre random
	
	nombre = r.nextInt(100);
	// System.out.println("Le nombre est "+nombre);
	
	// lire écrie nombre
	
	
	
	do {
		System.out.println("Veuillez saisir un nombre entre 0 et 100 : ");
		proposition = sc.nextInt();
		
		if(proposition>min || proposition<max) {
			break;
		} 
	} while(proposition<min || proposition >max);
	
	
	
	for (i=1; i<102; i++) {
		
		if (proposition<nombre) {
			
			min = proposition;
		}
		
		else if (proposition>nombre){
			max=proposition;
		}
		
		else {
			break;
			
		}
		
	System.out.println("saisisez un nouveau nombre entre "+min+" et "+max);
	proposition = sc.nextInt();
		
	}
	
	System.out.println("Bravo ! Vous avez trouvez le nombre en "+i+" essais." );
	
	
	
	
	}
	
}
