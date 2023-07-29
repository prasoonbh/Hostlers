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
import model.RegisterAuthenticatorA;

/**
 *
 * @author LENOVO
 */
public class RegisterCheckerA extends HttpServlet
{
     @Override
    public void doGet (HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException 
    {
       response.sendRedirect("register1.html");
    }
     public void doPost (HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException 
    { 
       String hostelname =  request.getParameter("hostelname");
       String name = request.getParameter("name");
       String contact=request.getParameter("contact");
       String hosteladdress = request.getParameter("hosteladdress");
       String email=request.getParameter("email");
       String charges = request.getParameter("charges");       
       String furnished = request.getParameter("furnished");
       String convencefacility = request.getParameter("convencefacility");
       String medicalfacility = request.getParameter("medicalfacility");
       String bankingfacility = request.getParameter("bankingfacility");
       String messfacility = request.getParameter("messfacility");
       String Pincode=request.getParameter("Pincode");
       String Password=request.getParameter("Password");
       
        UserDTO dto= new UserDTO();
       dto.setHostelname(hostelname);
        dto.setName(name);
        dto.setContact(contact);
        dto.setHosteladdress(hosteladdress);
        dto.setEmail(email);
        dto.setCharges(charges);
        dto.setFurnished(furnished);
        dto.setConvencefacility(convencefacility);
        dto.setMedicalfacility(medicalfacility);
        dto.setBankingfacility(bankingfacility);
        dto.setMessfacility(messfacility);
        dto.setPincode(Pincode);
        dto.setPassword(Password);
        
        RegisterAuthenticatorA r1 = new RegisterAuthenticatorA();
        boolean reg = r1.isRegister(dto);        
       if (reg)
       {
           response.sendRedirect("serviceLogin.jsp");
       }
       else
       {
        response.sendRedirect("service.jsp");
               
       }
       
       
    }
   
}
