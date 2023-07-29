/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegisterAuthenticatorR;

/**
 *
 * @author LENOVO
 */
public class RegisterCheckerR extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("register.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
              

        UserDTO dto = new UserDTO();
        dto.setName(name);
        dto.setContact(contact);
        dto.setEmail(email);
        dto.setPassword(password);

        RegisterAuthenticatorR r1 = new RegisterAuthenticatorR();
        boolean reg = r1.isRegisterT(dto);

        if (reg) 
        {
            response.sendRedirect("login.jsp");
        }
        else 
        {
            response.sendRedirect("register.jsp");

        }
    }
}
