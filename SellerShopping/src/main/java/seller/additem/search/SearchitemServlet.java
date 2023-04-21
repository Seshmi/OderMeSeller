package seller.additem.search;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchitemServlet")
public class SearchitemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			String itemn=request.getParameter("itemname");
			String itemname=itemn.toUpperCase();
			
			//System.out.print(itemname);
			
			
		Searchitemdb searchitem =new Searchitemdb();
		ArrayList<Searchitems> item = searchitem.getitemdetails(itemname);
		
		request.setAttribute("item", item);
		
		//System.out.print(list.get(0));
		//System.out.print(list.get(1));
		
		RequestDispatcher dis = request.getRequestDispatcher("searchitem.jsp");
		dis.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
