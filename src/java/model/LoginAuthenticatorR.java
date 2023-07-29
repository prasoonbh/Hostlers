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
public class LoginAuthenticatorR 
{
     public boolean isLogin(String name, String password) {
        String tablePassword = "";

        try {
            Statement st = DBConnectorHostler.getStatement();
            String query = "SELECT password FROM rental WHERE name='"+name+"'";
            System.out.println("query from login authenticator rental= " + query);

            ResultSet rs = st.executeQuery(query);
            if (rs.next())
            {
                tablePassword = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        if (name != null && password != null && password.equals(tablePassword)) {
            return true;
        }
        return false;

    }

}
