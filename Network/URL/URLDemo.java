import java.net.*;
public class URLDemo {

	public static void main(String[] args) {
		try {
			URL u = new URL("http://flipkart.com/sandisk-sdcz48-128g-i35-128-gb-pen-drive/p/itmd3c263f7acb84?pid=ACCFGPHWZHE7NJVG&lid=LSTACCFGPHWZHE7NJVGVQ2I15&marketplace=FLIPKART&store=6bo%2Fjdy%2Fuar&spotlightTagId=FkPickId_6bo%2Fjdy%2Fuar&srno=b_1_3&otracker=browse&fm=organic&iid=1eb7ed76-211f-40ce-984b-543d69e2c879.ACCFGPHWZHE7NJVG.SEARCH&ppt=None&ppn=None&ssid=schqgdhb0g0000001738727376939");
			System.out.println("Protocol: "+u.getProtocol());
			System.out.println("Host: "+u.getHost());
			System.out.println("Authority: "+u.getAuthority());
			System.out.println("Default Port: "+u.getDefaultPort());
			System.out.println("Path: "+u.getPath());
			System.out.println("File: "+u.getFile());
			System.out.println("String: "+u.toString());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
