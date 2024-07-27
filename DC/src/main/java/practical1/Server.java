/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical1;

/**
 *
 * @author 91744
 */
import java.io.*;
import java.net.*;
public class Server {
public static void main(String[] args) throws IOException {
try {
System.out.println("Server has started! \nWaiting for clients...");
ServerSocket serverSocket = new ServerSocket(3306);
Socket clientSocket = serverSocket.accept(); 
String s;
System.out.println("\nConnected to the client successfully!");
BufferedReader bufferedReaderFromClient = new BufferedReader(new
InputStreamReader(clientSocket.getInputStream()));
while (true) {
s = bufferedReaderFromClient.readLine();
if (s.equalsIgnoreCase("exit")) {
break;
}
PrintWriter printWriterToClient = new
PrintWriter(clientSocket.getOutputStream(), true);
printWriterToClient.println("Message from Server: "+s);
}
clientSocket.close();
serverSocket.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
