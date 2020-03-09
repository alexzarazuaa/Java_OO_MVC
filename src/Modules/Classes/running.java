package Modules.Classes;

import java.text.NumberFormat;

import Classes.dates;

public class running extends sports {

	private String tshirt;
	private String shorts;
	private float price;

	public running(String Cod_Ref,String user_type, String city_shop, String habitual_client, String dni, dates date_nac,
			String tshirt, String shorts, dates date_buy, dates dateAfter) {
		super(Cod_Ref,user_type, city_shop, habitual_client, dni, date_nac, date_buy, dateAfter);
		this.tshirt = tshirt;
		this.shorts = shorts;
		this.price = setcalc_price();
	}
	
	
	public running () {/// CONSTRUCTOR POR DEFECTO VACIO
		super();
	}
	
	
	public running (String Cod_Ref) {// CONSTRUCTOR DE LA CLAVE PRIMARIA
		super(Cod_Ref);
	}

	public String getTshirt() {
		return tshirt;
	}

	public String getShorts() {
		return shorts;
	}

	public String getprice() {
		NumberFormat Formatprice = NumberFormat.getCurrencyInstance();
		return Formatprice.format(price);
	}

	public void setTshirt(String tshirt) {
		this.tshirt = tshirt;
		setcalc_price();
	}

	public void setShorts(String shorts) {
		this.shorts = shorts;
		setcalc_price();
	}

	public float setcalc_price() {
		// String tshirt_options [] = { " long sleeve " , " short sleeve " , "THERMAL"};
		// String shorts_options [] = { "long pants " , " short pants " };

		if (getTshirt() == "THERMAL") {
			float price_D = 110;
			System.out.println("entra cantidad THERMAL");
			float discount = 10f;
			price = (price_D - (price_D * (discount / 100))); // DESCUENTO POR COMPRAR TERMICA
			if (getHabitual_client() == " YES ") { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
				System.out.println("entra cantidad HABITUAL");
				float discount_T = 5f;
				price = (price - (price * (discount_T / 100))); // DESCUENTO POR CLIENTE HABITUAL
			}
		}
		if (getHabitual_client() == " YES ") { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
				System.out.println("entra cantidad HABITUAL");
				float discount_H = 5f;
				float price_H= 100;
				price = (price_H - (price_H * (discount_H / 100))); // DESCUENTO POR CLIENTE HABITUAL
			}else  {
			price = 100;
		}
		
		if (getShorts() ==  "long pants "  ) {
			float price_L = 60;
			System.out.println("entra cantidad LONG");
			float discount = 10f;
			price = (price_L - (price_L * (discount / 100))); // DESCUENTO POR COMPRAR TERMICA
			if (getHabitual_client() == " YES ") { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
				System.out.println("entra cantidad HABITUAL");
				float discount_T = 5f;
				price = (price - (price * (discount_T / 100))); // DESCUENTO POR CLIENTE HABITUAL
			}
		}

		

		return price;

	}

	public String toString() {
		return "RUNNING :  " 
				+ "CODIGO DE REFERENCIA :" + getCod_Ref()  + ", \n" 
				+ "\n" + "User type : " + getUser_type() + "\n" 
				+ " City shop : " + getCity_shop() + "\n"
				+ "Habitual client : " + getHabitual_client() + "\n" 
				+ "DNI : " + getdni() + "\n" 
				+ " Date of Birth : " + getdate_nac() + "\n" 
				+ "T-SHIRT : " + getTshirt() + "\n" 
				+ " Shorts : " + getShorts() + "\n"
			    + "PRICE :" + getprice() + ", \n" 
				+ " DATE OF PURCHASE : " + getdate_buy() + ", \n" 
			     + " DELIVERY : " + delivery() + ", \n";
	}

}
