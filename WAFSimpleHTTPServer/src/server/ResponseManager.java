package server;

import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

/**
 * Responsible for the different response types
 * @author waf04
 *
 */
public abstract class ResponseManager {

	/**
	 * Encodes and sends an object as JSON
	 * @param objectToEncode
	 * @param response
	 * @throws Exception
	 */
	public static void sendJSONResponse(Object objectToEncode, HttpServletResponse response) throws Exception{

		//Encode object into JSON
		String jsonString = new Gson().toJson(objectToEncode);
		byte[] utf8JsonString = jsonString.getBytes("UTF8");

		//Send JSON response
		response.setContentLength(utf8JsonString.length);
		response.setContentType("application/json"); 
		response.setStatus(HttpServletResponse.SC_OK);
		response.setHeader("last-modified:", HelperMethods.now());
		
		try {
			//Actually send the response
			response.getWriter().write(jsonString);

		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
