package utils;

import javax.swing.JOptionPane;
import Modules.Utils.FunctionsDate;

public class Validates_Data {

	//// PEDIR EL NOMBRE DE LA CIUDAD

	public static String pidecity() {
		boolean res = false;
		String city_shop = "";

		do {
			city_shop = Strings.inputString(" Which city :", " CITY ");
			res = FunctionsDate.v_city(city_shop);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde CITY Name ", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				System.out.println("si que pasa la validacion");
				res = true;
			}
		} while (res == false);
		return city_shop;
	}

	///// PEDIR EL COLOR DEL BAÑADOR

	public static String swimciut_color() {
		boolean res = false;
		String swimciut_color = "";

		do {
			swimciut_color = Strings.inputString("ENTER THE COLOR THAT YOU WANT IT FOR YOUR SWIMCUIT  :", " COLOR ");
			res = FunctionsDate.V_swimcuit_color(swimciut_color);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde Color ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return swimciut_color;
	}

	/////// VALIDAR EL TIPO DE FUTBOL , SI ES FUTBOL SALA O FUTBOL EN CESPED

	public static String football_type() {
		boolean res = false;
		String football_type = "";

		do {
			football_type = Strings.inputString("WHAT TYPE FOOTBALL ROOM OR LAWN", " FOOTBALL TYPE :  ");
			res = FunctionsDate.V_football_type(football_type);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde FOOTBALL TYPE  ", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return football_type;
	}

	//////////////// VALIDAR UN DNI

	public static String pidedni() {
		boolean resultado = false;
		String dni = "";

		do {
			dni = Strings.inputString("Can you enter your dni ? \n you must entered 8 numbers+capital letter ",
					"The dni");
			resultado = FunctionsDate.v_dni(dni);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalid dni", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return dni;
	}

	/////// VALIDAR LA TALLA DE LES BOTES / SABATES DE FUTBOL

	public static String size() {
		boolean res = false;
		String size = "";

		do {
			size = Strings.inputString("WHICH SIZE DE YOU USE ? ", " SIZE ");
			res = FunctionsDate.V_size(size);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde size ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return size;
	}

	/////////////////////////////////////////////////

	////////////////////////////

	public static String referencia(String message, String title) {
		String Cod_Ref = "";
		boolean res = false;

		do {
			Cod_Ref = Strings.inputString("INPUT THE REFERENCE CODE", "REFERENCE CODE");
			res = FunctionsDate.v_CodRef(Cod_Ref);
			if (res == false) {
				System.out.println("VULVE A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "ERROR REFERENCE CODE", "ERROR CODE", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);

		return Cod_Ref; // NUMERO ALEATORIO DEL CODIGO DE REFERENCIA

	}

	public static String NickName() {
		boolean res = false;
		String NickName = "";

		do {
			NickName =Strings.inputString("Input your NickName", "NickName");
			res = FunctionsDate.v_nickname(NickName);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde NickName ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return NickName;

	}

	public static String password() {
		
		boolean res = false;
		String password = "";
		do {
			password =Strings.inputString("Password", "Password");
			res = FunctionsDate.v_password(password);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde PASSWORD ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return password;

	}

	public static String mail() {
		boolean res = false;
		String mail = "";
		do {
			mail =Strings.inputString("Input yor mail", "MAIL");
			res = FunctionsDate.v_mail(mail);
			System.out.println(res);
			if (res == false) {
				System.out.println("VOLVER A INTRODUCIR");
				JOptionPane.showMessageDialog(null, "You entered a invalde mail ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
				System.out.println("si que pasa la validacion");
			}
		} while (res == false);
		return mail;

	}

}
