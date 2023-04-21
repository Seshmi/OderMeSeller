package seller.additem.conn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import seller.additem.Item;
import seller.additem.Itemddb;


@WebServlet("/DeleteitemServlet")
public class DeleteitemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String itemi = request.getParameter("itemid");
        String email = request.getParameter("email");
        
        int itemname=Integer.parseInt(itemi);  
        
        Item item = new Item();
        item.setid(itemname);;
        item.setemail(email);
        int a = 0;
		
        try {
			a = Itemddb.deleteitem(item);
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        
        if (a==1) {
			response.sendRedirect("my items.jsp");
		    
		} else {
		   response.sendRedirect("deleteitem.jsp");
		}
	}

}
