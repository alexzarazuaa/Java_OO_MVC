package Modules.Utils.Crud;

import javax.swing.JOptionPane;

import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Utils.Functions_Find;
import Modules.Utils.Functions_users;
import utils.ButtonBox;

public class Delete {

	public static void delete_swimming(swimming object) {
		String[] options = { " DELETE ALL ", " DELETE ONE " };
		int location = -1;
		// int size = Singleton.a_swimming.size();
		if (Singleton.a_swimming.isEmpty()) {
			JOptionPane.showMessageDialog(null, "DELETE ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				Singleton.a_swimming.clear();
				JOptionPane.showMessageDialog(null, "delete");
				break;
			case 1:
				System.out.println("Entra case one");
				location = -1;
				object = Functions_users.resource_sCodref();
				System.out.println("COMPROVEM OBJECTE CASE ONE : " + object);
				location = Functions_Find.find_swimming(object);
				System.out.println("  location delete : " + location);
				if (location != -1) {
					Singleton.a_swimming.remove(location);
					JOptionPane.showMessageDialog(null, "delete");
				} else {
					JOptionPane.showMessageDialog(null, "usererror", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}

	public static void delete_football(football football1) {
		String[] options = { " DELETE ALL ", " DELETE ONE " };
		int location = -1;

		if (Singleton.a_football.isEmpty()) {
			JOptionPane.showMessageDialog(null, "mainerror", "errortitle", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				Singleton.a_football.clear();
				JOptionPane.showMessageDialog(null, "delete");
				break;
			case 1:
				location = -1;
				football1 = Functions_users.resource_fCodref();
				location = Functions_Find.find_football(football1);
				if (location != -1) {
					Singleton.a_football.remove(location);
					JOptionPane.showMessageDialog(null, "delete");
				} else {
					JOptionPane.showMessageDialog(null, "usererror", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}

	public static void delete_running(running running1) {
		String[] options = { " DELETE ALL ", " DELETE ONE " };
		int location = -1;
		

		if (Singleton.a_running.isEmpty()) {
			JOptionPane.showMessageDialog(null, "mainerror", "errortitle", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				Singleton.a_running.clear();
				JOptionPane.showMessageDialog(null, "delete");
				break;
			case 1:
			location = -1;
			running1 = Functions_users.resource_rCodref();
			location = Functions_Find.find_running(running1);
			if (location != -1) {
				Singleton.a_running.remove(location);
				JOptionPane.showMessageDialog(null, "delete");
			} else {
				JOptionPane.showMessageDialog(null, "usererror", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			break;
			}
		}
	}

	public static void delete_tennis(tennis tennis1) {
		String[] options = { " DELETE ALL ", " DELETE ONE " };
		int location = -1;
		

		if (Singleton.a_tennis.isEmpty()) {
			JOptionPane.showMessageDialog(null, "mainerror", "errortitle", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				Singleton.a_running.clear();
				JOptionPane.showMessageDialog(null, "delete");
				break;
			case 1:
			location = -1;
			tennis1 = Functions_users.resource_tCodref();
			location = Functions_Find.find_tennis(tennis1);
			if (location != -1) {
				Singleton.a_tennis.remove(location);
				JOptionPane.showMessageDialog(null, "delete");
			} else {
				JOptionPane.showMessageDialog(null, "usererror", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			break;
			}
		}
	}

}
