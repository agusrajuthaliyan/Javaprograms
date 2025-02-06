package HelloALan;

import java.net.*;
import java.io.*;

public class SockClient {

	public static void main(String[] args) {
		try {
	
			Socket s = new Socket("localhost",12345);
			System.out.println("Sending a request to a server!");
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Send a Message to the server!!");
			String str = dis.readLine();
			out.writeUTF(str);
			out.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
