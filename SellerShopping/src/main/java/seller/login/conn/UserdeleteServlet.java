package seller.login.conn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import seller.login.Userdeletedb;
import seller.login.Userlog;



@WebServlet("/UserdeleteServlet")
public class UserdeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String password = request.getParameter("pass");
        String email = request.getParameter("email");
        		
        
        Userlog userlog = new Userlog();
        userlog.setPassword(password);
        userlog.setemail(email);
        int a = 0;
		
        try {
			a = Userdeletedb.delete(userlog);
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        
        if (a==1) {
			response.sendRedirect("login.jsp");
		    
		} else {
		   response.sendRedirect("deleteseller.jsp");
		}
    }
}
