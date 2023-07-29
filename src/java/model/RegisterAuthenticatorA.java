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
public class RegisterAuthenticatorA 
{
 public boolean isRegister (UserDTO dto)
    {  
        String tablePassword="";
        String hostelname = dto.getHostelname();
        String name = dto.getName();
        String contact=dto.getContact();
        String hosteladdress = dto.getHosteladdress();
        String email=dto.getEmail();
        String charges = dto.getCharges();
        String furnished=dto.getFurnished();
        String convencefacility = dto.getConvencefacility();
        String medicalfacility = dto.getMedicalfacility();
        String bankingfacility = dto.getBankingfacility();
        String messfacility = dto.getMessfacility();
        String pincode = dto.getPincode();
        String password = dto.getPassword();
        
        try
        {
         Statement st = DBConnectorHostler.getStatement();
          String query = "Insert into renter values('"+hostelname+"','"+name+"','"+contact+"','"+hosteladdress+"','"+email+"','"+charges+"','"+furnished+"','"+convencefacility+"','"+medicalfacility+"','"+bankingfacility+"','"+messfacility+"','"+pincode+"','"+password+"')";
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
       if ( hostelname!=null && name != null && contact!=null && hosteladdress!=null && email!=null && charges!=null&& medicalfacility!=null && bankingfacility!=null  && messfacility!=null && furnished!=null  && convencefacility!=null &&  pincode!=null && !name.equalsIgnoreCase("") && password.equals(tablePassword) )
       {
           return true;
       }
       return false;
    }

    

       
}
