package utils;

import javax.swing.JOptionPane;

public class Strings {

	
		// CADENA // STRING GENERICO 
		public static String inputString(String message, String title) {
			String string = "";
			string = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
			return string;
		}

	}

