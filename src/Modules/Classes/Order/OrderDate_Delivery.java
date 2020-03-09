package Modules.Classes.Order;

import java.util.Comparator;

import Modules.Classes.sports;

/////////////////////////////////////////////// ORDERS

public class OrderDate_Delivery implements Comparator<sports> {

	
	public int compare(sports o1, sports o2) {
		return o1.getdateAfter().getDaysInterval(o2.getdateAfter().toString());
	}

}
