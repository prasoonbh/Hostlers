/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DB.DBConnectorHostler;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class RegisterAuthenticatorR
{
public boolean isRegisterT (UserDTO dto)
    {
        String tablePassword="";
        String name = dto.getName();
        String contact=dto.getContact();
        String email=dto.getEmail();
        String password = dto.getPassword();
        
        try
        {
         Statement st = DBConnectorHostler.getStatement();
          String query = "Insert into rental values('"+name+"','"+contact+"','"+email+"','"+password+"')";
            System.out.println("Query= "+query);
            
          int i = st.executeUpdate(query);
          if (i>0)
          {
              
              System.out.println(i+"Record Inserted");
              
              return true;
          }
          else
          {
              System.out.println("Record Insertion Failed...");
          }
          
        }
        catch(SQLException e)
         {
                    System.out.println(e);
          }
       if (name != null && contact!=null && email!=null && !name.equalsIgnoreCase("") && password.equals(tablePassword) )
       {
           
           return true;
       }
       return false;
    }
}
