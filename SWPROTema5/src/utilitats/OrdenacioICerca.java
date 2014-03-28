package utilitats;

public class OrdenacioICerca {

	public void bimbolla(int[] desordenat) {
		for (int i = 2; i <= desordenat.length; i++) {
			for (int j = 0; j <= desordenat.length - i; j++) {

				if (desordenat[j] > desordenat[j + 1]) {
					int aux = desordenat[j];
					desordenat[j] = desordenat[j + 1];
					desordenat[j + 1] = aux;

				}

			}

		}

		for (int g = 0; g <= desordenat.length - 1; g++) {
			System.out.println(desordenat[g]);

		}
	}

	public void quickSort(int[] desordenat, int esquerra, int dreta) {
		int i = esquerra;
		int j = dreta;
		int vPivot = desordenat[(i + j) / 2];

		do {
			while (desordenat[i] < vPivot) {
				i++;

			}
			while (desordenat[j] > vPivot) {
				j--;

			}
			if (i <= j) {
				int aux = desordenat[i];
				desordenat[i] = desordenat[j];
				desordenat[j] = aux;
				i++;
				j--;

			}

		} while (i < j);

		if (esquerra < j) {
			quickSort(desordenat, esquerra, j);

		}

		if (i < dreta) {
			quickSort(desordenat, i, dreta);

		}

	}

	public int CercaBinaria(int[] array, int num) {
		int inici = 0, fi = array.length - 1, mig = -1;
		while (inici <= fi) {

			mig = (inici + fi) / 2;
			if (num == array[mig]) {

				return mig;
			} else if (array[mig] > num) {
				fi = mig - 1;

			} else {
				inici = mig + 1;
			}

		}

		return -1;
	}

	public String CercaBinaria2(int[] array, int num) {
		int inici = 0, fi = array.length - 1, mig = -1, contador = 0;
		while (inici <= fi) {
			String mensage;
			mig = (inici + fi) / 2;
			if (num == array[mig]) {
				contador++;
				return mensage = mig + " botes " + contador;
			} else if (array[mig] > num) {
				fi = mig - 1;
				contador++;
			} else {
				inici = mig + 1;
				contador++;
			}

		}

		return "-1";
	}

}
