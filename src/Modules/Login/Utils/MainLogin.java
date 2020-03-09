package Modules.Login.Utils;

import java.util.ArrayList;

import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Classes.Dummies.DumAdmin;
import Modules.Login.Utils.crud.Login;
import Modules.Login.Utils.crud.LoginUpdate;
import Modules.Login.Utils.crud.ReadLogin;
import Modules.Login.Utils.crud.Register;
import Modules.Utils.Functions_order;
import Modules.Utils.Crud.Create;
import Modules.Utils.Crud.Delete;
import Modules.Utils.Crud.Functions_MainCrud;
import Modules.Utils.Crud.Read;
import Modules.Utils.Crud.Update;
import utils.ButtonBox;
import utils.ComboBox;
import Modules.Dummies.MakeDummies;

import Modules.Login.Utils.MainLogin;

public class MainLogin {
	public static int loginMainMenu() {
		swimming object = null;
		football football1 = null;
		running running1 = null;
		tennis tennis1 = null;
		User user = null;

		int Options_crud = 0, Options_crud_cli = 0;
		int option = 0;
		int control = 0;
		boolean exit = false;
		boolean exit2 = false;

		Singleton.a_swimming = new ArrayList<swimming>();
		System.out.println(Singleton.a_swimming);
		Singleton.a_football = new ArrayList<football>();
		Singleton.a_running = new ArrayList<running>();
		Singleton.a_tennis = new ArrayList<tennis>();
		SingletonLogin.user = new ArrayList<User>();
		MakeDummies.charge_dummies(5);
		 //SingletonLogin.user.add(user);
		 DumAdmin.DefaultAdmin();
		 DumAdmin.DefaultClient();
		 final int Cant_Dummies = 5;

		String[] options = { "  SWIMMING   ", " FOOTBALL ", " RUNNING   ", "  TENNIS ", " SALIR " }; // +0, -1, *2 , /3
		String[] options_lo = { "PROFILE ", " REGISTER ", " RECOVER PASS ", " LOGIN ", " LOGOUT" };

		do {
			switch (ButtonBox.buttonsOptions("MAIN LOGIN :", " LOGIN ", options_lo)) {
			case 0:
				 user = ReadLogin.read_user(user);
				break;
			case 1:
				user = Register.create_User(user);
				break;
			case 2:
				LoginUpdate.recPassword(user);
				break;
			case 3:
				
				String cad = Login.user_login(user);
				do {
			
					if (cad == " ADMIN " ) {

						// String[] options = { " SWIMMING ", " FOOTBALL ", " RUNNING ", " TENNIS " , "
						// SALIR " }; // +0, -1, *2 , /3
						
						option = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
						switch (option) {

						case 0: // SWIMMING

							Options_crud = Functions_MainCrud.menu_crud("SWIMMING");

							if (Options_crud == 0) { // CREATE
								object = Create.created_swimming(object);
								System.out.println(Singleton.a_swimming);
							} else if (Options_crud == 1) { // READ
								// System.out.println(" OBJECTO : " + object);
								Read.read_swimming(object);

							} else if (Options_crud == 2) { // UPDATE
								System.out.println("UPDATE MAIN : " + object);
								// if (object != null) {
								System.out.println("ENTRA update MAIN");
								object = Update.update_swimming(object);
								// }
							} else if (Options_crud == 3) { // DELETE
								System.out.println(object);
								Delete.delete_swimming(object);
								System.out.println(object);
							} else if (Options_crud == 4) { //

								Functions_order.order_swimming();
							} else if (Options_crud == 5) { ///// DUMMIES/// DUMMIES
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);
								MakeDummies.charge_dummies(5);
							}
							break;

						case 1: // FOOTBALL

							Options_crud = Functions_MainCrud.menu_crud("FOOTBALL");

							if (Options_crud == 0) { // CREATE
								football1 = Create.created_football(football1);

							} else if (Options_crud == 1) { // READ
								/// QUITO EL (football1 != null) PORQUE SINO NO FUNCIONA EL READ CON DUMMIES
								// if (football1 != null) {
								Read.read_football(football1);
								// }

							} else if (Options_crud == 2) { // UPDATE
								// if (football1 != null) {
								football1 = Update.update_football(football1);
								// }
							} else if (Options_crud == 3) { // DELETE
								Delete.delete_football(football1);
							} else if (Options_crud == 4) { // ORDER
								Functions_order.order_football();
							} else if (Options_crud == 5) { /// DUMMIES
								MakeDummies.charge_dummies(5);
							}

							break;

						case 2: // RUNNING

							Options_crud = Functions_MainCrud.menu_crud("RUNNING");

							if (Options_crud == 0) { // CREATE
								running1 = Create.created_running(running1);

							} else if (Options_crud == 1) { // READ
								// if (running1 != null) {
								Read.read_running(running1);
								// }

							} else if (Options_crud == 2) { // UPDATE
								// if (running1 != null) {
								running1 = Update.update_running(running1);
								// }
							} else if (Options_crud == 3) { // DELETE
								Delete.delete_running(running1);
							} else if (Options_crud == 4) { // ORDER
								Functions_order.order_running();
							} else if (Options_crud == 5) { /// DUMMIES
								MakeDummies.charge_dummies(5);
							}

							break;

						case 3: // TENNIS

							Options_crud = Functions_MainCrud.menu_crud("TENNIS");

							if (Options_crud == 0) { // CREATE
								tennis1 = Create.created_tennis(tennis1);

							} else if (Options_crud == 1) { // READ
								// if (tennis1 != null) {
								Read.read_tennis(tennis1);
								// }

							} else if (Options_crud == 2) { // UPDATE
								// if (tennis1 != null) {
								tennis1 = Update.update_tennis(tennis1);
								// }
							} else if (Options_crud == 3) { // DELETE
								Delete.delete_tennis(tennis1);
							} else if (Options_crud == 4) { // ORDER
								Functions_order.order_tennis();
							} else if (Options_crud == 5) { // DUMMIES
								MakeDummies.charge_dummies(5);
							}

							break;

						default:
							exit = true;
							break;
						}

					}
					if (cad == " CLIENT " ) {
						
						// String[] options = { " SWIMMING ", " FOOTBALL ", " RUNNING ", " TENNIS " , "
						// SALIR " }; // +0, -1, *2 , /3

						option = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
						switch (option) {

						case 0: // SWIMMING

							Options_crud_cli = Functions_MainCrud.menu_crud_cli("SWIMMING");

							if (Options_crud_cli == 0) { // READ
								Read.read_swimming(object);
								System.out.println(Singleton.a_swimming);
							} else if (Options_crud_cli == 1) { ///// DUMMIES/// DUMMIES
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Functions_order.order_swimming();
							}
							break;

						case 1: // FOOTBALL
							Options_crud_cli = Functions_MainCrud.menu_crud_cli("FOOTBALL");

							if (Options_crud_cli == 0) { // READ
								Read.read_football(football1);
								System.out.println(Singleton.a_football);
							} else if (Options_crud_cli == 1) { ///// DUMMIES/// DUMMIES
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Functions_order.order_football();
							}
							break;

						case 2: // RUNNING

							Options_crud_cli = Functions_MainCrud.menu_crud_cli("RUNNING");

							if (Options_crud_cli == 0) { // READ
								Read.read_running(running1);
								System.out.println(Singleton.a_running);
							} else if (Options_crud_cli == 1) { ///// DUMMIES/// DUMMIES
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Functions_order.order_running();
							}
							break;

						case 3: // TENNIS

							Options_crud_cli = Functions_MainCrud.menu_crud_cli("TENNIS");

							if (Options_crud_cli == 0) { // READ
								Read.read_tennis(tennis1);
								System.out.println(Singleton.a_tennis);
							} else if (Options_crud_cli == 1) { ///// DUMMIES/// DUMMIES
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Functions_order.order_tennis();
							}
							break;

						default:
							exit = true;
							break;
						}
					}
						if (cad == " VIP" ) {
							
						
					
						// String[] options = { " SWIMMING ", " FOOTBALL ", " RUNNING ", " TENNIS " , "
						// SALIR " }; // +0, -1, *2 , /3

						option = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
						switch (option) {

						case 0: // SWIMMING

							Options_crud_cli = Functions_MainCrud.menu_crud_vip("SWIMMING");

							if (Options_crud_cli == 0) { // READ
								Read.read_swimming(object);
								System.out.println(Singleton.a_swimming);
							} else if (Options_crud_cli == 1) { ///// UPDATE
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Update.update_swimming(object);
							} else if (Options_crud == 2) { // ORDER
								System.out.println("UPDATE MAIN : " + object);
								// if (object != null) {
								System.out.println("ENTRA update MAIN");
								Functions_order.order_swimming();
								// }
							}
							break;

						case 1: // FOOTBALL
							Options_crud_cli = Functions_MainCrud.menu_crud_vip("FOOTBALL");

							if (Options_crud_cli == 0) { // READ
								Read.read_football(football1);
								System.out.println(Singleton.a_football);
							} else if (Options_crud_cli == 1) { ///// UPDATE
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Update.update_football(football1);
							} else if (Options_crud == 2) { // ORDER
								System.out.println("UPDATE MAIN : " + object);
								// if (object != null) {
								System.out.println("ENTRA update MAIN");
								Functions_order.order_football();
								// }
							}
							break;

						case 2: // RUNNING

							Options_crud_cli = Functions_MainCrud.menu_crud_vip("RUNNING");

							if (Options_crud_cli == 0) { // READ
								Read.read_running(running1);
								System.out.println(Singleton.a_running);
							} else if (Options_crud_cli == 1) { ///// UPDATE
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Update.update_running(running1);
							} else if (Options_crud == 2) { // ORDER
								System.out.println("UPDATE MAIN : " + object);
								// if (object != null) {
								System.out.println("ENTRA update MAIN");
								Functions_order.order_running();
								// }
							}
							break;

						case 3: // TENNIS

							Options_crud_cli = Functions_MainCrud.menu_crud_vip("TENNIS");

							if (Options_crud_cli == 0) { // READ
								Read.read_tennis(tennis1);
								System.out.println(Singleton.a_tennis);
							} else if (Options_crud_cli == 1) { ///// UPDATE
								System.out.println("entar en dummies main");
								System.out.println(Options_crud);

								Update.update_tennis(tennis1);
							} else if (Options_crud == 2) { // ORDER
								System.out.println("UPDATE MAIN : " + object);
								// if (object != null) {
								System.out.println("ENTRA update MAIN");
								Functions_order.order_tennis();
								// }
							}
							break;
							
					default:
						exit = true;
						break;
					}
				
			}
			
				}while(!exit);
			
			
			
			default:
				exit2 = true;
				break;
					
	
		} 
	

		}while (exit2!=true);
		return -1;
	}
}
