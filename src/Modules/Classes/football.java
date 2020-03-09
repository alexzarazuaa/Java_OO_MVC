package Modules.Classes;

import java.text.NumberFormat;

import Classes.dates;

public class football extends sports {

	private String football_type;
	private String brand;
	private String size;
	private float price;
	private int quantity;

	//// EL ATRIBUT RECALCULATPOTSER EL PREU QUE DEPENEN DE QUINA MARCA ES TINDRA UN
	//// PREU U ALTRE, INLCUS SI COMPRA UNA MARCA EN CONCRET
	///// UN DESCOMPTE JA QUE PER EXEMPLE EIXA MARCA ESTA FEM UNA CAMPAÑAN DEL 15 %

	public football(String Cod_Ref,String user_type, String city_shop, String habitual_client, String dni, dates date_nac,
			String football_type, String brand, String size, int quantity, dates date_buy, dates dateAfter) {
		super(Cod_Ref,user_type, city_shop, habitual_client, dni, date_nac, date_buy, dateAfter);
		this.football_type = football_type;
		this.brand = brand;
		this.size = size;
		this.quantity = quantity;
		this.price = setcalc_price();
	}
	
	
	public football () {/// CONSTRUCTOR POR DEFECTO VACIO
		super();
	}
	
	public football (String Cod_Ref) {//CONSTRUCTOR DE LA CLAVE PRIMARIA
		super(Cod_Ref);
	}

	///// GETTERS
	public String getFootball_type() {
		return football_type;
	}

	public String getBrand() {
		return brand;
	}

	public String getSize() {
		return size;
	}

	public int getquantity() {
		return quantity;
	}

	public String getprice() {
		NumberFormat Formatprice = NumberFormat.getCurrencyInstance();
		return Formatprice.format(price);
	}

	//// SETTERS

	public void setFootball_type(String football_type) {
		this.football_type = football_type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		setcalc_price();

	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
		setcalc_price();
	}

	public float setcalc_price() {
		// String brand_boats [] = { "NIKE " , " ADIDAS " , " PUMA "};
		//String users[] = { " MEN ", " WOMEN ", " CHILDREN " };
		//String clients[] = { " YES ", " NO " };

		if (getBrand() == "NIKE ") {
			System.out.println("entra NIKE");
			if (quantity == 3) {
				float price_D = 180;
				System.out.println("entra cantidad NIK");
				float discount = 25f;
				price = (price_D - (price_D * (discount / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
				 if (getHabitual_client() == " YES " ) { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
					System.out.println("entra cantidad HABITUAL");
					float discount_H = 5f;
					price = (price - (price * (discount_H / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
				}
			} else {
				price = 90;
			}

		}

		if (getBrand() == " ADIDAS ") {
			System.out.println("entra ADIDAS");
			if (quantity == 3) {
				float price_D = 140;
				System.out.println("entra cantidad");
				float discount = 15f;
				price = (price_D - (price_D * (discount / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
				 if (getHabitual_client() == " YES " ) { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
						System.out.println("entra cantidad HABITUAL");
						float discount_H = 5f;
						price = (price - (price * (discount_H / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
					}
			} else {
				price = 70;
			}

		}

		if (getBrand() == " PUMA ") {
			System.out.println("entra PUMA");
			if (quantity == 3) {
				float price_D = 60;
				System.out.println("entra cantidad PUM");
				float discount = 5f;
				price = (price_D - (price_D * (discount / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
				 if (getHabitual_client() == " YES " ) { // DESCUENTO ACUMULABLE DE SI ES CLIENTE HABITUAL
						System.out.println("entra cantidad HABITUAL");
						float discount_H = 5f;
						price = (price - (price * (discount_H / 100))); // DESCUENTO POR COMPRAR EN CANTIDAD
					}
			}else {
				 price = 30;
			}

		}
		return price;
	}

	//// TO STRING

	public String toString() {
		
		return "FOOTBALL : " + "\n" 
				+ "CODIGO DE REFERENCIA :" + getCod_Ref()  + ", \n" 
				+ "User type : " + getUser_type() + ", \n" 
				+ " City Shop : " + getCity_shop()
				+ ", \n" + "Habitual client : " + getHabitual_client() + ", \n" 
				+ "DNI : " + getdni() + ", \n"
				+ " Date of Birth : " + getdate_nac() + ", \n" 
				+ "Football type : " + getFootball_type() + ", \n"
				+ "Brand : " + getBrand() + ", \n" 
				+ " Size : " + getSize() + ", \n" 
				+ "PRICE :" + getprice() + ", \n"
				+ " DATE OF PURCHASE : " + getdate_buy() + ", \n"
				+ " DELIVERY : " + delivery() + ", \n";
	}

}
