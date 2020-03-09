package utils;

import javax.swing.JOptionPane;

public class Operations {

	////////////////////////////////

	public static void sumar() {

		int num1, num2 = 0;

		// pedir numeros
		num1 = Numbers.inputNumber("Introduce el primer numero", "NUMERO 1");
		num2 = Numbers.inputNumber("Introduce el segundo numero", "NUMERO 2");
		// OPERACION

		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2), "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/////////////////////////////////////

	public static void restar() {

		int num1, num2 = 0;
		// pedir numeros
		num1 = Numbers.inputNumber("Introduce el primer numero", "NUMERO 1");
		num2 = Numbers.inputNumber("Introduce el segundo numero", "NUMERO 2");
		// OPERACION
		JOptionPane.showMessageDialog(null, num1 + "  -  " + num2 + " = " + (num1 - num2), "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}
	
	//////////////////////////////////////
	
	public static void multiplicar() {

		int num1, num2   = 0;
		int product = 1;
		// pedir numeros
		num1 = Numbers.inputNumber("Introduce el primer numero", "NUMERO 1");
		num2 = Numbers.inputNumber("Introduce el segundo numero", "NUMERO 2");
		//OPERACION
		if((num1 == 0) || (num2 == 0)){
			
			JOptionPane.showMessageDialog(null,"YOU CAN'T MULTIPLY");
			//System.out.println(num1);
		}else {
				product=num1*num2;
		}
		JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + product, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	//////////////////////////////////////////
	
	public static void dividir() {
		int num1, num2   = 0;
		int divide = 1;
		// pedir numeros
		num1 = Numbers.inputNumber("Introduce el primer numero", "NUMERO 1");
		num2 = Numbers.inputNumber("Introduce el segundo numero", "NUMERO 2");
		//OPERACION
		if((num1 == 0) || (num2 == 0)){
			
			JOptionPane.showMessageDialog(null,"YOU CAN'T DIVIDE");
		}else
				divide=(num1/num2);
	
		JOptionPane.showMessageDialog(null, num1 + "  /  " + num2 + " = " + divide, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	////////////////////////////////
	
	// EXPONENTE DE UN NUMERO
	
	public static void exponente() {
		 
		int num_base = 0 , num = 0;
		
		num_base = Numbers.inputNumber("Numero", "BASE");
		num = Numbers.inputNumber("Introduce el numero", "NUMERO ");
		
		JOptionPane.showMessageDialog(null, "El cuadrao de " + num_base + " = " + Math.pow(num_base, num)+ "\n");
	}
	
	
}// end_class
