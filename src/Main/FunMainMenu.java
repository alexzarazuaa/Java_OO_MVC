package Main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Classes.Order.OrderMenuLogin;
import Modules.Login.Utils.MainLogin;
import Modules.Login.Utils.crud.DeleteLogin;
import Modules.Login.Utils.crud.LoginUpdate;
import Modules.Login.Utils.crud.ReadLogin;
import Modules.Login.Utils.crud.Register;
import Modules.Utils.Functions_order;
import Modules.Utils.Crud.Create;
import Modules.Utils.Crud.Functions_MainCrud;
import Modules.Utils.Crud.Read;
import utils.ButtonBox;
import utils.ComboBox;

public class FunMainMenu {
//	
//	public static int Client_Menu() {
//		boolean exit = false;
//		String[] options_S = { "  SWIMMING   ", " FOOTBALL ", " RUNNING   ", "  TENNIS " , " SALIR " }; // +0, -1, *2 , /3
//		String[] crudOptions = {"read" ,"order"};
//		
//		do {
//			Main.resourceOption = ComboBox.comboBox("option" + ":", "option", options); // GUARDAR QUE SE HA ELEGIDO
//
//			if (Main.resourceOption == -1) {
//				exit = true;
//			} else if (Main.resourceOption == 1){
//				MainLogin.loginMainMenu();
//				return -2; // PARA CAMBIAR DE MENÚ
//			} else {
//				switch (ComboBox.comboBox("option" + ":","option", o)) {
//				case 0:
//					
//					break;
//				case 1:
//					Functions_order.
//					break;
//				}
//					
//			}
//	
//		} while (!exit);
//	
//	return -1; // PARA SALIR DEL PROGRAMA
//}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	

