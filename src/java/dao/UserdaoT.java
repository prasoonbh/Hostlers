/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DB.DBConnectorHostler;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class UserdaoT
{
     public UserDTO getUserData(String name)
    {
        UserDTO user = new UserDTO();
        try
        {
            
            Statement st = DBConnectorHostler.getStatement(); 
            String query="SELECT name AND contact AND email FROM renter WHERE name='"+name+"'";
            System.out.println("Query from userdaoT" + query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                user.setName(rs.getString(1));
               
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return user;
    }
    /*public List<UserDTO> getAllUserData()
    {
        List<UserDTO>listOfUsers= new ArrayList<UserDTO>();
        try
        {
            
            Statement st = DBConnector.getStatement(); 
            String query="SELECT * FROM emp ";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                UserDTO user = new UserDTO();
                user.setName(rs.getString(1));
                
                listOfUsers.add(user);
            }    
                
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return listOfUsers;
    }*/
}
