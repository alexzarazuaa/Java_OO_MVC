package Modules.Utils;

import java.util.Collections;

import javax.swing.JOptionPane;

import Modules.Classes.Singleton;
import Modules.Classes.Order.OrderCity;
import Modules.Classes.Order.OrderDate_Delivery;
import Modules.Classes.Order.Order_DateBirth;
import utils.ComboBox;

public class Functions_order {

	public static void order_swimming() {
		String[] options = { " DATE BIRTH ", " DATE DELIVERY ", " CITY SHOP " };
		if (Singleton.a_swimming.isEmpty()) {
			JOptionPane.showMessageDialog(null, " ERROR ", " ERROR ", JOptionPane.ERROR_MESSAGE);

		} else {
			switch (ComboBox.comboBoxV(" CHOOSE AN ORDER ", "ORDER ", options)) {
			case " DATE BIRTH ":
				Collections.sort(Singleton.a_swimming, new Order_DateBirth());
				break;
			case " DATE DELIVERY ":
				Collections.sort(Singleton.a_swimming, new OrderDate_Delivery());
				break;
			case " CITY SHOP ":
				Collections.sort(Singleton.a_swimming, new OrderCity());
				break;

			}
		}
	}
	
	
	
	public static void order_running () {
		String[] options = { " DATE BIRTH ", " DATE DELIVERY ", " CITY SHOP " };
		if (Singleton.a_running.isEmpty()) {
			JOptionPane.showMessageDialog(null, " ERROR ", " ERROR ", JOptionPane.ERROR_MESSAGE);

		} else {
			switch (ComboBox.comboBoxV(" CHOOSE AN ORDER ", "ORDER ", options)) {
			case " DATE BIRTH ":
				Collections.sort(Singleton.a_running, new Order_DateBirth());
				break;
			case " DATE DELIVERY ":
				Collections.sort(Singleton.a_running, new OrderDate_Delivery());
				break;
			case " CITY SHOP ":
				Collections.sort(Singleton.a_running, new OrderCity());
				break;

			}
		}
	}
	
	public static void order_football () {
		String[] options = { " DATE BIRTH ", " DATE DELIVERY ", " CITY SHOP " };
		if (Singleton.a_football.isEmpty()) {
			JOptionPane.showMessageDialog(null, " ERROR ", " ERROR ", JOptionPane.ERROR_MESSAGE);

		} else {
			switch (ComboBox.comboBoxV(" CHOOSE AN ORDER ", "ORDER ", options)) {
			case " DATE BIRTH ":
				Collections.sort(Singleton.a_football, new Order_DateBirth());
				break;
			case " DATE DELIVERY ":
				Collections.sort(Singleton.a_football, new OrderDate_Delivery());
				break;
			case " CITY SHOP ":
				Collections.sort(Singleton.a_football, new OrderCity());
				break;

			}
		}
	}
	
	public static void order_tennis () {
		String[] options = { " DATE BIRTH ", " DATE DELIVERY ", " CITY SHOP " };
		if (Singleton.a_tennis.isEmpty()) {
			JOptionPane.showMessageDialog(null, " ERROR ", " ERROR ", JOptionPane.ERROR_MESSAGE);

		} else {
			switch (ComboBox.comboBoxV(" CHOOSE AN ORDER ", "ORDER ", options)) {
			case " DATE BIRTH ":
				Collections.sort(Singleton.a_tennis, new Order_DateBirth());
				break;
			case " DATE DELIVERY ":
				Collections.sort(Singleton.a_tennis, new OrderDate_Delivery());
				break;
			case " CITY SHOP ":
				Collections.sort(Singleton.a_tennis, new OrderCity());
				break;

			}
		}
	}

}
