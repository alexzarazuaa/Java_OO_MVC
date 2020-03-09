package Modules.Classes;

import java.text.NumberFormat;

import Classes.dates;

public class swimming extends sports {

	private String swimcuit_color;
	private String swimcuit_size; // TALLAS XS - S - M - L
	private float price;

	public swimming(String Cod_Ref,String user_type, String city_shop, String habitual_client, String dni, dates date_nac,
			String swimcuit_color, String swimcuit_size, dates date_buy, dates dateAfter) {
		super(Cod_Ref,user_type, city_shop, habitual_client, dni, date_nac, date_buy, dateAfter);
		this.swimcuit_color = swimcuit_color;
		this.swimcuit_size = swimcuit_size;
		this.price = setcalc_price();

	}
	
		public swimming () {/// CONSTRUCTOR POR DEFECTO VACIO
			super();
		}
		
		
		public swimming (String Cod_Ref) {// CONSTRUCTOR DE LA CLAVE PRIMARIA
			super(Cod_Ref);
		}
		

	//// GETTERS

	public String getSwimcuit_color() {
		return swimcuit_color;
	}

	public String getSwimcuit_size() {
		return swimcuit_size;
	}

	public String getprice() {
		NumberFormat Formatprice = NumberFormat.getCurrencyInstance();
		return Formatprice.format(price);
	}

	///// SETTERS

	public void setSwimcuit_color(String swimcuit_color) {
		this.swimcuit_color = swimcuit_color;
	}

	public void setSwimcuit_size(String swimcuit_size) {
		this.swimcuit_size = swimcuit_size;
	}

	public float setcalc_price() {
		// String clients[] = { " YES ", " NO " };
		// String users[] = { " MEN ", " WOMEN ", " CHILDREN " };

		if (getUser_type() == " CHILDREN ") {
			System.out.println("ENTRA EN CHILDREN");
			float price_c = 50;
			float discount_c = 15f;
			price = (price_c - (price_c * (discount_c / 100)));// DESCUENTO PARA LOS ÑIÑOS

		} else {

			if (getUser_type() == " MEN " || getUser_type() == " WOMEN ") {
				System.out.println("ENTRA MEN WOM");
				if (getHabitual_client() == " YES ") { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
					System.out.println("entra cantidad HABITUAL");
					float discount_H = 5f;
					float price_H = 80;
					price = (price_H - (price_H * (discount_H / 100))); // DESCUENTO POR SER CLIENTE HABITUAL

				}
			}
		}

		return price;

	}

	@Override
	public String toString() {
		return "SWIMMING : "   + " \n" 
				+ "CODIGO DE REFERENCIA :" + getCod_Ref()  + ", \n" 
				+  "User type : " + getUser_type() + "\n"
				+ " City shop : " + getCity_shop() + "\n"
				+ "Habitual client : " + getHabitual_client() + "\n" 
				+ "DNI : " + getdni() + "\n" 
				+ " Date of Birth : " + getdate_nac() + "\n" 
				+ "Swimcuit_color : " + getSwimcuit_color() + "\n" 
				+ " Swimcuit size : " + getSwimcuit_size() + "\n" 
				+ " DATE OF PURCHASE : " + getdate_buy() + "\n" 
				+ " DELIVERY : " + delivery() + " \n" 
				+ " PRICE : " + getprice();
	}

}
