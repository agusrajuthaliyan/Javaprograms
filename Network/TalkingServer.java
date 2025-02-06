package HelloALan;

import java.net.*;
import java.io.*;

public class TalkingServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(12);
			System.out.println("Server Ready !!!");
			Socket s = ss.accept();
			System.out.println("Connection is Live!");
			ObjectInputStream ins = new ObjectInputStream(s.getInputStream());
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(System.in);
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
