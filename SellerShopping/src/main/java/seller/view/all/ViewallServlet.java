package seller.view.all;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import seller.additem.search.Searchitems;

@WebServlet("/ViewallServlet")
public class ViewallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String itemname=request.getParameter("shopemail");
			//String itemname=itemn.toUpperCase();
			
			//System.out.print(itemname);
			
			
		Viewalldb viewitem =new Viewalldb();
		ArrayList<Searchitems> item = viewitem.getitemdetails(itemname);
		
		request.setAttribute("item", item);
		
		//System.out.print(list.get(0));
		//System.out.print(list.get(1));
		
		RequestDispatcher dis = request.getRequestDispatcher("my item view.jsp");
		dis.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
