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
import model.SearchAuthenticator;

/**
 *
 * @author LENOVO
 */
public class SearchChecker extends HttpServlet 
{
public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException
    {
     response.sendRedirect("Search.jsp");        
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException
    {
          String pincode = request.getParameter("pincode");
          
          
          SearchAuthenticator st = new SearchAuthenticator();
          boolean search = st.isSearching( pincode);
          
          if(search)
          {
              HttpSession session= request.getSession(true);
              session.setAttribute("pincode",pincode);
              
             response.sendRedirect("login.jsp");
              
          }
          else
          {
              response.sendRedirect("Searchhostel.jsp");
          }
    }
}