	public static void clientUserMenu(User user) {
		String[] options = {"Read", "Update", "Order"};
		
		switch (ButtonBox.buttonsOptions("Option:", "Option", options)) {
			case 0:
				JOptionPane.showMessageDialog(null, user.toString(), "Your user", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				LoginUpdate.updateUser(user);
				break;
			case 2:
				DeleteLogin.delete_user(user);
				break;
		}
	}
	
//	public static void adminUsersMenu(User user) {
//		System.out.println("usuario registrado y entra");
//		swimming object = null;
//		football football1 = null;
//		running running1 = null;
//		tennis tennis1 = null;
//
//		int Options_crud = 0;
//		
//		int option = 0;
//		boolean exit = false;
//		Singleton.a_swimming = new ArrayList <swimming> ();
//		System.out.println(Singleton.a_swimming);
//		Singleton.a_football = new ArrayList <football> ();
//		Singleton.a_running = new ArrayList <running> ();
//		Singleton.a_tennis = new ArrayList <tennis> ();
//		
//		final int Cant_Dummies = 5;
//		String[] options = { "  SWIMMING   ", " FOOTBALL ", " RUNNING   ", "  TENNIS " , " SALIR " }; // +0, -1, *2 , /3
//		System.out.println(SingletonLogin.user.toString());
//		switch (user.getType()) {
//		
//		case " ADMIN " :
//
//			
//		String[] options = { "  SWIMMING   ", " FOOTBALL ", " RUNNING   ", "  TENNIS " , " SALIR " }; // +0, -1, *2 , /3
//	
//			do {
//				option = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
//				switch (option) {
//	
//				case 0: // SWIMMING
//	
//					Options_crud = Functions_MainCrud.menu_crud("SWIMMING");
//	
//					if (Options_crud == 0) { // CREATE
//						object = Create.created_swimming(object);
//						System.out.println(Singleton.a_swimming);
//					} else if (Options_crud == 1) { // READ
//						//System.out.println(" OBJECTO : " + object);
//							 Read.read_swimming(object);
//						
//					} else if (Options_crud == 2) { // UPDATE
//						System.out.println("UPDATE MAIN : " + object);
//						//if (object != null) {
//							System.out.println("ENTRA update MAIN");
//							object=  Update.update_swimming(object);
//						//}
//					} else if (Options_crud == 3) { // DELETE
//						System.out.println(object);
//						Delete.delete_swimming(object);
//						System.out.println(object);
//					}else if (Options_crud == 4) { //
//						
//						Functions_order.order_swimming();
//					}else if (Options_crud == 5) { ///// DUMMIES/// DUMMIES
//						System.out.println("entar en dummies main");
//						System.out.println(Options_crud);
//						MakeDummies.charge_dummies(Cant_Dummies);
//					}
//					break;
//	
//				case 1: // FOOTBALL
//	
//					Options_crud = Functions_MainCrud.menu_crud("FOOTBALL");
//	
//					if (Options_crud == 0) { // CREATE
//						football1 =  Create.created_football(football1);
//	
//					} else if (Options_crud == 1) { // READ
//						/// QUITO EL (football1 != null)  PORQUE SINO NO FUNCIONA EL READ CON DUMMIES
//						//if (football1 != null) {
//							Read.read_football(football1);
//						//}
//	
//					} else if (Options_crud == 2) { // UPDATE
//						//if (football1 != null) {
//							football1= Update.update_football(football1);
//						//}
//					} else if (Options_crud == 3) { // DELETE
//						Delete.delete_football(football1);
//					}else if (Options_crud == 4) { // ORDER
//						Functions_order.order_football();
//					}else if (Options_crud == 5) { /// DUMMIES
//						MakeDummies.charge_dummies(Cant_Dummies);
//					}
//	
//					break;
//	
//				case 2: // RUNNING
//	
//					Options_crud = Functions_MainCrud.menu_crud("RUNNING");
//	
//					if (Options_crud == 0) { // CREATE
//						running1=Create.created_running(running1);
//	
//					} else if (Options_crud == 1) { // READ
//						//if (running1 != null) {
//							 Read.read_running(running1);
//						//}
//	
//					} else if (Options_crud == 2) { // UPDATE
//						//if (running1 != null) {
//							running1=Update.update_running(running1);
//						//}
//					} else if (Options_crud == 3) { // DELETE
//						Delete.delete_running(running1);
//					}else if (Options_crud == 4) { // ORDER 
//						Functions_order.order_running();
//					}else if (Options_crud == 5) { /// DUMMIES 
//						MakeDummies.charge_dummies(Cant_Dummies);
//					}
//	
//					break;
//	
//				case 3: // TENNIS
//	
//					Options_crud = Functions_MainCrud.menu_crud("TENNIS");
//	
//					if (Options_crud == 0) { // CREATE
//						tennis1= Create.created_tennis(tennis1);
//	
//					} else if (Options_crud == 1) { // READ
//						//if (tennis1 != null) {
//							Read.read_tennis(tennis1);
//						//}
//	
//					} else if (Options_crud == 2) { // UPDATE
//						//if (tennis1 != null) {
//							tennis1=Update.update_tennis(tennis1);
//						//}
//					} else if (Options_crud == 3) { // DELETE
//						Delete.delete_tennis(tennis1);
//					}else if (Options_crud == 4) { // ORDER
//						Functions_order.order_tennis();
//					}else if (Options_crud == 5) { // DUMMIES
//						MakeDummies.charge_dummies(Cant_Dummies);
//					}
//	
//					break;
//	
//				default:
//					exit = true;
//					break;
//				}
//	
//			} while (!exit);
//			break;
//		case " CLIENT " :
//			
//			
//	
//			do {
//				option = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
//				switch (option) {
//	
//				case 0: // SWIMMING
//	
//					Options_crud = Functions_MainCrud.menu_crud("SWIMMING");
//	
//					if (Options_crud == 1) { // READ
//						//System.out.println(" OBJECTO : " + object);
//							 Read.read_swimming(object);
//						
//					
//					}else if (Options_crud == 4) { //
//						
//						Functions_order.order_swimming();
//					}
//					break;
//	
//				case 1: // FOOTBALL
//	
//					Options_crud = Functions_MainCrud.menu_crud("FOOTBALL");
//	
//					 if (Options_crud == 1) { // READ
//						/// QUITO EL (football1 != null)  PORQUE SINO NO FUNCIONA EL READ CON DUMMIES
//						//if (football1 != null) {
//							Read.read_football(football1);
//						//}
//	
//					}else if (Options_crud == 4) { // ORDER
//						Functions_order.order_football();
//					}
//					break;
//	
//				case 2: // RUNNING
//	
//					Options_crud = Functions_MainCrud.menu_crud("RUNNING");
//
//					 if (Options_crud == 1) { // READ
//						//if (running1 != null) {
//							 Read.read_running(running1);
//						//}
//	
//					
//					}else if (Options_crud == 4) { // ORDER 
//						Functions_order.order_running();
//					}
//	
//					break;
//	
//				case 3: // TENNIS
//	
//					Options_crud = Functions_MainCrud.menu_crud("TENNIS");
//	
//				 if (Options_crud == 1) { // READ
//						//if (tennis1 != null) {
//							Read.read_tennis(tennis1);
//						//}
//	
//					
//					}else if (Options_crud == 4) { // ORDER
//						Functions_order.order_tennis();
//					}
//	
//					break;
//	
//				default:
//					exit = true;
//					break;
//				}
//	
//			} while (!exit);
//			break;
//
//		default:
//			break;
//		}
//	}
//	
	
}
