package Modules.Utils;

import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;

public class Functions_Find {

	///////////////////////////////////////////////////////////


	
	public static int find_swimming(swimming swimming) {
		System.out.println(swimming);
		for (int i = 0; i <= (Singleton.a_swimming.size()-1); i++) {
			if (Singleton.a_swimming.get(i).equals(swimming)) {
				System.out.println(" dentro del find" +i);
				return i;
				
			}
		}
		System.out.println("FIND CLAU " + swimming.getCod_Ref());
		return -1;
	}

	////////////////////////////////////////////////////////

	public static int find_football(football football) {
		for (int i = 0; i <= (Singleton.a_football.size() - 1); i++) {
			if ((Singleton.a_football.get(i)).equals(football)) {
				return i;
			}

		}
		return -1;
	}

	///////////////////////////////////////////////////////////

	public static int find_running(running running) {
		for (int i = 0; i <= (Singleton.a_running.size() - 1); i++) {
			if ((Singleton.a_running.get(i)).equals(running)) {
				return i;
			}
		}
		return -1;
	}

	//////////////////////////////////////////////////////////

	public static int find_tennis(tennis tennis) {
		for (int i = 0; i <= (Singleton.a_tennis.size() - 1); i++) {
			if ((Singleton.a_tennis.get(i)).equals(tennis)) {
				return i;
			}

		}
		return -1;
	}

}
