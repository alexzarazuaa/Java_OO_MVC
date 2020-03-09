package Modules.Login.Utils.crud;

import javax.swing.JOptionPane;


import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Utils.FindUser;
import Modules.Login.Utils.LoginData;

import utils.ButtonBox;

public class DeleteLogin {
	
	public static void delete_user(User user) {
		String[] options = { " DELETE ALL ", " DELETE ONE " };
		int location = -1;

		if (SingletonLogin.user.isEmpty()) {
			JOptionPane.showMessageDialog(null, "mainerror", "errortitle", JOptionPane.ERROR_MESSAGE);
		} else {
			switch (ButtonBox.buttonsOptions("MENU DELETE ADMIN", "LOGIN DELETE", options)) {
			case 0:
				System.out.println("Entra case all");
				SingletonLogin.user.clear();
				JOptionPane.showMessageDialog(null, "delete");
				break;
			case 1:
				location = -1;
				user = LoginData.resource_nickname();
				location = FindUser.find_user(user);
				if (location != -1) {
					SingletonLogin.user.remove(location);
					JOptionPane.showMessageDialog(null, "delete");
				} else {
					JOptionPane.showMessageDialog(null, "usererror", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}
	
	


}
