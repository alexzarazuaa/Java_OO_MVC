package utils;



public class Digits {
	///////////////////////////////////////////////////////////

	// SUMA DE DIGITOS
	public static int sumDigits(int number) { // SUMA DIGITOS
		int sum = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			sum = sum + rest;
		}

		return sum;
	}

	//////////////////////////////

	// SUMA DIGITOS PARES
	public static int sumPairDigits(int number) { // SUMA DIGITOS PARES
		int sum = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			if ((rest % 2) == 0) {
				sum = sum + rest;
			}

		}

		return sum;
	}

	/////////////////////////

	// SUMA DIGITOS IMPARES
	public static int sumimpDigits(int number) { // SUMA DIGITOS IMPARES
		int sum = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			if ((rest % 2) != 0) {
				sum = sum + rest;
			}
		}

		return sum;
	}

	/////////////////////////

	//// MULTIPLICACION DIGITOS
	public static int multiplyDigits(int number) { // MULTIPLICA D�GITOS
		int product = 1, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			product = product * rest;
		}

		return product;
	}

	/////////////////////////

	// MUTIPLICACION DIGITOS PARES
	public static int multiplyPairDigits(int number) { // MULTIPLICA D�GITOS PARES
		int product = 1, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			if ((rest % 2) == 0) {
				product = product * rest;
			}

		}

		return product;
	}

	/////////////////////////

	/// MULTIPLICACIONES DE DIGITOS IMPARES
	public static int multiplyimpDigits(int number) { // MULTIPLICA D�GITOS IMPARES
		int product = 1, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			number = number / 10;
			if ((rest % 2) != 0) {
				product = product * rest;
			}

		}
		return product;
	}

	/////////////////////////

	// EJEMPLO EJER N Y K
	// EXTRAER DIGITO INDICADO
	public static int extractDigit(int number, int digit) {
		number = Math.abs(number);
		int countDigits = Integer.toString(number).length();
		int rest = 0;

		if (countDigits < digit) {
			System.out.println(number + " don't have " + countDigits + " digits");
		} else {
			for (int i = 0; i < digit; i++) {
				rest = (number % 10);
				number = (number / 10);
			}
		}

		return rest;
	}

	///////////////////////////////////////

	// CONTAR LOS DIGITOS
	public static int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	/////////////////////////

	// CONTAR DIGITOS PARES
	public static int countDigitsPair(int number) {
		int pairs = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = (number % 10);
			number = (number / 10);
			if ((rest % 2) == 0) {
				pairs++;
			}
		}

		return pairs;
	}

	/////////////////////////////////////////////

//	// CONTAR LOS NUMEROS QUE SON MULTIPLOS DE OTRO QUE SE INDICA EN LA VARIABLE MULTIPLI
//	public static int countDigitsMulti (int num, int multipli) {
//		int count = 0;
//		int resto = 0;
//		while (num > 0) {
//			resto = num % 10;
//			num = num / 10;
//			if ((resto%multipli)==0) {
//				count++;
//			}
//		}
//		return count;
//	}

	/////////////////////////

	// EXTRAE CANTIDAD DE DIGITOS PARES
	public static String pairCont(int number) {
		int cont = 0, rest = 0;
		String cad = "";
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			if ((rest % 2) == 0) {
				cad = (cad + rest + ",");
				cont++;
			}
			number = number / 10;
		}

		return cad;
	}

	/////////////////////////

	// EXTRAE CANTIDAD DE DIGITOS IMPARES
	public static int impCont(int number) {
		int cont = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = number % 10;
			if ((rest % 2) != 0) {
				cont++;
			}
			number = number / 10;
		}

		return cont;
	}

	////////////////////////

	// CONTAR DIGITOS IMPARES
	public static int countDigitsimp(int number) {
		int odds = 0, rest = 0;
		number = Math.abs(number);

		while (number != 0) {
			rest = (number % 10);
			number = (number / 10);
			if (rest % 2 != 0) {
				odds++;
			}
		}

		return odds;
	}

	///////////////////////////////////

	// DIGITO MAYOR Y CUANTAS VECES SE REPITE
	public static void digitmayrepeat() {
		int  num = 0 ,resto = 0, mayor = 0, cont = 0;

		while (num != 0) {
			resto = (num % 10);
			num = (num / 10);
			if (resto > mayor) {
				mayor = resto;
				cont = 0;
			} else if (resto == mayor) {
				cont++;
			}
		}

	} // end_WhileDigitsMayors

	/////////////////////////
	// MEDIA DE LOS DIGITOS MULTIPLOS DE X
	public static int mediaMultiplosdeX(int number, int multiplo) {
		int media = 0, resto = 0, cont = 0;

		while (number != 0) {
			resto = (number % 10);
			number = (number / 10);

			if (resto % multiplo == 0) {
				media = (media + resto);
				cont++;
			}

		}

		if (cont != 0) {
			media = (media / cont);
		}

		return media;
	}

}
