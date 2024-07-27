/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author 91744
 */
public class Server {
    public static void main(String[] args) {
        try{
          ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("Server Started Waiting for Client");
            
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established");
            
            
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(),true);
            Date d = new Date();
            
            outToClient.println(d.toString());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
