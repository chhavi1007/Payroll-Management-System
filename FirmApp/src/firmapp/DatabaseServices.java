/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firmapp;

import java.sql.*;
/**
 *
 * @author 91744
 */
public class DatabaseServices {
    
    
    public static String queryMaker(String user,String pass){
        return "select * from mno where name='"+user+"' and pass='"+pass+"'";
    }
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firm","root","");
            Statement st=con.createStatement();
            
            //String query=
            /*
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getInt("id") +"  "+ rs.getString(2));
            }
              */  
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
    

