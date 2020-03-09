package Modules.Login.Utils.crud;


import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;
import Modules.Login.Utils.FindUser;
import Modules.Login.Utils.LoginData;
import utils.ComboBox;
import utils.Validates_Data;

public class LoginUpdate {
	
	public static User recPassword(User user) {

		user = LoginData.resource_nickname();
		int location = -1;
		if (user == null) {
			JOptionPane.showMessageDialog(null, user + " not found", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			location = FindUser.find_user(user);
			String mail = Validates_Data.mail().toString();
			if (mail == user.getMail()) {
				user.setPassword(Validates_Data.password());
				if (user.getType() == "admin")
					SingletonLogin.user.set(location, (User) user);
				if (user.getType()  == "client") 
					SingletonLogin.user.set(location, (User) user);
				JOptionPane.showMessageDialog(null, "Updated password", "Updated password", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		return user;
	}
	
	
	public static User updateUser(User user) {
		String[] optionsAdmin = {"NickName", "type", "mail",  "type_fee"};
		String[] options_VIP = {"NickName",  "mail", "type_fee"};
		String types [] = {" Monthly " , " Annual"}; 
		String opt_type [] = { " ADMIN " , " CLIENT " , " VIP"};
		boolean interruptor = false;
		//User user = null;
		
		if (user.getType().equals(((User)user).getType())) {
			user = (User) user;
			switch (ComboBox.comboBoxV("Option to update", "Option", optionsAdmin)) {
				case "type": // TYPE
					user.setType(ComboBox.comboBoxV("WHAT USER TYPE ARE YOU", "  USERT YPE ", opt_type));
					break;
				case "mail": // MAIL
					user.setMail(Validates_Data.mail());
					break;
				case "type_fee": // TIPO DE SUSCRIPCION
					user.setType_fee(ComboBox.comboBoxV("WHAT ARE YOUR SUSBCRIPTION ? ", "  USERT YPE ", types));
					break;
				case "NickName": // NICKNAME
					do {
						interruptor = true;
						user.setNickName(SingletonLogin.NickName); 
						if (FindUser.find_user(user) != -1) {
							JOptionPane.showMessageDialog(null, user + " exists", "Error", JOptionPane.ERROR_MESSAGE);
							interruptor = false;
						}
					} while(!interruptor);


					break;
			}
			
			if (JOptionPane.showConfirmDialog(null, "Update? \n" + ((User)user).toString()) == 0) {
				SingletonLogin.user.set(FindUser.find_user(user), ((User)user));
			}
			
		}
		
		if (user.getType().equals(((User)user).getType()))  {
			switch (ComboBox.comboBoxV("Option to update", "Option", options_VIP)) {
			case "NickName": // NICKNAME
				do {
					interruptor = true;
					user.setNickName(SingletonLogin.NickName); 
					if (FindUser.find_user(user) != -1) {
						JOptionPane.showMessageDialog(null, user + " exists", "Error", JOptionPane.ERROR_MESSAGE);
						interruptor = false;
					}
				} while(!interruptor);


				break;
			case "mail": // MAIL
				user.setMail(Validates_Data.mail());
				break;
			case "type_fee": // TIPO DE SUSCRIPCION
				user.setType_fee(ComboBox.comboBoxV("WHAT ARE YOUR SUSBCRIPTION ? ", "  USERT YPE ", types));
				break;
			}
			
			if (JOptionPane.showConfirmDialog(null, "Update? \n" + ((User)user).toString()) == 0) {		
				SingletonLogin.user.set(FindUser.find_user(user), ((User)user));
			}
		
		}
		return user;
	}
	
	
	
	

}
