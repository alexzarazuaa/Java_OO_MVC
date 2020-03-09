package Modules.Classes;



import Classes.dates;
import Modules.Utils.FunctionsDate;

public abstract class sports implements Comparable<sports> {

	/////////////
	
	private String Cod_Ref ;  /// CLAVE PRIMARIA NUMERO DE REFERENCIA
	private String user_type; // TIPO DE USUARIO -- HOMBRE MUJER O NIÑOS
	private String city_shop; /// INTRODUCIR LA LOCALIDAD DE LA TIENDA
	private String habitual_client;// PREGUNTA SI EL CLIENTE ES HABITUAL PARA POSTERIORES DESCUENTOS
	private String dni;
	private dates date_nac;
	private dates date_buy;/// AGAFER LA FECHA DE HUI PER
	private dates dateAfter;/// INTRODUCE LA FECHA DE ENTREGA
	private int deliverydays;  /// TIPO DE ENVIO ATRIBUT RECALCULAT DEPENEN DEL // NUM DIES SERA UN TIPO U ALTRE

	// CONSTRUCTOR

	public sports(String Cod_ref,String user_type, String city_shop, String habitual_client, String dni, dates date_nac,
			dates date_buy, dates dateAfter) {
		//
		this.Cod_Ref = Cod_ref; // CLAU PRIMARIA
		this.user_type = user_type;
		this.city_shop = city_shop;
		this.habitual_client = habitual_client;
		this.dni = dni;
		this.date_nac = date_nac;
		this.date_buy = FunctionsDate.d_Today();
		this.dateAfter = dateAfter;
		this.deliverydays = date_buy.getDaysInterval(dateAfter.toString());
		
	}
	
	
	
	public sports () {// CONSTRUCTOR POR DEFECTO VACIO
		
		
	}
	
	public sports(String Cod_Ref) { // CONSTRUCTOR DE LA CLAU PRIMARIA
		this.Cod_Ref = Cod_Ref;
	}

	

	// SETTERS
	public void setCod_Ref (String Cod_ref) {
		Cod_Ref = Cod_ref;
	}
	public void setdni(String dni) {
		this.dni = dni;
	}

	public void setdate_nac(dates dates_nac) {
		this.date_nac = dates_nac;
	}

	public void setHabitual_client(String habitual_client) {
		this.habitual_client = habitual_client;
	}

	public void setCity_shop(String city_shop) {
		this.city_shop = city_shop;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public void setdate_buy(dates date_buy) {
		this.date_buy = FunctionsDate.d_Today();
		setdeliverydays();
	}

	public void setdateAfter (dates dateAfter) {
		this.dateAfter = dateAfter;
		setdeliverydays();
		
	}
	public void setdeliverydays() {
		this.deliverydays = date_buy.getDaysInterval(dateAfter.toString());
			
		}



	// GETTERS

	public String getCod_Ref() {
		return Cod_Ref;
	}

	public String getUser_type() {
		return user_type;
	}

	public String getCity_shop() {
		return city_shop;
	}

	public String getHabitual_client() {
		return habitual_client;
	}

	public String getdni() {
		return dni;
	}

	public dates getdate_nac() {
		return date_nac;
	}

	public dates getdate_buy() {
		return date_buy;
	}

	public  dates getdateAfter() {
		return dateAfter;
	}
	public int getdeliverydays() {
		return deliverydays;
	}

	
	
	
	public String delivery () {
		String read = "";
		if (this.getdeliverydays() == 4 ) {
			
			 read =( " " + " IS AN ESTANDAR DELIVERY " + " \n" + " DATE DELIVERY : "  + this.getdateAfter());
			
		}
		if (this.getdeliverydays() == 3 ) {
			 read =(  " " + " IS AN ESTANDAR DELIVERY " + " \n" + " DATE DELIVERY : "  + this.getdateAfter());
			
		}if (this.getdeliverydays() == 1) {
			 read =(   " " + " IS AN PREMIUM DELIVERY " + " \n" + " DATE DELIVERY : "  + this.getdateAfter());

		} else {
			
			 read =( " " + " IS AN NORMAL DELIVERY " + " \n" + " DATE DELIVERY : "  + this.getdateAfter());
		}
		
		return read;
	}
	
	///////////////////////////////////////
	
	public int compareTo(sports param) {//para ordenar los empleados por nombre
		if(this.getCod_Ref().compareTo(param.getCod_Ref())>0)
			return 1;
		if(this.getCod_Ref().compareTo(param.getCod_Ref())<0)
			return -1;
		return 0;
	  }
	

	
	
	public boolean equals(sports object){
		return getCod_Ref().equals(((sports)object).getCod_Ref());
	}		
	

	////////////////////////////////////////////
	
	
	// TOSTRING
	public abstract String toString();

	// PERQUE ES MOSTRA EL TO STRING EN CADA FILLA, LA FILLA MOSTRA LO DE LA FILLA
	// MES LO DE LA MARE

}
