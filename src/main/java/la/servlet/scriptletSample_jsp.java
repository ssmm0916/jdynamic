package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class scriptletSample_jsp extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8"); 
        HttpSession session = request.getSession(); 
        PrintWriter out = response.getWriter(); 
        out.write("<!DOCTYPE html>"); 
        out.write("<html><head><title>Scriptlet Sample</title></head><body>"); 
 
        for (int i = 0; i < 5; i++) { 
            out.write("HelloJSP<br>"); 
        } 
 
        out.write("</body></html>");
	}
}