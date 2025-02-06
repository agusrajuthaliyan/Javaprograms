import java.net.*;

public class InetDemo {

    public static void main(String[] args) {
        try {
            // Replace "example.com" with the desired website
            InetAddress ia = InetAddress.getByName("www.amazon.in");
            System.out.println("IP address: " + ia.getHostName());
            System.out.println("IP address: " + ia.getHostAddress());
            
            InetAddress my =InetAddress.getLocalHost();
            System.out.println("My HostName: "+my.getHostName());
            System.out.println("My HostName: "+my.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
