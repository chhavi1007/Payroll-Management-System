/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical6;

/**
 *
 * @author 91744
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;
public class Server implements Runnable {
// List of clients
private ArrayList<HandleConnection> clientList;
private ServerSocket serverSocket;
private boolean flag;
private ExecutorService threadPool;
public Server() {
clientList = new ArrayList<HandleConnection>();
flag = false;
//date = new Date();
System.out.println("Server Running...\nWaiting for clients.");
}
//End Server Connection
public void endConnection() {
try {
flag = true;
threadPool.shutdown();
if (!serverSocket.isClosed()) {
serverSocket.close();
}
for (HandleConnection hc : clientList) {
hc.endClietConnection();
}
System.exit(0);
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
//Broadcast message to all clients
public void broadcastMessage(String message) {
for (HandleConnection hc : clientList) {
hc.message(message);
}
}
@Override
public void run() {
// throw new UnsupportedOperationException("Not supported yet."); //
//Generated from
nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
try {
serverSocket = new ServerSocket(3307);
threadPool = Executors.newCachedThreadPool();
while (!flag) {
Socket clientSocket = serverSocket.accept(); 
HandleConnection clientConnection = new
HandleConnection(clientSocket);
clientList.add(clientConnection);
threadPool.execute(clientConnection);
}
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
// Class to handle client connections
class HandleConnection implements Runnable {
private Socket clientSocket;
private BufferedReader inFromClient;
private PrintWriter outToClient;
private String clientName;
public HandleConnection(Socket clientSocket) {
this.clientSocket = clientSocket;
}
@Override
public void run() {
try {
outToClient = new PrintWriter(clientSocket.getOutputStream(), true);
inFromClient = new BufferedReader(new
InputStreamReader(clientSocket.getInputStream())); 
outToClient.println("Welcome! \nEnter name: ");
clientName = inFromClient.readLine();
//Add info to log
System.out.println(new Date() + "\n" + clientName + " connected.");
//Broadcast connection of client
broadcastMessage(clientName + " joined.");
//Chat in process
String clientMessage;
while ((clientMessage = inFromClient.readLine()) != null) {
if (clientMessage.startsWith("/end")) {
broadcastMessage(clientName + " left.");
endClietConnection();
if (clientList.isEmpty()) {
endConnection();
}
//Add info to log
System.out.println(new Date() + "\n"+ clientName + " disconnected.");
}
else {
broadcastMessage(clientName + ": "+clientMessage);
}
}
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
// Send message to client
public void message(String message) {
outToClient.println(message);
}
//End client connection
public void endClietConnection() {
try {
clientSocket.close();
inFromClient.close(); 
outToClient.close();
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
}
//Main method
public static void main(String[] args) {
Server server = new Server();
server.run();
}
}
