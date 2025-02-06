import java.io.*;
import java.net.*;

public class TCPserver {
public static void main(String[] args) {
try {
	ServerSocket serverSocket = new ServerSocket(18345);
	System.out.println("Server is waiting for connection...");
	Socket clientSocket = serverSocket.accept();
	System.out.println("Client connected: " +
	clientSocket.getInetAddress());
	BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
	String clientMessage;
	while ((clientMessage = in.readLine()) != null) {
		System.out.println("Received from client: " + clientMessage);
		// Send a response back to the client
		String response = "Server received: " + clientMessage;
		out.writeBytes(response + "\n"); // send response as bytes with newline
		// If the client sends "exit", break out of the loop and close the		connection
		if ("exit".equals(clientMessage))
			{ System.out.println("Connection closing..."); break; }
		}
	} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

