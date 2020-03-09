package utils;

import javax.swing.JOptionPane;

public class Mayor_Y_Repite {

	public static void mayorrepeat(int num) {
		int cont = 0, mayor = 0;
		boolean interruptor = false;
		do {
			// PEDIR NUMERO
			num = Numbers.inputNumber("Input Number ", "NUMBER");

			if (num == 0) {
				interruptor = true;
				System.out.println("Salir");
			} else {
				// PRIMER NUMERO
				if (cont == 1) {
					mayor = num;
				}
				System.out.println("Actual numero " + num);
				if (num > mayor) {
					mayor = num;
					cont = 0;
					System.out.println("CONT VALE " + cont);
				} else if (num == mayor) {
					System.out.println("Mayor es igual que num " + mayor);
					cont++;
				}
			} // end_if

			System.out.println("El numero mayor es " + mayor + "\n");
			System.out.println("Y se repite  " + cont + " veces");

		} while (interruptor != true);// end_Do_While

		JOptionPane.showMessageDialog(null,
				"El n�mero mayor ha sido: " + mayor + "\n\n" + "Se ha repetido " + cont + " veces.", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
