package Modules.Classes;

import java.text.NumberFormat;

import Classes.dates;

public class tennis extends sports {

	private String accessories;
	private float price;
	
	///  

	public tennis(String Cod_Ref,String user_type, String city_shop, String habitual_client, String dni , dates date_nac ,String accessories , dates date_buy,dates dateAfter) {
		super(Cod_Ref,user_type, city_shop, habitual_client, dni, date_nac, date_buy,dateAfter);
		this.accessories = accessories;
		this.price = setcalc_price();
	}

	
	
	public tennis () {/// CONSTRUCTOR POR DEFECTO VACIO
		super();
	}
	
	
	public tennis (String Cod_Ref) {// CONSTRUCTOR DE LA CLAVE PRIMARIA
		super(Cod_Ref);
	}
	
	///// GETTERS Y SETTERS

	public String getAccessories() {
		return accessories;
	}
	public String getprice() {
		NumberFormat Formatprice = NumberFormat.getCurrencyInstance();
		return Formatprice.format(price);
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
		setcalc_price();
	}
	
	public float setcalc_price() {
	 /*String c_accessories [] = { "Tennis Racquets " 
		, 	" Wristbands " , " Tennis Balls" } */
		
		if (getAccessories() ==  "Tennis Racquets ") {
			System.out.println("RAQUETA");
			price = 300;
		}
		if (getAccessories() == " Wristbands " ) {
			System.out.println("PULSERA");
			price = 20;
		}
		if (getAccessories()== " Tennis Balls") {
			System.out.println("PELOTAS TENIS");
			price = 13;
		}
		 if (getHabitual_client() == " YES " ) { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
				System.out.println("entra cantidad HABITUAL");
				float discount_H = 10f;
				price = (price - (price * (discount_H / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
		 }
		
		return price;
	}

	///// TO STRING
	public String toString() {
		return " TENNIS : " + "\n" 
				+ "CODIGO DE REFERENCIA :" + getCod_Ref()  + ", \n" 
				+ "User type : " + getUser_type() + "\n" +  
				" City Shop : " + getCity_shop() +  "\n"
				+ "Habitual client : " + getHabitual_client() +"\n"
				+ "DNI : " 			+ getdni()   + "\n" 
				+ " Date of Birth : " + getdate_nac() + "\n" 
				+ " ACCESORIES  : "  + getAccessories() + "\n" 
				+ " DATE OF PURCHASE : " + getdate_buy() + "\n"
				+ " DELIVERY : " + delivery() + " \n" 
				+ " PRICE : " + getprice();
	}

}
