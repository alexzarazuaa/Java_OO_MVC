package Modules.Dummies;


import Classes.dates;
import Modules.Classes.Singleton;
import Modules.Classes.football;
import Modules.Classes.running;
import Modules.Classes.swimming;
import Modules.Classes.tennis;
import Modules.Utils.FunctionsDate;
import utils.ButtonBox;

public class MakeDummies {

	// System.out.println("entar en make dummies");

	//// SWIMMING
	private static String[] Cod_Ref = { "072", "486", "730", "005", "482" };
	private static String[] user_type = { " MEN ", " WOMEN ", " CHILDREN ", " CHILDREN ", " WOMEN " };
	private static String[] city_shop = { "AIELO ", "ONTINYENT", "XATIVA", "VALENCIA", "CARCAIXENT" }; //
	private static String[] habitual_client = { " YES ", " NO ", " YES ", " NO ", " YES " };
	private static String[] dni = { "07261935F", "48604856Z", "73099467Q", "00000005M", "48294155C" }; // 2
	private static dates[] date_nac = { new dates(8, 8, 1987), new dates(18, 10, 1992), new dates(11, 7, 1989),
			new dates(12, 8, 1992), new dates(11, 8, 1992) };
	private static String[] swimcuit_color = { "RED ", "BLUE", "BLACK", "WHITE", "GREEN" };
	private static String[] swimcuit_size = { "XS ", "S", "M", "L", "XL" };
	//private static float[] price_s = { 72, 48, 73, 30, 48 };
	private static dates date_buy = FunctionsDate.d_Today();
	private static dates[] dateAfter = { new dates(1, 12, 2019), new dates(4, 12, 2019), new dates(30, 11, 2019),
			new dates(29, 11, 2019), new dates(5, 12, 2019) };

	//// RUNNING
	private static String[] Cod_Ref_r = { "072", "486", "730", "005", "482" };
	private static String[] user_type_r = { " MEN ", " WOMEN ", " CHILDREN ", " CHILDREN ", " WOMEN " };
	private static String[] city_shop_r = { "AIELO ", "ONTINYENT", "XATIVA", "VALENCIA", "CARCAIXENT" }; //
	private static String[] habitual_client_r = { " YES ", " NO ", " YES ", " NO ", " YES " };
	private static String[] dni_r = { "07261935F", "48604856Z", "73099467Q", "00000005M", "48294155C" }; // 2
	private static dates[] date_nac_r = { new dates(8, 8, 1987), new dates(18, 10, 1992), new dates(11, 7, 1989),
			new dates(12, 8, 1992), new dates(11, 8, 1992) };
	private static String[] tshirt = { " long sleeve ", " short sleeve ", "THERMAL", "THERMAL", " short sleeve " };
	private static String[] shorts = { "long pants ", " short pants ", " short pants ", "long pants ", "long pants " };
	// private static float [] price = { 72, 48, 73, 30, 48 };
	private static dates date_buy_r = FunctionsDate.d_Today();
	private static dates[] dateAfter_R = { new dates(1, 12, 2019), new dates(4, 12, 2019), new dates(30, 11, 2019),
			new dates(29, 11, 2019), new dates(5, 12, 2019) };
	//// FOOTBALL
	private static String[] Cod_Ref_f = { "072", "486", "730", "005", "482" };
	private static String[] user_type_f = { " MEN ", " WOMEN ", " CHILDREN ", " CHILDREN ", " WOMEN " };
	private static String[] city_shop_f = { "AIELO ", "ONTINYENT", "XATIVA", "VALENCIA", "CARCAIXENT" }; //
	private static String[] habitual_client_f = { " YES ", " NO ", " YES ", " NO ", " YES " };
	private static String[] dni_f = { "07261935F", "48604856Z", "73099467Q", "00000005M", "48294155C" }; // 2
	private static dates[] date_nac_f = { new dates(8, 8, 1987), new dates(18, 10, 1992), new dates(11, 7, 1989),
			new dates(12, 8, 1992), new dates(11, 8, 1992) };
	private static String[] football_type = { " ROOM ", " LAWN ", " ROOM ", " LAWN ", " ROOM " };
	private static String[] brand = { " NIKE ", " ADIDAS ", " PUMA ", " ADIDAS ", " PUMA " };
	private static String[] size = { "41", " 42", "43", "44", "45" };
	private static int[] quntity = { 1, 2, 3, 4, 5 };
	private static dates date_buy_f = FunctionsDate.d_Today();
	private static dates[] dateAfter_f = { new dates(1, 12, 2019), new dates(4, 12, 2019), new dates(30, 11, 2019),
			new dates(29, 11, 2019), new dates(5, 12, 2019) };
	//// TENNIS

