/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;
/**
 *
 * @author 91744
 */
public class Main {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.jdbc.Driver");
  
    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz", "root", "");
            Statement s = con.createStatement();
   //         s.executeUpdate("INSERT INTO user VALUES(4, 'bbb')");
   // ResultSet result=s.executeQuery("SELECT * FROM user");
    //while(result.next()) {
        //System.out.println(result.getInt(1) + " " + result.getString(2));
              s.execute("DELETE FROM user WHERE name='bbb'");

    
    con.close();
   

}

}

