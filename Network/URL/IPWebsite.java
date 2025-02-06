import java.net.*;

public class IPWebsite {

    public static void main(String[] args) {
        try {
            // Replace "example.com" with the desired website
            InetAddress ia = InetAddress.getByName("www.amazon.in");
            System.out.println("IP address: " + ia.getHostName());
            System.out.println("IP address: " + ia.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
