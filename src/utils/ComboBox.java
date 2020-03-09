package utils;



import javax.swing.JOptionPane;

public class ComboBox {

	public static int comboBox(String message, String title, String[] options) { // CAJA DE COMBOS
		int count = 0, n = 0;
		Object option = null;

		option = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options,
				null);

		System.out.println("Opcion = " + option);

		if (option == null) { // SI CERRAR || CANCELAR RETURN -1
			n = -1;
		} else {
			// CONTAR LAS POSIBLES POSICIONES
			count = (options.length - 1);
			System.out.println("options = " + count);

			for (int i = 0; i <= count; i++) { // REPETIR count VECES
				if (options[i] == option) {
					System.out.println("options" + i + " == " + option + "\nSale del bucle");
					n = i;
					System.out.println("n = " + n);
					i = (count + 1); // AUMENTAR i PARA SALIR DEL BUCLE

				}
			}

		}
		System.out.println("return = " + n);
		return n;
	}

//	/////////////////////////

	public static String comboBoxV(String message, String title, String[] options) { // CAJA DE COMBOS NO CERRAR
																						// VENTANA
		int count = 0, n = 0;
		// String option = "" ; 
		Object selection = null;

		do {
			selection = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options,
					null);

		} while (selection == null);

		System.out.println("selection = " + selection);

		// CONTAR LAS POSIBLES POSICIONES
		count = (options.length - 1);

		System.out.println("options = " + count);

		for (int i = 0; i <= count; i++) { // REPETIR count VECES
			if (options[i] == selection) {
			System.out.println("options" + i + " == " + selection + "\nSale del bucle");
				n = i;
			//	option = selection.toString();
				System.out.println("n = " + n);
				i = (count + 1);

			}

		}

		System.out.println("return = " + n);
		return  (String) selection;

	}

	///////////////////////
}
