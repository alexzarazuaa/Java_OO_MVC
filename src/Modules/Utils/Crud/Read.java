package Modules.Utils.Crud;

import javax.swing.JOptionPane;

//import Main.Main;
import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
//import Modules.Classes.sports;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Utils.Functions_Find;
import Modules.Utils.Functions_users;
import utils.ButtonBox;
//import utils.ComboBox;
import utils.ComboBox;

public class Read {
	
	/////////////////////////////////////////////////////

	public static void read_swimming(swimming object) { // MOSTRAR SWIMMING
		System.out.println("entra en FUNCION read swimming ");

		String[] options = { "Read all", "Read One" };
		int size = Singleton.a_swimming.size();
		int position = -1;

		if (Singleton.a_swimming.isEmpty()) {
			System.out.println("SI EL objeto  ESTA vacio ");
			JOptionPane.showMessageDialog(null, "MAIN ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			System.out.println("NO ESTA VACIO Y ENTRA PARA MOSTRAR EL READ");
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				for (int i = 0; i < size; i++) {
					String read = "";
					read = read + (Singleton.a_swimming.get(i).toString() + "\n\n");
					JOptionPane.showMessageDialog(null, read, "Swimming : "  + "\n\n", JOptionPane.INFORMATION_MESSAGE);
				}

				break;

			case 1:
				System.out.println("Entra case one");
				position = -1;
				object = Functions_users.resource_sCodref();
				System.out.println("COMPROVEM OBJECTE CASE ONE : " + object );
				position = Functions_Find.find_swimming(object);
				System.out.println("FIND position : " + position);
				if (position != -1) {
					System.out.println("ENTRA SI TROBA");
					object = Singleton.a_swimming.get(position);
					System.out.println( "CASE ONE : " + "  " + position);
					String read1 = "";
					String[] options_all = { " USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
							" SWIMCUIR COLOR ", " SWIMCUIT SIZE ", " DATE PURCHASE ", " DELIVERY ", "PRICE", "All" };

					switch (ComboBox.comboBoxV("Option:", "Option", options_all)) {
					case " USER TYPE ":
						read1 = ("USER_TYPE: " + object.getUser_type());
						break;
					case " CITY SHOP": //
						read1 = ("CITY SHOP : " + object.getCity_shop());
						break;
					case " HABITUAL CLIENT ": //
						read1 = ("HABITUAL CLIENT: " + object.getHabitual_client());
						break;
					case " DNI ": //
						read1 = ("DNI : " + object.getdni());
						break;
					case "DATE OF BIRHT  ":
						read1 = ("DATE OF BIRHT : " + object.getdate_nac());
						break;
					case " SWIMCUIR COLOR ": //
						read1 = ("SWIMCUIR COLOR: " + object.getSwimcuit_color());
						break;
					case " SWIMCUIT SIZE ": //
						read1 = ("SWIMCUIT SIZE: " + object.getSwimcuit_size());
						break;
					case " DATE PURCHASE ": //
						read1 = ("DATE PURCHASE  : " + object.getdate_buy());
						break;
					case " DELIVERY ":
						read1 = ("DELIVERY : " + object.delivery());
						break;
					case " PRICE ":
						read1 = ("PRICE :  " + object.getprice());
						break;
					case "All": // ALL
						read1 = object.toString();
						break;
					}
					JOptionPane.showMessageDialog(null, read1);
				} else {
					JOptionPane.showMessageDialog(null, "usererror", "errortitle", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
		 
	}

	/////////////////////////////////////////////////////

	public static void read_football(football football1 ) { // MOSTRAR FOTBALL
		
		String[] options = { "Read all", "Read One" };
		int size = Singleton.a_football.size();
		int position = -1;
	
		if (Singleton.a_football.isEmpty()) {
			JOptionPane.showMessageDialog(null, "MAIN ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			System.out.println("NO ESTA VACIO Y ENTRA PARA MOSTRAR EL READ");
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all football");
				for (int i = 0; i < size; i++) {
					String read = "";
					read = read + (Singleton.a_football.get(i).toString() + "\n\n" );
					JOptionPane.showMessageDialog(null, read, "Swimming : "  + "\n\n", JOptionPane.INFORMATION_MESSAGE);
				}	
				break;
			case 1:
				System.out.println("Entra case one");
				position = -1;
				football1 = Functions_users.resource_fCodref();
				System.out.println("COMPROVEM OBJECTE CASE ONE : " + football1 + "\n" + football1.getCod_Ref());
				position = Functions_Find.find_football(football1);
				System.out.println("FIND CSAE ONE: " + football1 + "\n" + football1.getCod_Ref());
				if (position != -1) {
					System.out.println("ENTRA SI TROBA");
					football1 = Singleton.a_football.get(position);
					System.out.println( "CASE ONE : " + football1 + "  "+ position);
					//JOptionPane.showMessageDialog(null, football1.toString() , " READ ONE " ,JOptionPane.INFORMATION_MESSAGE);
					String read1 = "";
					String[] options_all = { " USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
							" FOOTBALL TYPE ", " BRAND ", " SIZE ", " DATE PURCHASE ", " DATE OF DELIVERY ", "PRICE", "All" };

					switch (ComboBox.comboBoxV("Option:", "Option", options_all)) {
					case " USER TYPE ":
						read1 = ("USER_TYPE: " + football1.getUser_type());
						break;
					case " CITY SHOP": //
						read1 = ("CITY SHOP : " + football1.getCity_shop());
						break;
					case " HABITUAL CLIENT ": //
						read1 = ("HABITUAL CLIENT: " + football1.getHabitual_client());
						break;
					case " DNI ":
						read1 = ("DNI : " + football1.getdni());
						break;
					case "DATE OF BIRHT  ":
						read1 = ("DATE OF BIRHT : " + football1.getdate_nac());
						break;
					case " FOOTBALL TYPE ": //
						read1 = ("FOOTBALL TYPE: " + football1.getFootball_type());
						break;
					case " BRAND ": //
						read1 = (" BRAND: " + football1.getBrand());
						break;
					case " SIZE ": //
						read1 = (" SIZE: " + football1.getSize());
						break;
					case " DATE PURCHASE ": //
						read1 = ("DATE PURCHASE  : " + football1.getdate_buy());
						break;
					case " DATE OF DELIVERY ":
						read1 = ("DELIVERY : " + football1.delivery());
						break;
					case "PRICE":
						read1 = ("PRICE :  " + football1.getprice());
					case "All": // ALL
						read1 = football1.toString();
						break;
					}
					 JOptionPane.showMessageDialog(null, read1);
				} else {
					JOptionPane.showMessageDialog(null, "ERROR READ ONE ", "READ ONE ERROR", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
		
		

	}

	/////////////////////////////////////////////////////

	public static void read_running(running running1) { // MOSTRAR RUNNING
		System.out.println("entra en FUNCION read running ");
		
		String[] options = { "Read all", "Read One" };
		int position = -1;
		int size = Singleton.a_running.size();
		if (Singleton.a_running.isEmpty()) {
			JOptionPane.showMessageDialog(null, "MAIN ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				for (int i = 0; i < size; i++) {
					String read = "";
					read = read + (Singleton.a_running.get(i).toString());
					JOptionPane.showMessageDialog(null, read, "running  : ", JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			case 1:
				System.out.println("Entra case one");
				position = -1;
				running1 = Functions_users.resource_rCodref();
				System.out.println("COMPROVEM OBJECTE CASE ONE : " + running1 + "\n" + running1.getCod_Ref());
				position = Functions_Find.find_running(running1);
				System.out.println("FIND CSAE ONE: " + running1 + "\n" + running1.getCod_Ref());
				if (position != -1) {
					System.out.println("ENTRA SI TROBA");
					running1 = Singleton.a_running.get(position);
					System.out.println( "CASE ONE : " + running1 + "  "+ position);
					//JOptionPane.showMessageDialog(null, running1.toString() , " READ ONE " ,JOptionPane.INFORMATION_MESSAGE);
					String read1 = "";

					String[] options_all = { " USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ", " T-SHIRT  ",
							" SHORT ", " DATE PURCHASE ", " DATE OF DELIVERY ", " PRICE ", "All" };

					switch (ComboBox.comboBoxV("Option:", "Option", options_all)) {
					case " USER TYPE ":
						read1 = ("USER_TYPE: " + running1.getUser_type());
						break;
					case " CITY SHOP": //
						read1 = ("CITY SHOP : " + running1.getCity_shop());
						break;
					case " HABITUAL CLIENT ": //
						read1 = ("HABITUAL CLIENT: " + running1.getHabitual_client());
						break;
					case " DNI ":
						read1 = ("DNI : " + running1.getdni());
						break;
					case "DATE OF BIRHT  ":
						read1 = ("DATE OF BIRHT : " + running1.getdate_nac());
						break;
					case " T-SHIRT  ": //
						read1 = ("T-SHIRT: " + running1.getTshirt());
						break;
					case " SHORT ": //
						read1 = (" SHORT: " + running1.getShorts());
						break;
					case " DATE PURCHASE ": //
						read1 = ("DATE PURCHASE  : " + running1.getdate_buy());
						break;
					case " DATE OF DELIVERY ":
						read1 = ("DELIVERY : " + running1.delivery());
						break;
					case " PRICE ":
						read1 = ("PRICE :  " + running1.getprice());
						break;
					case "All": // ALL
						read1 = running1.toString();
						break;
					}

					 JOptionPane.showMessageDialog(null, read1);

				} else {
					JOptionPane.showMessageDialog(null, "usererror", "errortitle", JOptionPane.ERROR_MESSAGE);
				}
				break;

			}
		}
		//return read;

	}

	/////////////////////////////////////////////////////

	public static void read_tennis(tennis tennis1) { // MOSTRAR TENNIS
		System.out.println("entra en FUNCION read running ");
	
		String[] options = { "Read all", "Read One" };
		int position = -1;
		int size = Singleton.a_tennis.size();
		if (Singleton.a_tennis.isEmpty()) {
			JOptionPane.showMessageDialog(null, "MAIN ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU READ", "MAIN MENU", options)) {
			case 0:
				System.out.println("Entra case all");
				for (int i = 0; i < size; i++) {
					String read = "";
					read = read + (Singleton.a_tennis.get(i).toString());
					JOptionPane.showMessageDialog(null, read, "running  : ", JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			case 1:
				System.out.println("Entra case one");
				position = -1;
				tennis1 = Functions_users.resource_tCodref();
				System.out.println("COMPROVEM OBJECTE CASE ONE : " + tennis1 + "\n" + tennis1.getCod_Ref());
				position = Functions_Find.find_tennis(tennis1);
				System.out.println("FIND CSAE ONE: " + tennis1 + "\n" + tennis1.getCod_Ref());
				if (position != -1) {
					System.out.println("ENTRA SI TROBA");
					tennis1 = Singleton.a_tennis.get(position);
					System.out.println( "CASE ONE : " + tennis1 + "  "+ position);
					//JOptionPane.showMessageDialog(null, tennis1.toString() , " READ ONE " ,JOptionPane.INFORMATION_MESSAGE);
					String read1 = "";
					String[] options_all = { " USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
							" ACCESSORIE ", " DATE PURCHASE ", " DATE OF DELIVERY ", " PRICE ", "All" };

					switch (ComboBox.comboBoxV("Option:", "Option", options_all)) {
					case " USER TYPE ":
						read1 = ("USER_TYPE: " + tennis1.getUser_type());
						break;
					case " CITY SHOP": //
						read1 = ("CITY SHOP : " + tennis1.getCity_shop());
						break;
					case " HABITUAL CLIENT ": //
						read1 = ("HABITUAL CLIENT: " + tennis1.getHabitual_client());
						break;
					case " DNI ":
						read1 = ("DNI : " + tennis1.getdni());
						break;
					case "DATE OF BIRHT  ":
						read1 = ("DATE OF BIRHT : " + tennis1.getdate_nac());
						break;
					case " ACCESSORIE ": //
						read1 = (" ACCESSORIE :" + tennis1.getAccessories());
						break;
					case " DATE PURCHASE ": //
						read1 = ("DATE PURCHASE  : " + tennis1.getdate_buy());
						break;
					case " DATE OF DELIVERY ":
						read1 = ("DELIVERY : " + tennis1.delivery());
						break;
					case " PRICE ":
						read1 = ("PRICE :  " + tennis1.getprice());
						break;
					case "All": // ALL
						read1 = tennis1.toString();
						break;
					}
					 JOptionPane.showMessageDialog(null, read1);


				} else {
					JOptionPane.showMessageDialog(null, "usererror", "errortitle", JOptionPane.ERROR_MESSAGE);
				}
				break;

			default:
				break;
			}
		}
		//return read;
	}

}
