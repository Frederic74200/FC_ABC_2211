package J26_boucles;

/*
afficher tous les nombre de 1 à 100 en remplaçant 
les multiples de 7 par bzz
les multiples de 5 par biz

*/
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;

		while (i < 100) {

			i++;

			if (i % 5 == 0 && i % 7 == 0) {

				System.out.println("BizBzz");
			}

			else if (i % 5 == 0) {
				System.out.println("Biz");
			}

			else if (i % 7 == 0) {
				System.out.println("Bzz");
			}

			else {
				System.out.println(i);
			}

		}

	}

}
