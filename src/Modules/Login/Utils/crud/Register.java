package Modules.Login.Utils.crud;



import javax.swing.JOptionPane;

import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Utils.FindUser;
import Modules.Login.Utils.LoginData;


public class Register {
	
	public static User create_User (User user) {

		int location = -1;
		
		user = LoginData.resource_nickname();
		System.out.println(" CREATED primaria = " + user.getNickName() + " "  );
		location = FindUser.find_user(user);
		System.out.println("location = " + location + " " + user );
		if (location != -1) {
			System.out.println(SingletonLogin.user.get(location).toString());
			JOptionPane.showMessageDialog(null, "ERROR USER ADMIN ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			user = LoginData.data_admin();
			SingletonLogin.user.add(user);
			//SingletonLogin.user = new ArrayList <User> ();
			System.out.println("guardado en el ARRAY : " + user);
		}
	System.out.println("objeto creado");
	return user;
		
	}

	
	

}
