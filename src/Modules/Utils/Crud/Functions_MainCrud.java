package Modules.Utils.Crud;


import utils.ButtonBox;

public class Functions_MainCrud {

	///////////////////////// MENU OPCIONES CRUD
	public static int menu_crud(String sports) { // MEN� CRUD ADMIN
		String[] Options_crud = { "Create ", " Read ", " Update ", " Delete" , " Order" , " Dummies" };
		return ButtonBox.buttonsOptions("OPTION :" + "\n" + sports, "MAIN CRUD :", Options_crud);

	}
	
	public static int menu_crud_cli(String sports) { // MEN� CRUD CLIENTE NORMAL
		String[] Options_crud = {  " Read " ," Order"  };
		return ButtonBox.buttonsOptions("OPTION :" + "\n" + sports, "MAIN CRUD :", Options_crud);

	}
	
	public static int menu_crud_vip(String sports) { // MEN� CRUD CLIENTE VIP
		String[] Options_crud = {  " Read " ," UPDATE "," Order"  };
		return ButtonBox.buttonsOptions("OPTION :" + "\n" + sports, "MAIN CRUD :", Options_crud);

	}
	
	

}