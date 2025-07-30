package la.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import la.bean.ItemBean;
import la.dao.DAOException;
import la.dao.ItemDAO;

/**
 * Servlet implementation class ItemServlet
 */
@WebServlet("/ItemServlet")
public class ItemServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
		      ItemDAO dao = new ItemDAO(); 
		      List<ItemBean> list = dao.findAll(); 
		 
		      request.setAttribute("items", list); 
		      RequestDispatcher rd = request.getRequestDispatcher("/showItem.jsp"); 
		      rd.forward(request, response); 
		 
		    } catch (DAOException e) { 
		      e.printStackTrace(); 
		      request.setAttribute("message", "内部エラーが発生しました。"); 
		      RequestDispatcher rd = request.getRequestDispatcher("/errInternal.jsp"); 
		      rd.forward(request, response); 
		    } 
		  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
