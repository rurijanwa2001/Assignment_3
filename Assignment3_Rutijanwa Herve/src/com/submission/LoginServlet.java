package com.submission;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println(email);
        // Validating the email and password 
        ///oolean isValidUser = validateUser(email, password);

        
        	if(email.equalsIgnoreCase("student@gmail.com") && password.equals("12345678")){
            // Create a User object if authentication is successful
            User user = new User();
            user.setEmail(email);
            

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("submission.html");
        } else {
            response.sendRedirect("index.html");
        }
    }

    // method with my actual user validation logic
    //private boolean validateUser(String email, String password) {
        // Example validation logic
        //return email.equalsIgnoreCase("student@gmail.com") && password.equals("12345678");
    //}
}
    