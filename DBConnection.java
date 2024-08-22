
package com.mycompany.pollingsystem;
import java.sql.*;
public class DBConnection 
{
    Connection con = null;
    public Connection createCon()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is registered");

            String url = "jdbc:mysql://localhost:3306/polling_system";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password); 
            System.out.println("Database connection is created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    public void closeCon(Connection con)
    {
        try
        {
            con.close();
            System.out.println("Connection is closed.");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}


