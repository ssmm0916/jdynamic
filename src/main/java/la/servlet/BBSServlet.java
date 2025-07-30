package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/BBSServlet")
public class BBSServlet extends HttpServlet {
	
	private List<String> messages = new ArrayList<>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); 
        response.setContentType("text/html; charset=UTF-8"); 
 
        String message = request.getParameter("message"); 
        if (message != null && !message.isEmpty()) { 
            messages.add(message); 
        } 
 
        PrintWriter out = response.getWriter(); 
        out.println("<html><body>"); 
        out.println("<h2>掲示板の投稿一覧</h2>"); 
        for (String msg : messages) { 
            out.println("<p>" + msg + "</p>"); 
        } 
        out.println("</body></html>");
	}

}
