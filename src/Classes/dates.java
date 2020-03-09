package Classes;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class dates  {

	private int day, day_e;
	private int month, month_e;
	private int year, year_e;
	private LocalDate date, date_e = null;
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public dates(String date) { // CONSTRUCTOR DE LA FECHA
		String DMY[] = date.split("/");
		this.day = Integer.parseInt(DMY[0]);
		this.month = Integer.parseInt(DMY[1]);
		this.year = Integer.parseInt(DMY[2]);
		this.date = LocalDate.of(year, month, day);

	}

	public dates (int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		this.date=LocalDate.of(year, month, day);
		
	}

	private void Entr_date(String date_e) {

		String DMY[] = date_e.split("/");
		this.day_e = Integer.parseInt(DMY[0]);
		this.month_e = Integer.parseInt(DMY[1]);
		this.year_e = Integer.parseInt(DMY[2]);

		this.date_e = LocalDate.of(year_e, month_e, day_e);

	}

	public dates format_copy () {
		setFormat();
		return new dates(formatter.format(date));
	}
	//// GETTERS

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDaysInterval(String date_e) { // INTERVALO ENTRE DOS FECHAS
		Entr_date(date_e);
		return (int) ChronoUnit.DAYS.between(this.date, this.date_e);
		
	}

	/// SETTERS

	public void setDay(int day) {
		this.day = day;

	}

	public void setMonth(int month) {
		this.month = month;

	}

	public void setYear(int year) {
		this.year = year;

	}
	public void setFormat() {
		this.format = new SimpleDateFormat("dd/MM/yyyy");
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}
	
	public void setToday() { // FECHA --> HOY
		this.date = LocalDate.now();
	}

	/// TO STRING
	public String toString() {
		return formatter.format(date);
	}

	public boolean AfterToday() { // TRUE SI LA FECHA PASA HOY
		return this.date.isAfter(LocalDate.now());

	}

	public boolean Today() { //// COMPRUEBA QUE ES HOY
		if (ChronoUnit.DAYS.between(this.date, LocalDate.now()) == 0)
			return true;
		else
			return false;

	}

	public boolean leapYear() { // COMPRUEBA AÑO BISIESTO
		if ((date.getYear() % 4) == 0 && (date.getYear() % 100) != 0 || (date.getYear() % 400) == 0) {
			this.day = 29;
			return true;
		} else {
			return false;
		}

	}

	public boolean plusmonth() {
		if (this.day > date.getDayOfMonth()) { // SI EL DIA SUPERA EL MÁXIMO DEL MES
			System.out.println("incorrect day");
		}
		return false;

	}
	

	public void addDays(int days) { // SUMAR x DÍAS
		this.date = this.date.plusDays(days);
	}
	
//	public class OrderDate_Delivery implements Comparator<sports> {
//
//		
//		public int compare(sports o1, sports o2) {
//			return o1.getdateAfter().getDaysInterval(o2.getdateAfter().toString());
//		}
//	
//
//	}


}
