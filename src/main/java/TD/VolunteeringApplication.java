package TD;

import java.net.MalformedURLException;
import javax.xml.ws.Endpoint;

public class VolunteeringApplication {
    public static String host = "localhost";
    public static short port = 8089;

    public void demarrerService() {
        String url="http://"+host+":"+port+"/";
        Endpoint.publish(url, new UserService());
    }

    public static void main(String [] args) throws MalformedURLException {
        new VolunteeringApplication().demarrerService();
        System.out.println("Service a démarré");
    }

}