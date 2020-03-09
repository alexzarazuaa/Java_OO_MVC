package Main;



import Modules.Login.Utils.MainLogin;


public class Main {
	
	
	public static void main(String[] args) {
		int exit = 0;
			
		do {
			exit = MainLogin.loginMainMenu();
			
		}while(exit == -1);
		
		
	
	}// END_CLASS_MAIN

}