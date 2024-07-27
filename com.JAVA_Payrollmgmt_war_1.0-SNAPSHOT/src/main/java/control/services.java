/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.*;
import java.time.*;
/**
 *
 * @author 91744
 */
public class services {
    public static String user;
    public static String pass;
    public static Date d;
    public static int x;
    static int find(Date first_date, Date second_date) {     
        Period difference = Period.between(Instant.ofEpochMilli(first_date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate(), Instant.ofEpochMilli(second_date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate());     
        //return difference.getDays(); 
        return difference.getDays();
        
    }
    public static void main(String[] args) {
        System.out.println(services.find(new Date(),new Date(2023,9,29)));
        
        
    }
}
