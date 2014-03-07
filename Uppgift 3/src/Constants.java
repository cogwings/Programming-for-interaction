public class Constants {

	public static int MIN_SIZE = 8;
	public static int MAX_SIZE = 28;

	public static int MIN_PRICE = 0;
	public static int MAX_PIRCE = 30000;
	/** Defines certain colors that are allowed to be displayed */
	public static final String[] colorArray = { "blue", "red", "black", "pink" };

	/** Defines a certain color which is not allowed to be displayed */
	public static String bikeCon(String brown) {
		boolean rett = false;
		for (int i = 0; i < colorArray.length; i++) {
			if (brown.equals(colorArray[i])) {
				rett = true;
			}
		}

		if (rett == true) {
			return brown;
		}

		else {
			return "N/A";
		}
	}
}
