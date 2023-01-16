package J24_un_un;

/*
 * 11
 * 21
 * 1211
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valeur = "1211";
		
		String chiffre = valeur.substring(0,1);  // lis le 1er caractère de la chaîne de caractères
		int occurence =1;
		String resultat ="";
		
		for(int i =0; i< valeur.length(); i++) {
			
			String charactere = valeur.substring(1, i++); // lis le caractère à la position i
			
			if (chiffre.equals(charactere)) {
				
				occurence++; 
			}
			
			
			else {
				
				resultat = resultat + ""+ occurence+"" + valeur.substring(i-1, i);
				chiffre = charactere; // stocke le nouveau caractère
				
				occurence =1;
			
				
			}
			
		}
		 
		// ajout d'occurence à la chaine de caractères
		 resultat = resultat + "" + occurence+ "" + valeur.charAt(valeur.length()-1);
		
		System.out.println(resultat); 
	}
}
