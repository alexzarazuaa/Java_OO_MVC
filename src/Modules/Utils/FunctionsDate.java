package Modules.Utils;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Classes.dates;
import utils.Strings;

public class FunctionsDate {

	///////////////////////////////// EXPRESION REGULARS

	private static final String Validate_city = "^[a-zA-Z\\s]*$";
	private static final String Validate_swimcuit_color = "^[a-zA-Z\\s]*$";
	private static final String Validate_football_type = "^[a-zA-Z\\s]*$";
	private static final String plantilla_dni = "^[0-9]{8}+[A-Z]$";
	private static final String Validate_dates = "[0-9]{2}[ / ][0-9]{2}[ / ][0-9]{4}";
	private static final String Validate_size = "^[2-5]{1}[0-9]{1}$";
	private static final String plantilla_codRef = "^[0-9]{3}$";
	private static final String validate_mail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String validate_nickName = "^[A-Z]+[0-9]{3}$";
	private static final String Expresion_password="^(?=.{8,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";
	

	///// VALIDAR CIUDAD
	public static boolean v_city(String city_shop) {
		Pattern pattern = Pattern.compile(Validate_city);
		Matcher matcher = pattern.matcher(city_shop);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	//// VALIDAR DNI

	public static boolean v_dni(String dni) {
		Pattern pattern = Pattern.compile(plantilla_dni);
		Matcher matcher = pattern.matcher(dni);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	///////// VALIDAR FECHA
	public static boolean v_fecha(String date) {
		Pattern pattern = Pattern.compile(Validate_dates);
		Matcher matcher = pattern.matcher(date);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	///// VALIDAR EL COLOR DEL BAÑADOR

	public static boolean V_swimcuit_color(String swimcuit_color) {
		Pattern pattern = Pattern.compile(Validate_swimcuit_color);
		Matcher matcher = pattern.matcher(swimcuit_color);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	/////// VALIDAR EL TIPO DE FUTBOL , SI ES FUTBOL SALA O FUTBOL EN CESPED
	public static boolean V_football_type(String football_type) {
		Pattern pattern = Pattern.compile(Validate_football_type);
		Matcher matcher = pattern.matcher(football_type);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	///////// VALIDATE LA TALLA DE LES BOTES O ESPORTIVES DE FUTBOL

	public static boolean V_size(String size) {
		Pattern pattern = Pattern.compile(Validate_size);
		Matcher matcher = pattern.matcher(size);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean v_CodRef (String Cod_Ref) {
		Pattern pattern = Pattern.compile(plantilla_codRef);
		Matcher matcher = pattern.matcher(Cod_Ref);
		if (matcher.matches()) {
			return true;
		}
		return false;	
	}

	/////////////////////////////////////////////////////

		
		public static boolean v_mail(String mail){
	        Pattern pattern=Pattern.compile(validate_mail);
	        Matcher matcher = pattern.matcher(mail);
			if(matcher.matches()){
			return true;
			  } 
		    return false; 
		  }
		
		
		public static boolean v_nickname(String NickName){
	        Pattern pattern=Pattern.compile(validate_nickName);
	        Matcher matcher = pattern.matcher(NickName);
			if(matcher.matches()){
			return true;
			  } 
		    return false; 
		  }

		public static boolean v_password(String password){
	        Pattern pattern=Pattern.compile(Expresion_password);
	        Matcher matcher = pattern.matcher(password);
			if(matcher.matches()){
			return true;
			  } 
		    return false; 
		  }
		
	
	//////////////////////////////////////////////

	public static dates date_nac(String message) {
		String date = "";
		dates dateNac = null;
		boolean interruptor = true;
		int[] dayMonths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {
			interruptor = true;
			dayMonths[2] = 28;
			date = Strings.inputString(message, "DATE ");
			if (interruptor == false) {
				interruptor = false;
				System.out.println("FORMAT INCORRECT");
				JOptionPane.showMessageDialog(null, "Invalid Format", "The formate", JOptionPane.WARNING_MESSAGE);
			} else {
				interruptor = true;
				dateNac = new dates(date);
				System.out.println(dateNac.toString());
				if (v_fecha(date) == false) {
					interruptor = false;
					JOptionPane.showMessageDialog(null, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
				} else {

					if (dateNac.leapYear() == true) { // SI EL AÑO ES BISIESTO
						dayMonths[2] = 29;
					}

					if (dateNac.plusmonth() == true) { // SI EL DIA SUPERA EL MÁXIMO DEL MES
						System.out.println("incorrect day");
						interruptor = false;
					}
				}
			}

		} while (!interruptor);

		return dateNac;
	}

	////////////////////////////////////////////////////////////

	public static dates dateAfter(String message) {
		String date = "";
		dates dateAfter = null;
		boolean interruptor = true;
		int[] dayMonths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {
			interruptor = true;
			dayMonths[2] = 28;
			date = Strings.inputString(message, "DATE ");
			if (interruptor == false) {
				interruptor = false;
				System.out.println("FORMAT INCORRECT");
				JOptionPane.showMessageDialog(null, "Invalid Format", "The formate", JOptionPane.WARNING_MESSAGE);
			} else {
				interruptor = true;
				dateAfter = new dates(date);
				System.out.println(dateAfter.toString());
				if (v_fecha(date) == false) {
					interruptor = false;
					JOptionPane.showMessageDialog(null, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
				} else {

					if (dateAfter.leapYear() == true) { // SI EL AÑO ES BISIESTO
						dayMonths[2] = 29;
					}

					if (dateAfter.plusmonth() == true) { // SI EL DIA SUPERA EL MÁXIMO DEL MES
						System.out.println("incorrect day");
						interruptor = false;
					}
				}
			}

		} while (!interruptor);

		return dateAfter;
	}

	////////////////////////////////////////////////////
	
	public static dates d_Today() { // PASA LA FECHA DE HOY
		dates date_t = new dates("03/6/2010");
		date_t.setToday();
		return date_t;

	}
	
	/////////////////////////////////
	
	
	/////////////////////////////////
	
	public static dates Date_AfterToday(String message) { // COMPRUEBA QUE LA FECHA INTRODUCIDA SEA POSTERIOR A LA DE
															// HOY
		dates date_entrega = null;
		boolean interruptor = false;
		do {
			date_entrega = FunctionsDate.dateAfter("INTRO THE DATE OF DELIVERY " + "\n" + "TODAY IS : " + dia_semana());
			if (date_entrega != d_Today())
				interruptor = true;
		} while (!interruptor);
		return date_entrega;
	}
	

	////////////////////////////////////
	
	public static String dia_semana() {

		// Creamos una instancia del calendario
		Calendar now = Calendar.getInstance();
		Calendar dates = new GregorianCalendar();
		String dayweek = "";
		int año = ((Calendar) dates).get(Calendar.YEAR);
		int dia = ((Calendar) dates).get(Calendar.DAY_OF_MONTH);

		System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		// Array con los dias de la semana
		String[] strDays = new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
		//ARRAY CON LOS MESES DEL AÑO
		String[] strMonths= new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

		// El dia de la semana inicia en el 1 mientras que el array empieza en el 0
		System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1] + " " +  dia + " " + strMonths[now.get(Calendar.MONTH)] + " De  " + " " + año ) ;
		dayweek =  strDays[now.get(Calendar.DAY_OF_WEEK) - 1] + " " +  dia + " " + strMonths[now.get(Calendar.MONTH)] + " De" + " " + año ;
		
		return dayweek;
	}
	
	
	////////////////////////////////
	



}
