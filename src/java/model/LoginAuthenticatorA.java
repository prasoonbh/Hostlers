/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DB.DBConnectorHostler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class LoginAuthenticatorA
{
     public boolean isLogin(String name, String password) 
    {
        String tablePassword = "";
        try 
        {
            Statement st = DBConnectorHostler.getStatement();
            String query = "SELECT password FROM renter WHERE name='"+name+"'";
            
            System.out.println("query from renter login auth = " + query);
            
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next())
            {
                tablePassword = rs.getString(1);
                System.out.println(tablePassword);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        if (name != null && password != null && password.equals(tablePassword)) 
        {
            
            return true;
        }

        return false;
    }
}