	private static String[] Cod_Ref_t = { "072", "486", "730", "005", "482" };
	private static String[] user_type_t = { " MEN ", " WOMEN ", " CHILDREN ", " CHILDREN ", " WOMEN " };
	private static String[] city_shop_t = { "AIELO ", "ONTINYENT", "XATIVA", "VALENCIA", "CARCAIXENT" }; //
	private static String[] habitual_client_t = { " YES ", " NO ", " YES ", " NO ", " YES " };
	private static String[] dni_t = { "07261935F", "48604856Z", "73099467Q", "00000005M", "48294155C" }; // 2
	private static dates[] date_nac_t = { new dates(8, 8, 1987), new dates(18, 10, 1992), new dates(11, 7, 1989),
			new dates(12, 8, 1992), new dates(11, 8, 1992) };
	private static String[] c_accessories = { "Tennis Racquets ", " Wristbands ", " Tennis Balls", "Tennis Racquets ",
			" Tennis Balls" };
	private static dates date_buy_t = FunctionsDate.d_Today();
	private static dates[] dateAfter_t = { new dates(1, 12, 2019), new dates(4, 12, 2019), new dates(30, 11, 2019),
			new dates(29, 11, 2019), new dates(5, 12, 2019) };

	/// CARREGAR DUMMIES

	public static void charge_data() {
		System.out.println("entar en cargar datos");
		
		int proof = 0;

		proof = ButtonBox.continueButton();
		if (proof == 1) {
			charge_data();
		}
	}

	public static void charge_dummies(int Cant_Dummies) {
		System.out.println("entar en cargar dummies");
		swimming object = null;
		running running1 = null;
		football football1 = null;
		tennis tennis1 = null;
		
		Singleton.a_swimming.clear();
		Singleton.a_football.clear();
		Singleton.a_running.clear();
		Singleton.a_tennis.clear();
		
		///// SWIMMINGS
		for (int i = 0; i < Cant_Dummies; i++) {
			object = new swimming(Cod_Ref[i], user_type[i], city_shop[i], habitual_client[i], dni[i], date_nac[i],
					swimcuit_color[i], swimcuit_size[i], date_buy, dateAfter[i]);
			System.out.println("object con dummies : " + object);
			Singleton.a_swimming.add(object);
			System.out.println("array con dummies : " + Singleton.a_swimming);

		}
		//// RUNNING
		for (int i = 0; i < Cant_Dummies; i++) {
			running1 = new running(Cod_Ref_r[i], user_type_r[i], city_shop_r[i], habitual_client_r[i], dni_r[i],
					date_nac_r[i], tshirt[i], shorts[i], date_buy_r, dateAfter_R[i]);
			System.out.println("object con dummies : " + running1);
			Singleton.a_running.add(running1);
			System.out.println("array con dummies : " + Singleton.a_running);
		}
		// FOOTBALL
		for (int i = 0; i < Cant_Dummies; i++) {
			football1 = new football(Cod_Ref_f[i], user_type_f[i], city_shop_f[i], habitual_client_f[i], dni_f[i],
					date_nac_f[i], football_type[i], brand[i], size[i], quntity[i], date_buy_f, dateAfter_f[i]);
			Singleton.a_football.add(football1);
			System.out.println("array con dummies : " + Singleton.a_football);
		}
		/// TENNIS
		for (int i = 0; i < Cant_Dummies; i++) {
			tennis1 = new tennis(Cod_Ref_t[i], user_type_t[i], city_shop_t[i], habitual_client_t[i], dni_t[i],
					date_nac_t[i], c_accessories[i], date_buy_t, dateAfter_t[i]);
			Singleton.a_tennis.add(tennis1);
			System.out.println("array con dummies : " + Singleton.a_tennis);
		}

	}

}
