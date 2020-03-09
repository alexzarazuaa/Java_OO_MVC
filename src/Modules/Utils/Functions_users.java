package Modules.Utils;

import javax.swing.JOptionPane;

import Classes.dates;
import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import utils.ComboBox;
import utils.Numbers;
import utils.Validates_Data;

public class Functions_users {

	///// CREATED /////////////////////////

	////////////////////////////////////// SWIMMING

	public static swimming resource_swimming() { // CREAR SWIMMING
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String size[] = { " XS", " S ", " M ", " L " };
	
		String Cod_Ref = Singleton.Cod_Ref;
		String user_type = ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users);
		String city_shop = Validates_Data.pidecity();
		String habitual_client = ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients);
		String dni = Validates_Data.pidedni();
		dates date_nac = FunctionsDate.date_nac("INTRO YOUR DATE OF BIRHT");
		String swimcuit_color = Validates_Data.swimciut_color();
		String swimcuit_size = ComboBox.comboBoxV(" Choose the size : ", " SIZE", size);
		dates date_buy = FunctionsDate.d_Today();
		dates dateAfter = FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY");
		
		
		return new swimming(Cod_Ref, user_type, city_shop, habitual_client, dni, date_nac, swimcuit_color,
				swimcuit_size, date_buy, dateAfter);
	}

	public static swimming resource_sCodref() { // CREA LA CLAVE PRIMARIA
		Singleton.Cod_Ref = Validates_Data.referencia("", "");
		return new swimming(Singleton.Cod_Ref);
	}

	////////////////////////////////////////// FOOTBALL

	public static football resource_football() { // CREAR football
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String brand_boats[] = { "NIKE ", " ADIDAS ", " PUMA " };

		String Cod_Ref = Singleton.Cod_Ref;
		String user_type = ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users);
		String city_shop = Validates_Data.pidecity();
		String habitual_client = ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients);
		String dni = Validates_Data.pidedni();
		dates date_nac = FunctionsDate.date_nac("INTRO YOUR DATE OF BIRHT");
		String football_type = Validates_Data.football_type();
		String brand = ComboBox.comboBoxV(" WHICH BRAND DO YOU WANT ? ", " BRAND ", brand_boats);
		String size = Validates_Data.size();
		int quantity = Numbers.inputNumber("Quantity", "Quantity");
		dates date_buy = FunctionsDate.d_Today();
		dates dateAfter = FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY");
	
		return new football(Cod_Ref, user_type, city_shop, habitual_client, dni, date_nac, football_type, brand, size,
				quantity, date_buy, dateAfter);
	}

	public static football resource_fCodref() { // CREA LA CLAVE PRIMARIA
		Singleton.Cod_Ref = Validates_Data.referencia("", "");
		return new football(Singleton.Cod_Ref);
	}

