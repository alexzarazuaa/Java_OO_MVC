package Modules.Login.Classes.Order;

import java.util.Comparator;

import Modules.Login.Classes.User;

public class OrderNickname implements Comparator<User> {

	public int compare(User u1, User u2) {
		if (u1.getNickName().compareTo(u2.getNickName())>0)
			return 1;
		if (u1.getNickName().compareTo(u2.getNickName())<0) 
			return -1;
	
		return 0;
	}
	
}
