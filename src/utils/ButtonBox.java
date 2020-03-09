package utils;

import javax.swing.JOptionPane;

public class ButtonBox {

	
		
			public static int buttonsOptions (String message, String title, String[] options) { // BOTONES
				int option = JOptionPane.showOptionDialog(
						null,
						message,
						title,
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						null);
				System.out.println("return " + option);
				return option;
			}
		
			

			/////////////////////////
			
			public static int continueButton () { // CONTINUAR [S/N]
				int option = 0;
				String[] options = {" YES ", " No" , " Cancel"};
				option = ButtonBox.buttonsOptions("Do You Want To Continue?", "¿Continue?", options);
				return option;
			}
			
			///////////////////////
			
			public static int DummiesButton () { // CONTINUAR [S/N]
				int option = 0;
				String[] options = {" YES ", " No" , " Cancel"};
				option = ButtonBox.buttonsOptions("Do You Want To create Dummies", "¿DUMMIES?", options);
				return option;
			}
			
			////////////////////////////////////////
			
			public static int buttonsOptionsExit (String message, String title, String[] options) { // BOTONES NO CERRAR VENTANA
			int option = 0;
			boolean consult = false;
			do {
				option = JOptionPane.showOptionDialog(
						null,
						message,
						title,
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						null);
				if (option != JOptionPane.CLOSED_OPTION) {
					consult = true;
					System.out.println("return " + option);
				}
			} while (!consult);
			return option;
		}	
		

}
