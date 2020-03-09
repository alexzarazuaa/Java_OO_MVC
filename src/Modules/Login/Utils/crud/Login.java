package Modules.Login.Utils.crud;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Dummies.MakeDummies;
import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Utils.FindUser;
import Modules.Login.Utils.LoginData;
import Modules.Utils.Functions_order;
import Modules.Utils.Crud.Create;
import Modules.Utils.Crud.Delete;
import Modules.Utils.Crud.Functions_MainCrud;
import Modules.Utils.Crud.Read;
import Modules.Utils.Crud.Update;
import utils.ButtonBox;

public class Login {
/////////////////////////////////////////////////////

	public static String user_login(User user) { // MOSTRAR SWIMMING
		String cad = "";
		int location = -1;
		//String opt_type [] = { " ADMIN " , " CLIENT " , " VIP"};
		user = LoginData.resource_nickname();
		System.out.println(" CREATED primaria = " + user.getNickName() + " "  );
		location = FindUser.find_user(user);
		System.out.println(SingletonLogin.user.get((SingletonLogin.user.size()-1)).toString());
		System.out.println("location = " + location + " " + user );
		if (location == -1) {
			System.out.println(SingletonLogin.user.get(location).toString());
			JOptionPane.showMessageDialog(null, "ERROR USER ADMIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			user=SingletonLogin.user.get(location);
			cad=user.getType();
			System.out.println("cad=" + cad);
	}
		return cad;
	}
	
	
	
}
