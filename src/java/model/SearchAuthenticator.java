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
public class SearchAuthenticator
{
    public boolean isSearching(String pincode)       
       {    
           String tablepincode="";
           try
           {
             Statement st = DBConnectorHostler.getStatement();
                                      
             String query="SELECT pincode FROM renter WHERE pincode = '"+pincode+"'";
             System.out.println(query +" from search authenticator");
             ResultSet rs=  st.executeQuery(query);
             
             if(rs.next())
             {  
                   tablepincode=rs.getString(1);
             }
           }
           catch(SQLException e)
           {
               System.out.println(e);
           }        
           if(!pincode.equals("") && pincode.equals(tablepincode))
           {
               return true;
           }
           return false;
              
       }
}
