package Modules.Login.Classes.Order;

import java.util.Collections;

import Modules.Login.Classes.SingletonLogin;
import utils.ButtonBox;

public class OrderMenuLogin {
	
	public static void orderUsers() {
		String[] options = {"DNI", "Brithdate"};
		switch (ButtonBox.buttonsOptions("Order:", "Order", options)) {
			case 0:
				Collections.sort(SingletonLogin.user, new OrderNickname());
				break;
			case 1:
				Collections.sort(SingletonLogin.user, new OrderTypeFree());
				break;
		}
	}
	

}