/////////////////////////////////////////////////// RUNNING 

	public static running resource_running() { // CREAR RUNNING
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String tshirt_options[] = { " long sleeve ", " short sleeve ", "THERMAL" };
		String shorts_options[] = { "long pants ", " short pants " };
		
		String Cod_Ref = Singleton.Cod_Ref;
		String user_type = ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users);
		String city_shop = Validates_Data.pidecity();
		String habitual_client = ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients);
		String dni = Validates_Data.pidedni();
		dates date_nac = FunctionsDate.date_nac("INTRO YOUR DATE OF BIRHT");
		String tshirt = ComboBox.comboBoxV("CHOOSE YOUR T-SHIRT TYPE ", " T-SHIRT", tshirt_options);
		String shorts = ComboBox.comboBoxV("CHOOSE YOUR SHORTS TYPE ", " SHORTS ", shorts_options);
		dates date_buy = FunctionsDate.d_Today();
		dates dateAfter = FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY");

		return new running(Cod_Ref, user_type, city_shop, habitual_client, dni, date_nac, tshirt, shorts, date_buy,
				dateAfter);
	}

	public static running resource_rCodref() { // CREA LA CLAVE PRIMARIA
		Singleton.Cod_Ref = Validates_Data.referencia("", "");
		return new running(Singleton.Cod_Ref);
	}

	////////////////////////////////////////////////////////////// TENNIS

	public static tennis resource_tennis() { // CREAR TENNIS
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String c_accessories[] = { "Tennis Racquets ", " Wristbands ", " Tennis Balls" };

		String Cod_Ref = Singleton.Cod_Ref;
		String user_type = ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users);
		String city_shop = Validates_Data.pidecity();
		String habitual_client = ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients);
		String dni = Validates_Data.pidedni();
		dates date_nac = FunctionsDate.date_nac("INTRO YOUR DATE OF BIRHT");
		String accessories = ComboBox.comboBoxV(" CHOOSE AN  ACCESSORIE :", " ACCESSORIE ", c_accessories);
		dates date_buy = FunctionsDate.d_Today();
		dates dateAfter = FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY");
	
		return new tennis(Cod_Ref, user_type, city_shop, habitual_client, dni, date_nac, accessories, date_buy,
				dateAfter);
	}

	public static tennis resource_tCodref() { // CREA LA CLAVE PRIMARIA
		Singleton.Cod_Ref = Validates_Data.referencia("", "");
		return new tennis(Singleton.Cod_Ref);
	}

	//// UPDATE /////////////////////

	public static swimming update_swimming(swimming object) { // MODIFICAR SWIMMING
		System.out.println("entra en user update");
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String size[] = { " XS", " S ", " M ", " L " };
		String[] options = {  " COD REFERENCIA " , " USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
				" SWIMCUIR COLOR ", " SWIMCUIT SIZE " ," DATE OF DELIVERY " };

		switch (ComboBox.comboBoxV("Option:", "Option", options)) {
		case " COD REFERENCIA " :
			Functions_users.set_swimmingCodRef(object);
			break;
		case  " USER TYPE ":
			object.setUser_type(ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users));
			break;
		case " CITY SHOP": //
			object.setCity_shop(Validates_Data.pidecity());
			break;
		case " HABITUAL CLIENT ": //
			object.setHabitual_client(
					ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients));
			break;
		case " DNI ":
			object.setdni(Validates_Data.pidedni());
			break;
		case "DATE OF BIRHT  ":
			object.setdate_nac(FunctionsDate.date_nac("INTRO YOUR DATE OF BITH"));
			break;
		case " SWIMCUIR COLOR ": //
			object.setSwimcuit_color(Validates_Data.swimciut_color());
			break;
		case  " SWIMCUIT SIZE ": //
			object.setSwimcuit_size(ComboBox.comboBoxV(" Choose the size : ", " SIZE", size));
			break;
		case " DATE OF DELIVERY ":
			object.setdateAfter(FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY"));
			break;
		}

		return object;

	}

	//////////////////////////////////////////////////////

	public static football update_football(football object) { // MODIFICAR FOOTBALL
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String brand_boats[] = { "NIKE ", " ADIDAS ", " PUMA " };
		String[] options = {  " COD REFERENCIA " ," USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
				" FOOTBALL TYPE ", " BRAND ", " SIZE ", " DATE OF DELIVERY " };

		switch (ComboBox.comboBoxV("Option :", "Option", options)) {
		case " COD REFERENCIA " :
			Functions_users.set_footballCodRef(object);
			break;
		case " USER TYPE ": //
			object.setUser_type(ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users));
		case " CITY SHOP": //
			object.setCity_shop(Validates_Data.pidecity());
			break;
		case " HABITUAL CLIENT ": //
			object.setHabitual_client(
					ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients));
			break;
		case" DNI ":
			object.setdni(Validates_Data.pidedni());
			break;
		case  "DATE OF BIRHT  ":
			object.setdate_nac(FunctionsDate.date_nac("INTRO YOUR DATE OF BITH"));
			break;
		case " FOOTBALL TYPE ": //
			object.setFootball_type(Validates_Data.football_type());
			break;
		case " BRAND ": //
			object.setBrand(ComboBox.comboBoxV(" WHICH BRAND DO YOU WANT ? ", " BRAND ", brand_boats));
			break;
		case " SIZE ": //
			object.setSize(Validates_Data.size());
		case " DATE OF DELIVERY ":
			object.setdateAfter(FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY"));
			break;
		}

		return object;

	}

