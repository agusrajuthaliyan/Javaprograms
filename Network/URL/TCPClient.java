import java.io.*; import java.net.*;
public class TCPClient {
public static void main(String[] args) {
	try {
		// Connect to the server on localhost and port 12345
		Socket socket = new Socket("localhost", 18345);
		System.out.println("Connected to server.");
		// Create input and output streams to communicate with the server
		BufferedReader in = new BufferedReader(new
		InputStreamReader(socket.getInputStream()));
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		BufferedReader userInput = new BufferedReader(new
		InputStreamReader(System.in));
		String message; String serverResponse;
		// Continuously send messages to the server and receive responses
		while (true) {
		// Take user input for the message to send to the server
		System.out.print("Enter message to send to server: ");
		message = userInput.readLine();
		// Send the message to the server
		out.writeBytes(message + "\n"); // send the message with newline
		// Receive and display the response from the server
		serverResponse = in.readLine();
		System.out.println("Server response: " + serverResponse);
		// If user inputs "exit", terminate the communication
		if ("exit".equals(message))
		{System.out.println("Exiting..."); break; }
		}
	} catch (IOException e) {
		e.printStackTrace();
} }
}