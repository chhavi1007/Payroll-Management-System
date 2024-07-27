/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author 91744
 */
public class Client {
    public static void main(String[] args) {
        try{
          int port=9999;
          InetAddress localhost= InetAddress.getLocalHost();
          
          Socket clientSocket = new Socket(localhost,port);
            System.out.println("COnnection with Server established");
        
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            String s = inFromServer.readLine();
            System.out.println("Message from Server" +s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