//////////////////////////////////////////////////////

	public static running update_running(running object) { //// MODIFICAR RUNNING
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String tshirt_options[] = { " long sleeve ", " short sleeve ", "THERMAL" };
		String shorts_options[] = { "long pants ", " short pants " };
		String[] options = { " COD REFERENCIA " ," USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ", " T-SHIRT  ",
				" SHORT ", " DATE OF DELIVERY " };

		switch (ComboBox.comboBoxV("Option:", "Option", options)) {
		case " COD REFERENCIA ":
			Functions_users.set_runningCodRef(object);
			break;
		case " USER TYPE ": //
			object.setUser_type(ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users));
			break;
		case " CITY SHOP": //
			object.setCity_shop(Validates_Data.pidecity());
		case  " HABITUAL CLIENT ":
			object.setHabitual_client(
					ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients));
			break;
		case  " DNI ":
			object.setdni(Validates_Data.pidedni());
			break;
		case "DATE OF BIRHT  ": //
			object.setdate_nac(FunctionsDate.date_nac("INTRO YOUR DATE OF BITH"));
			break;
		case " T-SHIRT  ": //
			object.setTshirt(ComboBox.comboBoxV("CHOOSE YOUR SHORTS TYPE ", " SHORTS ", tshirt_options));
		case " SHORT ":
			object.setShorts(ComboBox.comboBoxV("CHOOSE YOUR SHORTS TYPE ", " SHORTS ", shorts_options));
			break;
		case " DATE OF DELIVERY ":
			object.setdateAfter(FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY"));
		}

		return object;

	}
	

	//////////////////////////////////////////////////////

	public static tennis update_tennis(tennis object) { // MODIFICAR TENNIS
		String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		String clients[] = { " YES ", " NO " };
		String c_accessories[] = { "Tennis Racquets ", " Wristbands ", " Tennis Balls" };
		String[] options = {  " COD REFERENCIA " ," USER TYPE ", " CITY SHOP", " HABITUAL CLIENT ", " DNI ", "DATE OF BIRHT  ",
				" ACCESSORIE " ," DATE OF DELIVERY " };

		switch (ComboBox.comboBoxV("Option:", "Option", options)) {
		case  " COD REFERENCIA ":
			Functions_users.set_tennisCodRef(object);
		case " USER TYPE ":
			object.setUser_type(ComboBox.comboBoxV(" ARE YOU :", " USER_TIPE ", users));
			break;
		case " CITY SHOP": //
			object.setCity_shop(Validates_Data.pidecity());
			break;
		case " HABITUAL CLIENT ": //
			object.setHabitual_client(
					ComboBox.comboBoxV(" ARE YOU AN HABITUAL CLIENT :", " HABITUAL CLIENT ", clients));
			break;
		case " DNI ":
			object.setdni(Validates_Data.pidedni());
			break;
		case  "DATE OF BIRHT  ":
			object.setdate_nac(FunctionsDate.date_nac("INTRO YOUR DATE OF BITH"));
			break;
		case " ACCESSORIE ": //
			object.setAccessories(ComboBox.comboBoxV(" CHOOSE AN  ACCESSORIE :", " ACCESSORIE ", c_accessories));
		case " DATE OF DELIVERY ":
			object.setdateAfter(FunctionsDate.Date_AfterToday("INTRO THE DATE OF DELIVERY"));
			break;
		}

		return object;

	}
	
	//////////////////////////// UPDATES DE LAS CLAVES PRIMARIAS //// 
	
	public static void set_swimmingCodRef (swimming object) {  // UPADTE SWIMMING 
		int location = -1;
		object = Functions_users.resource_sCodref();
		location = Functions_Find.find_swimming(object);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "errorDNI","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}else {
			object.setCod_Ref(Singleton.Cod_Ref);
		}
	}
	
	public static void set_footballCodRef (football object) {
		int location = -1;
		object = Functions_users.resource_fCodref();
		location=Functions_Find.find_football(object);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "errorDNI","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}else {
			object.setCod_Ref(Singleton.Cod_Ref);
		}
	}
	
	
	public static void set_runningCodRef (running object) {
		int location = -1;
		object = Functions_users.resource_rCodref();
		location=Functions_Find.find_running(object);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "errorDNI","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}else {
			object.setCod_Ref(Singleton.Cod_Ref);
		}
	}
	
	public static void set_tennisCodRef (tennis object) {
		int location = -1;
		object =Functions_users.resource_tCodref();
		location = Functions_Find.find_tennis(object);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "errorDNI","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}else {
			object.setCod_Ref(Singleton.Cod_Ref);
		}
	}

}
