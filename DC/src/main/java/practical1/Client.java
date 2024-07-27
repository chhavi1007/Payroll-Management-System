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
public class Client {
public static void main(String[] args) {
try {
System.out.println("Client activated!");
InetAddress localhost = InetAddress.getLocalHost(); 
int port = 3306;
String s = " ";
Socket clientSocket = new Socket(localhost, port);
BufferedReader bufferedReaderFromSystem = new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Connection with server established!");
while (true) {
System.out.println("Enter a string: ");
s = bufferedReaderFromSystem.readLine();
if (s.equalsIgnoreCase("exit")) {
break;
}
PrintWriter printWriterToServer = new
PrintWriter(clientSocket.getOutputStream(), true);
printWriterToServer.println(s);
BufferedReader bufferedReaderFromServer = new BufferedReader(new
InputStreamReader(clientSocket.getInputStream()));
System.out.println(bufferedReaderFromServer.readLine());
}
clientSocket.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}

