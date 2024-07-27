/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import control.CheckLogin;
import control.EditUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 *
 * @author 91744
 */
public class TotalPay {
    public static int totalPay=0;
    public static int getPay(Connection con,int id) throws SQLException{
       // if(totalPay==0){
            PreparedStatement preparedStatement = con.prepareStatement("Select * from employee where Id="+id);
            ResultSet rs=preparedStatement.executeQuery();
            if(rs.next()){
                java.util.Date m=rs.getDate(4);
                LocalDate l = Instant.ofEpochMilli(m.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate d = LocalDate.now();
            Period p=Period.between(l, d);
            int y=p.getYears();
            int c=p.getMonths();
            int k=p.getDays();
            int b=rs.getInt(5);
              //  System.out.println("Years"+ y + "Months" + c +"Days"+k);
              totalPay=(((y* 365) * b) + ((c* 30)*b) + (k*b));
     //   }
        }
        return totalPay;
    }
}