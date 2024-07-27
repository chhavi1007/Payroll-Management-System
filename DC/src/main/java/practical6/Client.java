/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author 91744
 */


public class Client implements Runnable {
private Socket clientSocket;
private BufferedReader inFromServer;
private PrintWriter outToServer;
private boolean flag;
@Override
public void run() {
// throw new UnsupportedOperationException("Not supported yet."); //
//Generated from
nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
try {
InetAddress localhost = InetAddress.getLocalHost(); 
clientSocket = new Socket(localhost, 3307);
inFromServer = new BufferedReader(new
InputStreamReader(clientSocket.getInputStream()));
outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
//Create thread for client
MessageHandler mh = new MessageHandler();
Thread t1 = new Thread(mh);
t1.start();
String message;
while ((message = inFromServer.readLine()) != null) {
outToServer.println(message);
}
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
public void endConnection() {
flag = true;
try {
inFromServer.close();
outToServer.close();
clientSocket.close();
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
class MessageHandler implements Runnable {
@Override
public void run() {
try {
BufferedReader systemReader = new BufferedReader(new
InputStreamReader(System.in));
//Process input
while (!flag) {
String message = systemReader.readLine();
if (message.equalsIgnoreCase("/end")) {
outToServer.println(message);
systemReader.close();
endConnection();
}
else {
outToServer.println(message);
}
}
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
}
public static void main(String[] args) {
Client client = new Client();
client.run();
}
}

