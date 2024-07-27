/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.erp.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;


/**
 *
 * @author 91744
 */
public class Demo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/demo", user="root", password="", q="SELECT * FROM student";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, user ,password);
            Statement st=c.createStatement();
            Statement st2=c.createStatement();
            //String q="SELECT * from student";
            String p="DELETE from student where studentid=15";
            ResultSet rs=st.executeQuery(q);
            while(rs.next()){
                System.out.println("studentid= "+rs.getString(1));
            }
            int f=st2.executeUpdate(p);
            if (f==1)
            {
                System.out.println("Successful");
            }
            else{
                System.out.println("Unsuccessful");
            }
            
            //StringBuilder sb=new StringBuilder("UPDATE student SET");
            String x = "UPDATE student SET studentname=?, department=?,year=? WHERE studentid=?";
            PreparedStatement pst=c.prepareStatement(x);
            pst.setString(1, "Harry");
            pst.setString(2, "EC");
            pst.setInt(3, 3);
            pst.setInt(4, 28);
            
            int a = pst.executeUpdate();
            if (a == 1) {
                System.out.println("U success");
            }
            //String sc = new Scanner(System.in).nextLine();
            String y="INSERT into student (studentname,department,year) values (?,?,?)";
            PreparedStatement ps=c.prepareStatement(y);
            ps.setString(1, "jeny");
            ps.setString(2, "IT");
            ps.setInt(3, 1);
            
            int t=ps.executeUpdate();
            if (t==1){
                System.out.println("INSERT SUCCESSFUL");
            }
        }
           
            
            
    }
    
                    
            
            
            
            
            
        
    

