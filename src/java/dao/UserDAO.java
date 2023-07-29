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
public class UserDAO 
{
     public UserDTO getUserData(String pincode)
    {
        
        UserDTO user = new UserDTO();
        try 
        {
            Statement st = DBConnectorHostler.getStatement();
           
            String query = "SELECT * FROM renter WHERE pincode = ' "+pincode+"'";
            System.out.println("suserdao getuserdata"+query );
            
             
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) 
            {
                user.setHostelname(rs.getString(1));
                user.setName(rs.getString(2));
                user.setContact(rs.getString(3));
                user.setHosteladdress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setCharges(rs.getString(6));
                user.setFurnished(rs.getString(7));
                user.setConvencefacility(rs.getString(8));
                user.setMessfacility(rs.getString(9));
                user.setBankingfacility(rs.getString(10));
                user.setPincode(rs.getString(11));
            }
        }
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        return user;
    }

    public List<UserDTO> getAllUserData(String pincode)
    {
        
        List<UserDTO> listOfUsers = new ArrayList<UserDTO>();

        try   
        {
            Statement st = DBConnectorHostler.getStatement();
            String query = "SELECT * FROM renter WHERE pincode ='"+pincode+"'";
            System.out.println("this is from userdao getalluserdata"+query);

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) 
            {

                UserDTO user = new UserDTO();
                user.setHostelname(rs.getString(1));
                user.setName(rs.getString(2));
                user.setContact(rs.getString(3));
                user.setHosteladdress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setCharges(rs.getString(6));
                user.setFurnished(rs.getString(7));
                user.setConvencefacility(rs.getString(8));
                user.setMessfacility(rs.getString(9));
                user.setBankingfacility(rs.getString(10));
                user.setPincode(rs.getString(11));
               
                listOfUsers.add(user);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return listOfUsers;
    }
}
