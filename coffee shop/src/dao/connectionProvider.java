package dao;

import java.sql.*;


public class connectionProvider {
     public static Connection getCon(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://locahost:3306/coffee?zeroDateTimeBehavior=convertToNull","root","godpro");
             return con;
         }
         catch(Exception e){
             return null;
         }
         
    }
    
}
