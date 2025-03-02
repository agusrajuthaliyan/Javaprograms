import java.net.*;
import java.io.*;

public class SockServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(123);
			System.out.println("Server Ready !!!");
			Socket s = ss.accept();
			System.out.println("Connection is Live!");
			ObjectInputStream ins = new ObjectInputStream(s.getInputStream());
			String str = (String) ins.readUTF();
			int i = Integer.parseInt(str);
			System.out.println("Message sent is: " +(i+1));
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
