package utils;

import javax.swing.JOptionPane;

public class Numbers {


	/////////////////////////////////////////////////////////

	public static int inputNumber(String message, String title) { // SOLICITAR NÚMERO ENTERO
		String snum = "";
		int num = 0;
		boolean correct = false;

		do {
			snum = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
			try {
				num = Integer.parseInt(snum);
				correct = true;
				System.out.println("correct = " + correct);
			} catch (Exception e) {
				correct = false;
				System.out.println("correct = " + correct);
			}
		} while (!correct);

		return num;
	}

	/////////////////////////

	public static int inputNumberPos(String message, String title) { // SOLICITAR NÚMERO ENTERO POSITIVO
		int num = 0;
		boolean correct = false;

		do {
			num = Numbers.inputNumber(message, title);
			if (num < 0) {
				correct = false;
				System.out.println("El número es negativo.");
			} else {
				correct = true;
			}
		} while (!correct);

		return num;
	}

	/////////////////////////

	public static int inputNumberDif0(String message, String title, String error) { // SOLICITAR NÚMERO DISTINTO A 0
		int num = 0;
		boolean correct = false;

		do {
			num = Numbers.inputNumber(message, title);
			if (num == 0) {
				correct = false;
				JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.WARNING_MESSAGE);
			} else {
				correct = true;
			}
		} while (!correct);

		return num;
	}

	/////////////////////////

	public static int inputNumberGreaterX(String message, String title, int x) { // SOLICITAR NÚMERO MAYOR A x
		int num = 0;

		do {
			num = inputNumber(message, title);
		} while (num <= x);

		return num;
	}

	/////////////////////////

	public static int inputNumberLessX(String message, String title, int x) { // SOLICITAR NÚMERO MENOR A x
		int num = 0;

		do {
			num = inputNumber(message, title);
		} while (num >= x);

		return num;
	}



	/////////////////////////////////////

	// NUMERO PERFECTO
	public static void numperfect(String message, String tittle , int num) {

			String cad = "";
			int  suma = 0;
		for (int i = 1; i < num; i++) {
			if ((num % i) == 0) {
				System.out.println(i + " es divisor de " + num);
				cad = (cad + i + ", ");
				suma = (suma + i);
			}
		}
		if (suma == num)
			JOptionPane.showMessageDialog(null, cad + "\n\n" + "El numero " + num + " es perfecto.", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, cad + "\n\n" + "El numero " + num + "  no es perfecto."

					, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
