package utils;

import javax.swing.JOptionPane;

public class valida_char {
	
	public static char charvalide (String text, String title) {
		char let = 0;
		boolean correct = false;
		String value = "";
		do{
			try{
				value=JOptionPane.showInputDialog(null,text,title,JOptionPane.QUESTION_MESSAGE);
				System.out.println("User write: " + value);
				if(value==null){
					JOptionPane.showMessageDialog(null, "out of the program","program out",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					let=value.charAt(0);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Write a charapter pls", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		return let;
	}

}
