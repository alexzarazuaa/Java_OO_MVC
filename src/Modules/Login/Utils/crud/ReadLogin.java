package Modules.Login.Utils.crud;

import javax.swing.JOptionPane;

import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;


public class ReadLogin {

	public static User read_user(User user) { // MOSTRAR SWIMMING
		System.out.println("entra en FUNCION read swimming ");

		int size = SingletonLogin.user.size();
		//int position = -1;

		if (SingletonLogin.user.isEmpty()) {
			System.out.println("SI EL objeto  ESTA vacio ");
			JOptionPane.showMessageDialog(null, "MAIN ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			System.out.println("NO ESTA VACIO Y ENTRA PARA MOSTRAR EL READ");
			System.out.println("Entra case all");
			for (int i = 0; i < size; i++) {
				String read = "";
				read = read + (SingletonLogin.user.get(i).toString() + "\n\n");
				JOptionPane.showMessageDialog(null, read, "Swimming : " + "\n\n", JOptionPane.INFORMATION_MESSAGE);
			}

		}
		return user;
	}

}
