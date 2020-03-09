package Modules.Classes.Order;

import java.util.Comparator;

import Modules.Classes.sports;

public class OrderCity  implements Comparator <sports>{


	public int compare(sports o1, sports o2) {
		if (o1.getCity_shop().compareTo(o2.getCity_shop())>0)
			return 1;
		if (o1.getCity_shop().compareTo(o2.getCity_shop())<0) 
			return -1;
	
		return 0;
	}
	
	

}
