package Modules.Utils.Crud;

import javax.swing.JOptionPane;
import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Utils.Functions_Find;
import Modules.Utils.Functions_users;


public class Create {

	public static swimming created_swimming(swimming object) {
		int location = -1;
		
			object = Functions_users.resource_sCodref();
			System.out.println(" CREATED primaria = " + object.getCod_Ref() + " "  );
			location = Functions_Find.find_swimming(object);
			System.out.println("location = " + location + " " + object );
			if (location != -1) {
				System.out.println(Singleton.a_swimming.get(location).toString());
				JOptionPane.showMessageDialog(null, "ERROR SWIMMING ", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				object = Functions_users.resource_swimming();
				Singleton.a_swimming.add(object);
				System.out.println("guardado en el ARRAY : " + object);
			}
		System.out.println("objeto creado");
		return object;
	}
	

	public static football created_football(football football1) {
		int location = -1;
		football1 = Functions_users.resource_fCodref();
		System.out.println(" CREATED primaria = " + football1.getCod_Ref() + " "  );
		location = Functions_Find.find_football(football1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "ERROR FOOTBALL", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			football1 = Functions_users.resource_football();
			Singleton.a_football.add(football1);
		}
		return football1;
	}

	public static running created_running(running running1) {
		int location = -1;
		running1 = Functions_users.resource_rCodref();
		System.out.println(" CREATED primaria = " + running1.getCod_Ref() + " "  );
		location = Functions_Find.find_running(running1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "ERROR RUNNING", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			running1 = Functions_users.resource_running();
			Singleton.a_running.add(running1);
		}
		return running1;
	}

	public static tennis created_tennis(tennis tennis1) {
		int location = -1;
		tennis1 = Functions_users.resource_tCodref();
		System.out.println(" CREATED primaria = " + tennis1.getCod_Ref() + " "  );
		location = Functions_Find.find_tennis(tennis1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "ERROR RUNNING", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			tennis1 = Functions_users.resource_tennis();
			Singleton.a_tennis.add(tennis1);
		}
		return tennis1;
	}
	
}
