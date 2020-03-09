package Modules.Login.Classes.Order;

import java.util.Comparator;

import Modules.Login.Classes.User;

public class OrderTypeFree  implements Comparator<User> {


	public int compare(User u1, User u2) {
		if (u1.getType_fee().compareTo(u2.getType_fee())>0)
			return 1;
		if (u1.getType_fee().compareTo(u2.getType_fee())<0) 
			return -1;
	
		return 0;
	}

}
