package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.Connector;

/**
 * Creates a multi-threaded Jetty server
 * @author William Falcon
 * Public license
 *
 */
public class ServerMain {

	//Private variables
	private static int httpPort = 1234;
	//private static int httpsPort = 8000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			//New Jetty server
			Server server = new Server();
			
			//Link http port
			SelectChannelConnector httpConnector = new SelectChannelConnector();
			httpConnector.setPort(httpPort);
			
			//Add all connectors to server
			server.setConnectors(new Connector[]{httpConnector});
			
			//Add handlers
			server.setHandler(new HttpRequestHandler());
			
			//Start and join server
			server.start();
			server.join();
			
			System.out.println("\nWAF base TCP/HTTP Server waiting for client on port " + httpPort);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
