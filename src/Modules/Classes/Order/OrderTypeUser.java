package Modules.Classes.Order;

import java.util.Comparator;

import Modules.Classes.sports;

public class OrderTypeUser implements Comparator<sports> {

	
	public int compare(sports o1, sports o2) {
		if (o1.getUser_type().compareTo(o2.getUser_type())>0) 
			return 1;
		if (o1.getUser_type().compareTo(o2.getUser_type())<0) 
			return -1;
		
		return 0;
	}
	

}
