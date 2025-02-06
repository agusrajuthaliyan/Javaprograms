import java.net.*;
public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL u = new URL("https://rajagiri.edu");
			URLConnection uc = u.openConnection();
			
			System.out.println("URL: "+uc.getURL());
			System.out.println("URL: "+uc.getContentLength());
			System.out.println("URL: "+uc.getContentType());
			System.out.println("URL: "+uc.getAllowUserInteraction());
			System.out.println("URL: "+uc.getDoInput());
			System.out.println("URL: "+uc.getDoOutput());
			System.out.println("URL: "+uc.getLastModified());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
