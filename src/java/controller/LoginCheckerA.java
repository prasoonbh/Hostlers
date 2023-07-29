/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticatorA;

/**
 *
 * @author LENOVO
 */
public class LoginCheckerA extends HttpServlet 
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.sendRedirect("login.html");
        }
        public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            
            
            LoginAuthenticatorA l1 =new LoginAuthenticatorA();
            boolean login = l1.isLogin(name,password);
            
            
            if (login)
            { 
                HttpSession session = request.getSession(true);
                session.setAttribute("name",name);
                
               response.sendRedirect("serviceProvider.jsp");
            }
            else
            {
                 response.sendRedirect("");
             }
            
        }
}
