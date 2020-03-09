package tests;

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
import Modules.Login.Utils.crud.Register;
import utils.ButtonBox;
import utils.ComboBox;

//public class Menu_login_test {
//
//	public static User user = null; 
//	public final static int EXIT = -1;
//
//	public static void main(String[] args) {
//		int confirmed = 0;
//		int type = 0;
//		int actions = 0;
//		int settingsMenu = 0;
//		String mainMenu = "";
//		int userType = 0;
//		int logout = 0;
//		int child = 0;
//		int location = 0;
//		boolean asGuest = false;
//
//		Singleton.a_swimming = new ArrayList<swimming>();
//		System.out.println(Singleton.a_swimming);
//		Singleton.a_football = new ArrayList<football>();
//		Singleton.a_running = new ArrayList<running>();
//		Singleton.a_tennis = new ArrayList<tennis>();
//		SingletonLogin.user = new ArrayList<User>();
//		// SingletonLogin.user.add(user);
//		DumAdmin.DefaultAdmin();
//		DumAdmin.DefaultClient();
//		final int Cant_Dummies = 5;
//
//		String[] options = { "  SWIMMING   ", " FOOTBALL ", " RUNNING   ", "  TENNIS ", " SALIR " }; // +0, -1, *2 , /3
//		String[] options_lo = { "Login", "Register", "Recover Pass", " SPORTS",  " LOGOUT" };
//		boolean exit = false;
//		do {
//			while (SingletonLogin.user==null) {
//				if (asGuest==true)
//					break;
//				mainMenu = ComboBox.comboBoxV("Login", "Login", options_lo);
//				switch (mainMenu) {
//					case"Login":
//						user = Login.user_login(user);
//						break;
//					case "Register":
//						user = Register.create_User(user);
//						break;
//					case "Recover Pass":
//						LoginUpdate.recPassword(user);
//						break;
//					case " LOGOUT":
//						exit = true;
//						break;
//				}
//			}
//			do {
//
//				type = ButtonBox.buttonsOptions(" MENU : ", " MAIN MENU ", options);
//				do {
//					if (type == EXIT) {
//						exit=true;
//						//functions.exit();
//					} else if (objects[type] == functions.SETTINGS) {
//						actions=utils.showMenu(Settings.ACTIONS, Languages.message(Languages.MAIN, "Choose actions"), Languages.message(Languages.MAIN, "Actions"));
//						switch (actions) {
//							case Settings.GET:
//								utils.showInformation(Singleton.SETTINGS.toString(),Languages.message(Languages.MAIN, "Settings"));
//								break;
//							case Settings.UPDATE:
//							settingsMenu=utils.showMenu(Settings.PARAMETERS, Languages.message(Languages.MAIN, "Choose parameters"), Languages.message(Languages.MAIN, "Settings"));
//								switch (settingsMenu) {
//									case 0:
//										Singleton.SETTINGS.setLanguage(functionsSettings.askLanguage());
//										break;
//									case 1:
//										if (Singleton.SETTINGS.getTestMode()) {
//											utils.showInformation("Application set to normal mode", "Test mode");
//											Singleton.SETTINGS.setTestMode(false);
//										} else {
//											utils.showInformation("Application set to test mode", "Test mode");
//											Singleton.SETTINGS.setTestMode(true);
//										}
//										break;
//									case 2:
//										dateFormat = functionsSettings.askDateFormat();
//										Singleton.SETTINGS.setDateFormat(dateFormat);
//										Date.setFormat(dateFormat);
//										break;
//								}								
//								break;
//							case -1:
//								exit=true;
//								functions.exit();
//								break;
//						}
//					}
//					else {
//						
//						switch (objects[type]) {
//							case "Users":
//								if (SingletonAuth.actualUser instanceof Admin) {
//									child = utils.showMenu(SingletonUser.OBJECTS, Languages.message(Languages.MAIN, "Choose object"), Languages.message(Languages.MAIN, "Objects"));
//									if (Singleton.SETTINGS.getTestMode()) 
//										actionsMenu = Singleton.TESTACTIONS;
//									else 
//										actionsMenu = SingletonUser.ADMIN_PARAMETERS;
//								} else if (SingletonAuth.actualUser instanceof Client) {
//									child = userFunctions.CLIENT;
//									actionsMenu = SingletonUser.CLIENT_PARAMETERS;
//								}
//								actions=utils.showMenu(actionsMenu, Languages.message(Languages.MAIN, "Choose actions"), Languages.message(Languages.MAIN, "Actions"));
//								if (type == EXIT || actions == EXIT) {
//									exit=true;
//									functions.exit();
//								}
//								switch (child){
//									case userFunctions.ADMIN:
//										switch (actionsMenu[actions]) {
//											case Singleton.CREATE:
//												CreateUser.admin();
//												break;
//											case Singleton.GET:
//												ReadUser.admin();
//												break;
//											case Singleton.UPDATE:
//												UpdateUser.admin();								
//												break;
//											case Singleton.DELETE:
//												DeleteUser.admin();
//												break;
//											case Singleton.ORDER:
//												OrderUser.admin();
//												break;
//											case Singleton.CREATE_DUMMIES:
//												CreateUserDummies.admin(functions.inputInt("How many dummies do you want to create?", "Dummies"));
//												break;
//											case Singleton.UPDATE_DUMMIES:
//												UpdateUserDummies.admin();
//												break;
//											case SingletonUser.GET_PROFILE:
//												SingletonAuth.actualUser.toString();
//												break;
//											case SingletonUser.UPDATE_PROFILE:
//												location = FindUser.admin((Admin) SingletonAuth.actualUser);
//												userFunctions.setChange(SingletonAuth.actualUser);
//												SingletonUser.ADMIN.set(location, (Admin) SingletonAuth.actualUser);
//												break;
//										}
//										break;
//									case userFunctions.CLIENT:
//										switch (actionsMenu[actions]) {
//											case Singleton.CREATE:
//												CreateUser.client();
//												break;
//											case Singleton.GET:
//												ReadUser.client();
//												break;
//											case Singleton.UPDATE:
//												UpdateUser.client();								
//												break;
//											case Singleton.DELETE:
//												DeleteUser.client();
//												break;
//											case Singleton.ORDER:
//												OrderUser.client();
//												break;
//											case Singleton.CREATE_DUMMIES:
//												CreateUserDummies.client(functions.inputInt("How many dummies do you want to create?", "Dummies"));
//												break;
//											case Singleton.UPDATE_DUMMIES:
//												UpdateUserDummies.client();
//												break;
//											case SingletonUser.GET_PROFILE:
//												utils.showInformation(SingletonAuth.actualUser.toString(),"Profile");
//												break;
//											case SingletonUser.UPDATE_PROFILE:
//												location = FindUser.client((Client) SingletonAuth.actualUser);
//												userFunctions.setChange(SingletonAuth.actualUser);
//												SingletonUser.CLIENT.set(location, (Client) SingletonAuth.actualUser);
//												break;
//										}
//										break;
//								}						
//							
//								break;
//							case "Vehicles":
//								if (SingletonAuth.actualUser instanceof Admin) {
//									if (Singleton.SETTINGS.getTestMode()) 
//										actionsMenu = Singleton.TESTACTIONS;
//									else 
//										actionsMenu = SingletonVehicle.ADMIN_PARAMETERS;
//								} else if (SingletonAuth.actualUser instanceof Client) {
//									actionsMenu = SingletonVehicle.CLIENT_PARAMETERS;
//								} else {
//									actionsMenu = SingletonVehicle.GUEST_PARAMETERS;
//								}
//								child = utils.showMenu(SingletonVehicle.OBJECTS, Languages.message(Languages.MAIN, "Choose object"), Languages.message(Languages.MAIN, "Objects"));
//								actions=utils.showMenu(actionsMenu, Languages.message(Languages.MAIN, "Choose actions"), Languages.message(Languages.MAIN, "Actions"));
//								if (type == EXIT || actions == EXIT) {
//									exit=true;
//									functions.exit();
//								}
//								switch (child){
//									case vehicleFunctions.BIKE:
//										switch (actionsMenu[actions]) {
//											case Singleton.CREATE:
//												CreateVehicle.bike();
//												break;
//											case Singleton.GET:
//												ReadVehicle.bike();
//												break;
//											case Singleton.UPDATE:
//												UpdateVehicle.bike();								
//												break;
//											case Singleton.DELETE:
//												DeleteVehicle.bike();
//												break;
//											case Singleton.ORDER:
//												OrderVehicle.bike();
//												break;
//											case Singleton.CREATE_DUMMIES:
//												CreateVehicleDummies.bike(functions.inputInt("How many dummies do you want to create?", "Dummies"));
//												break;
//											case Singleton.UPDATE_DUMMIES:
//												UpdateVehicleDummies.bike();
//												break;
//												/*
//											case -1:
//												exit=true;
//												functions.exit();
//												break;*/
//										}
//										break;
//									case vehicleFunctions.CAR:
//										switch (actionsMenu[actions]) {
//											case Singleton.CREATE:
//												CreateVehicle.car();
//												break;
//											case Singleton.GET:
//												ReadVehicle.car();
//												break;
//											case Singleton.UPDATE:
//												UpdateVehicle.car();								
//												break;
//											case Singleton.DELETE:
//												DeleteVehicle.car();
//												break;
//											case Singleton.ORDER:
//												OrderVehicle.car();
//												break;
//											case Singleton.CREATE_DUMMIES:
//												CreateVehicleDummies.car(functions.inputInt("How many dummies do you want to create?", "Dummies"));
//												break;
//											case Singleton.UPDATE_DUMMIES:
//												UpdateVehicleDummies.car();
//												break;
//											/*case -1:
//												exit=true;
//												functions.exit();
//												break;*/
//										}
//										break;
//									case vehicleFunctions.SCOOTER:
//										switch (actionsMenu[actions]) {
//											case Singleton.CREATE:
//												CreateVehicle.scooter();
//												break;
//											case Singleton.GET:
//												ReadVehicle.scooter();
//												break;
//											case Singleton.UPDATE:
//												UpdateVehicle.scooter();								
//												break;
//											case Singleton.DELETE:
//												DeleteVehicle.scooter();
//												break;
//											case Singleton.ORDER:
//												OrderVehicle.scooter();
//												break;
//											case Singleton.CREATE_DUMMIES:
//												CreateVehicleDummies.scooter(functions.inputInt("How many dummies do you want to create?", "Dummies"));
//												break;
//											case Singleton.UPDATE_DUMMIES:
//												UpdateVehicleDummies.scooter();
//												break;
//											/*case -1:
//												exit=true;
//												functions.exit();
//												break;*/
//										}
//										break;
//								}						
//								break;
//							case "Settings":
//								
//								break;
//							case "Logout":
//								logout=0;
//								SingletonAuth.actualUser=null;
//								asGuest=false;
//								break;
//						}
//						
//					}
//					if (logout!=0)
//						confirmed = utils.showConfirm(Languages.message(Languages.MAIN, "Do you want to change object?"));
//				}while (confirmed!=0);
//				if (logout!=0)
//					logout = utils.showConfirm(Languages.message(Languages.MAIN, "Do you want to logout?"));
//			} while (logout!=0);	
//	} while (!exit);
//	}
//}


