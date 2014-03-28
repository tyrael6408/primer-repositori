package proves;

import utilitats.Algorismes;
import utilitats.OrdenacioICerca;

public class Proves {

	public void separador() {

		System.out
				.println("---------------------------------------------------------");
	}

	private void mostraArray(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {

			System.out.println(array[i]);

		}

	}

	public void provaOrdenacio(Algorismes tipus) {
		int[] arry = new int[19];
		for (int i = 0; i < arry.length - 1; i++) {

			arry[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));

		}
		for (int i = 0; i < arry.length - 1; i++) {

			System.out.println(arry[i]);

		}
		OrdenacioICerca ordena = new OrdenacioICerca();
		if (tipus == tipus.BIMBOLLA) {

			ordena.bimbolla(arry);
			System.out.println("Ordenado con BIMBOLLA");
			for (int i = 0; i < arry.length - 1; i++) {

				System.out.println(arry[i]);

			}
		} else if (tipus == tipus.BIMBOLLA) {

			ordena.quickSort(arry, 0, arry.length - 1);
			System.out.println("Ordenado");
			for (int i = 0; i < arry.length - 1; i++) {

				System.out.println(arry[i]);

			}
		}
	}

	public void provaCercaBinaria() {
		int[] p = new int[20];
		int valor = 5;
		for (int i = 0; i < 20; i++) {
			p[i] = i;

		}

		Proves obj = new Proves();

		obj.mostraArray(p);
		OrdenacioICerca posicio = new OrdenacioICerca();
		System.out.println("El valor buscado es: " + valor
				+ "  Ocupa la posicion: " + posicio.CercaBinaria(p, valor));

	}

	public void provaCercaBinaria(int longitud) {
		int[] p = new int[longitud];
		int valor = 8;
		for (int i = 0; i < longitud; i++) {
			p[i] = i;

		}

		Proves obj = new Proves();

		obj.mostraArray(p);
		OrdenacioICerca posicio = new OrdenacioICerca();
		System.out.println("El valor buscado es: " + valor
				+ "  Ocupa la posicion: " + posicio.CercaBinaria(p, valor));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrdenacioICerca j = new OrdenacioICerca();
		Proves mostra = new Proves();
		int desordenat[] = { 1, 8, 5, 9, 3, 6, 7, 4, 2, 10 };
		int desordenat2[] = { 1, 8, 5, 9, 3, 6, 7, 4, 2, 10 };
		// j.bimbolla(desordenat);
		// mostra.separador();

		// mostra.mostraArray(desordenat);
		// mostra.separador();
		// mostra.provaOrdenacio();
		// mostra.separador();
		j.quickSort(desordenat, 0, desordenat.length - 1);
		// mostra.mostraArray(desordenat);
		// mostra.separador();
		// mostra.provaOrdenacio("qui");
		// mostra.separador();
		// System.out.println(j.CercaBinaria(desordenat, 9));

		// mostra.provaCercaBinaria(15);

		// System.out.println(j.CercaBinaria2(desordenat, 4));
		// mostra.provaCercaBinaria(1000);
		Algorismes tipus = null;
		mostra.provaOrdenacio(tipus.BIMBOLLA);

	}

}
