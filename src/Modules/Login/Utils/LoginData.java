package Modules.Login.Utils;

import Classes.dates;
import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Utils.FunctionsDate;
import utils.ComboBox;
import utils.Validates_Data;

public class LoginData {
	
	public static User data_admin () {
		String types [] = {" Monthly " , " Annual"}; 
		String opt_type [] = { " ADMIN " , " CLIENT " , " VIP"};
		
		String NickName = SingletonLogin.NickName;
		String password = Validates_Data.password();
		String type = ComboBox.comboBoxV("WHAT USER TYPE ARE YOU", "  USERT YPE ", opt_type);
		String mail = Validates_Data.mail();
		dates contractDate = FunctionsDate.d_Today();
		String type_fee = ComboBox.comboBoxV("WHAT TYPE ARE YOUR SUBSCRIPTION", " TYPE ", types);
	
		return new User (NickName,password,type,mail,contractDate,type_fee);
		
	}
	
	public static User resource_nickname() { // CREA LA CLAVE PRIMARIA
		SingletonLogin.NickName = Validates_Data.NickName();
		return new User(SingletonLogin.NickName);
	}
	

	
	

}
