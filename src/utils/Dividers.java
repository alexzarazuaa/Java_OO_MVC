package utils;

public class Dividers {

	/////////////////////////////////////////////////////
	// SUMAR DIVISORES PASANDOLE EL PARAEMTRO DEL NUMERO
	public static int sumDividers(int num) {
		int sum = 0;
		num = Math.abs(num); // DEVUELVE EL VALOR DE NUMERO QUE LE PASAS COMO PARAMETRO
		// SUMAR DIVISORES
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				System.out.println(i + " divider " + num);
				
				sum = sum + i;
			}
		}

		return sum;
	}
	
	// SUMAR DIVISORES  CON FOR J
	public static int sumDividers_J(int num) {
		int sum = 0;
		String cad = "";
		num = Math.abs(num); // DEVUELVE EL VALOR DE NUMERO QUE LE PASAS COMO PARAMETRO
		// SUMAR DIVISORES
		for (int j = 1; j <= num; j++) {
			if ((num % j) == 0) {
				System.out.println(j + " divider " + num);
				cad = (cad + j + ", ");
				sum = sum + j;
			}
		}

		return sum;
	}

	///////////////////////////////////////////////////////////////
	// CONTAR LOS DIVISORES
	public static int countDividers(int num) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if ((num % (i + 1)) == 0) {
				count++;
			}
		}
		return count;
	}

	//////////////////////////////////////////////////////////////
	// CONTA LOS DIVISORES PARES
	public static int countDividersPar(int num) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if ((num % (i + 1)) == 0) {
				if (((i + 1) % 2) == 0)
					count++;
			}
		}
		return count;
	}

	//////////////////////////////////////////////////////////////
	// CONTA LOS DIVISORES IMPARES
	public static int countDividersImpar(int num) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if ((num % (i + 1)) == 0) {
				if (((i + 1) % 2) != 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	///////////////////////////////////////
	// PRODUCTO DIVISORES IMPARES
	public static int mutipliImpDividers(int num) {
		int prod = 1;
		// PRODUCTO DIVISORES
		for (int i = 1; i <= num; i++) {
			if ((num % i) != 0) {
				System.out.println(i + " divider " + num);
				prod = prod * i;
			}
		}

		return prod;
	}
	
	
	///////////////////////////////////////
	
	// SUMAR DIVISORES PASANDOLE EL PARAEMTRO DEL NUMERO
	public static int multDividers(int num) {
		int prod = 1;
		num = Math.abs(num); // DEVUELVE EL VALOR DE NUMERO QUE LE PASAS COMO PARAMETRO
		// SUMAR DIVISORES
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				System.out.println(i + " divider " + num);
				
				prod = prod * i;
			}
		}

		return prod;
	}
	
	
	// MULTIPLICAR LOS DIVISORES PARES
	public static int MULTDividersPar(int num) {
		int prod = 1;
		for (int i = 0; i < num; i++) {
			if ((num % (i + 1)) == 0) {
				if (((i + 1) % 2) == 0)
					prod = prod * i;
			}
		}
		return prod;
	}
	
}
