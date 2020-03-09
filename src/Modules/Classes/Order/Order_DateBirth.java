package Modules.Classes.Order;

import java.util.Comparator;

import Modules.Classes.sports;

public class Order_DateBirth implements Comparator<sports> {

	public int compare(sports o1, sports o2) {
	
		return o1.getdate_nac().getDaysInterval(o2.getdate_nac().toString());
	}
	

}
