package J99_test;

import java.util.*;
public class App {

	public static void main(String[] args) {      
		// TODO Auto-generated method stub
		
		 String espace = " ";
		 String etoile = "*";
		 String egal = "=";
		 String chaine= "";
		 int j =0;
		 
		 for (j = 0; j < 46; j++) {

				if (j % 2 == 0 && j < 11) {
					chaine = chaine + espace;
				}

				else if (j % 2 == 1 && j < 11) {
					chaine = chaine + etoile;
				}

				else {
					chaine = chaine + egal;
				}

			} // fin boucle for

			
		 System.out.println(chaine);
	}

}
