package Modules.Utils.Crud;

import javax.swing.JOptionPane;
import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Utils.Functions_Find;
import Modules.Utils.Functions_users;

public class Update {

//////////////////////////////////////////////////////

	public static swimming update_swimming(swimming object) { // MODIFICAR SWIMMING
		int location = -1;
		System.out.println("EL OBJECTO CONTIENE update : " + object);
		if (Singleton.a_swimming.isEmpty()) {
			System.out.println("array vaciio no entra en el update");
			JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			object = Functions_users.resource_sCodref();
			location = Functions_Find.find_swimming(object);
			if (location != -1) {
				object = Singleton.a_swimming.get(location);
				Functions_users.update_swimming(object);
				Singleton.a_swimming.set(location, object);
			} else {
				JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return object;

	}

	//////////////////////////////////////////////////////

	public static football update_football(football football1) { // MODIFICAR FOOTBALL
		int location = -1;
		System.out.println("EL OBJECTO CONTIENE update : " + football1);
		if (Singleton.a_football.isEmpty()) {
			System.out.println("array vaciio no entra en el update");
			JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			football1 = Functions_users.resource_fCodref();
			location = Functions_Find.find_football(football1);
			if (location != -1) {
				football1 = Singleton.a_football.get(location);
				Functions_users.update_football(football1);
				Singleton.a_football.set(location, football1);
			} else {
				JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return football1;

	}

//////////////////////////////////////////////////////

	public static running update_running(running running1) { //// MODIFICAR RUNNING
		int location = -1;
		System.out.println("EL OBJECTO CONTIENE update : " + running1);
		if (Singleton.a_running.isEmpty()) {
			System.out.println("array vaciio no entra en el update");
			JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			running1 = Functions_users.resource_rCodref();
			location = Functions_Find.find_running(running1);
			if (location != -1) {
				running1 = Singleton.a_running.get(location);
				Functions_users.update_running(running1);
				Singleton.a_running.set(location, running1);
			} else {
				JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return running1;

	}

	//////////////////////////////////////////////////////

	public static tennis update_tennis(tennis tennis1) { // MODIFICAR TENNIS
		int location = -1;
		System.out.println("EL OBJECTO CONTIENE update : " + tennis1);
		if (Singleton.a_tennis.isEmpty()) {
			System.out.println("array vaciio no entra en el update");
			JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			tennis1 = Functions_users.resource_tCodref();
			location = Functions_Find.find_tennis(tennis1);
			if (location != -1) {
				tennis1 = Singleton.a_tennis.get(location);
				Functions_users.update_tennis(tennis1);
				Singleton.a_tennis.set(location, tennis1);
			} else {
				JOptionPane.showMessageDialog(null, "MainError", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return tennis1;


	}// end_update_tennis

}
