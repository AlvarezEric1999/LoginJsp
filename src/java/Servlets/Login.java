/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Eric Alvarez
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

   private static final String Usuario ="AlvarezEric";
   private static final String Contrasena = "1061048375";
     
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
        String InputUser = request.getParameter("usuario");
        String InputPassword = request.getParameter("contrasena");
         
        if(Usuario.equals(InputUser) && Contrasena.equals(InputPassword)){
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
           
        
        }else{
            request.getRequestDispatcher("ErrorMessaje.jsp").forward(request, response);
        }
        
       
        
    }

  
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
