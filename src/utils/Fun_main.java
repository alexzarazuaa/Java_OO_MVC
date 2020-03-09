package utils;


public class Fun_main {

	///////////////////////////////////////////////
	// VALIDAR INT MENU

	public static int intMenu(int option, String message, String tittle) {
		int num = 0;
		switch (option) {
		case 1:
			// Sumar.sumar();
			break;
		case 2:
			// Restar.restar();
			break;
		case 3:
			// Multiplicar.multiplicar();
			break;
		default:
			System.out.println("Wrong option change it pls");
			break;
		}
		return num;
	}

	///////////////////////////////////////////////////////////////
	///////// MENU CON BOTONES

	public static void menu_buttons(String message, String tittle) {

		boolean exit = false;
		String[] options = { " EXERCICE 1  ", " EXERCICE 2 ", " EXERCICE 3  ", "  EXIT " }; // +0, -1, *2 , /3

		do {
			switch (ButtonBox.buttonsOptions(message, tittle, options)) {
			case 0: // 
				do {
					
				} while (ButtonBox.continueButton() == 0);
				break;

			case 1: //
				do {
					//Functions_ejers.ejercicio2();
				} while (ButtonBox.continueButton() == 0);
				break;

			case 2: //
				do {
					//Functions_ejers.ejercicio3();
				} while (ButtonBox.continueButton() == 0);
				break;

//			case 3: //
//				do {
//					Functions_ejers.ejercicio4();
//				} while (ButtonBox.continueButton() == 0);
//				break;
			case 3:
				exit = true;
				break;
			}

		} while (!exit);
	}

	///////////////////////////////////////////

	//////////////////////////////////////////// MENU CON COMBO
	public static void menu_combo(String message, String tittle) {

		/////////////////////////////////////////// HACER QUE FUNCIONE LA X EN CADA
		/////////////////////////////////////////// EJERCICIOS
		boolean exit = false;
		String[] options = { " EXERCICE 1  ", " EXERCICE 2 ", " EXERCICE 3 ", " EXIT  " }; // +0, -1, *2 , /3

		do {
			switch (ComboBox.comboBox(message, tittle, options)) {
			case 0: //
				do {
					//Functions_ejers.ejercicio1();
				} while (ButtonBox.continueButton() == 0);
				break;

			case 1: //
				do {
					//Functions_ejers.ejercicio2();
				} while (ButtonBox.continueButton() == 0);
				break;

			case 2: //
				do {
					//Functions_ejers.ejercicio3();
				} while (ButtonBox.continueButton() == 0);
				break;
//
//			case 3: //
//				do {
//					Functions_ejers.ejercicio4();
//				} while (ButtonBox.continueButton() == 0);
//				break;
			case 3:
				exit = true;
				break;
			}

		} while (!exit);
	}
}
