package server;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Helpful methods
 * @author William Falcon
 *
 */
public abstract class HelperMethods {

	//Private attributes
	private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

	/**
	 * Get current now time
	 * @return time now
	 */
	public static String now() {

		//Get now
		Calendar cal = Calendar.getInstance();

		//Format
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);

		//Return
		return sdf.format(cal.getTime());
	}
}
