package J29_drapeau_usa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String egal = "=";
		String espace = " ";
		String etoile = "*";
		String chaine = "";
		int i = 0;
		int j = 0;

		for (i = 0; i < 15; i++) {

			if (i % 2 == 0 && i < 9) {

				for (j = 0; j < 46; j++) {

					if (j % 2 == 0 && j < 11) {
						chaine = chaine + etoile;
					}

					else if (j % 2 == 1 && j < 11) {
						chaine = chaine + espace;
					}

					else {
						chaine = chaine + egal;
					}

				} // fin boucle for

				System.out.println(chaine);
				chaine = "";

			} // fin if % 2 =0

			else if (i % 2 == 1 && i < 9) {

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
				chaine = "";

			} // fin if i % 2 = 1

			else {
				for (j = 0; j < 46; j++) {

					chaine = chaine + egal;

				} // fin boucle for

				System.out.println(chaine);
				chaine = "";
			} // fin else
		} // fin grande boucle

	} // avant dernier

}// dernier
