/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erp.p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 91744
 */
public class Demo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/xyz", user="root", password="", q="SELECT * FROM user";
        
        try {
            //1.Register Driver class
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.Get Connection
            Connection con=DriverManager.getConnection(url, user, password);
            
            //3.Statement obj
            Statement st=con.createStatement();
            
            //4.Execute Query
            
            ResultSet rs=st.executeQuery(q);
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1)+", Name="+rs.getString(2));
            }
            //5.Close Connection
            con.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }

