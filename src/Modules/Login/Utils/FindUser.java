package Modules.Login.Utils;



import Modules.Login.Classes.SingletonLogin;
import Modules.Login.Classes.User;



public class FindUser {
	

	///////////////////////////////////////////////////////////
	
	public static int find_user(User user) {
		System.out.println(user);
		for (int i = 0; i <= (SingletonLogin.user.size()-1); i++) {
			if (SingletonLogin.user.get(i).equals(user)) {
				System.out.println(" dentro del find" +i);
				return i;
				
			}
		}
		System.out.println("FIND CLAU " + user.getNickName());
		return -1;
	}



	
}
