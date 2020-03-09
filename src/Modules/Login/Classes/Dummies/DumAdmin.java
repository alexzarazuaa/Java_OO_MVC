package Modules.Login.Classes.Dummies;

import Classes.dates;
import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Utils.FunctionsDate;


public class DumAdmin {
	public static void DefaultAdmin() {
		
		User user = null;
//		String types [] = {" Monthly " , " Annual"}; 
//		String opt_type [] = { " ADMIN " , " CLIENT " , " VIP"};
		
		String NickName = "ADMIN123";
		String password = "adminAdmin!";
		String type =" ADMIN " ;
		String mail = "admin@gmail.com";
		dates contractDate = FunctionsDate.d_Today();
		String type_fee = " Annual";
	
		user =  new User (NickName,password,type,mail,contractDate,type_fee);
		
		SingletonLogin.user.add(user);
		
	}
	
	public static void DefaultClient() {
		
		User user = null;
//		String types [] = {" Monthly " , " Annual"}; 
//		String opt_type [] = { " ADMIN " , " CLIENT " , " VIP"};
		
		String NickName = "ALEX258";
		String password = "alexAL20!";
		String type =" VIP" ;
		String mail = "alex@gmail.com";
		dates contractDate = FunctionsDate.d_Today();
		String type_fee = " Monthly ";
	
		user =  new User (NickName,password,type,mail,contractDate,type_fee);
		
		SingletonLogin.user.add(user);
		
	}
	

}
