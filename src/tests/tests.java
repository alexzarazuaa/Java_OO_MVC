package tests;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import Modules.Classes.sports;
import Modules.Utils.FunctionsDate;

public class tests {

	public static void FECHA() {

		Calendar fecha = new GregorianCalendar();
		int año = ((Calendar) fecha).get(Calendar.YEAR);

		int mes = ((Calendar) fecha).get(Calendar.MONTH);
		int dia = ((Calendar) fecha).get(Calendar.DAY_OF_MONTH);
		int hora = ((Calendar) fecha).get(Calendar.HOUR_OF_DAY);
		int minuto = ((Calendar) fecha).get(Calendar.MINUTE);
		int segundo = ((Calendar) fecha).get(Calendar.SECOND);

		System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
		System.out.println("Hora Actual : " + hora + " : " + minuto + " : " + segundo);

		JOptionPane.showMessageDialog(null, "Fecha Actual : " + dia + "/" + (mes + 1) + "/" + año + "\n\n"
				+ "Hora Actual : " + hora + " : " + minuto + " : " + segundo, " FECHA Y HORA ",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void dia_semana() {

		// Creamos una instancia del calendario
		Calendar now = Calendar.getInstance();
		Calendar dates = new GregorianCalendar();
		int año = ((Calendar) dates).get(Calendar.YEAR);
		int mes = ((Calendar) dates).get(Calendar.MONTH);
		int dia = ((Calendar) dates).get(Calendar.DAY_OF_MONTH);

		System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		// Array con los dias de la semana
		String[] strDays = new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
		//ARRAY CON LOS MESES DEL AÑO
		String[] strMonths= new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

		// El dia de la semana inicia en el 1 mientras que el array empieza en el 0
		System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1] + " " +  dia + " " + strMonths[now.get(Calendar.MONTH)] + " De  " + " " + año ) ;
		JOptionPane.showMessageDialog(null,"Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1] + " " +  dia + " " + strMonths[now.get(Calendar.MONTH)] + " De" + " " + año );
	}
	
	
	
	public static String date_compra() { /// fecha de compra que es la fecha actual del sistema

		Calendar dates = new GregorianCalendar();
		Calendar now = Calendar.getInstance(); // Creamos una instancia del calendario
		String Date_PURCHASE = "";
		int año = ((Calendar) dates).get(Calendar.YEAR);
		int mes = ((Calendar) dates).get(Calendar.MONTH);
		int dia = ((Calendar) dates).get(Calendar.DAY_OF_MONTH);
		String[] strDays = new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }; // Array
																														// con
																														// los
																														// dias
																														// de
																														// la
																														// semana
		System.out.println("Fecha Actual : " + dia + "/" + (mes + 1) + "/" + año + "\n\n");
		System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
		Date_PURCHASE = strDays[now.get(Calendar.DAY_OF_WEEK) - 1] + " " + dia + "/" + (mes + 1) + "/" + año;

		return Date_PURCHASE;

	}
	
	
	public static void referencia () {
	
		double cod_ref = 0;
		do {
		 cod_ref = Math.floor(Math.random()*4000);
		}while(cod_ref!=cod_ref);
		
		System.out.println("num ale : " + cod_ref);
		JOptionPane.showMessageDialog(null, "num ale : " + cod_ref);
	}
	
	


}
