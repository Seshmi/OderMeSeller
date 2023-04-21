package seller.login.conn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import seller.login.Userlog;
import seller.login.Userpasschadb;

@WebServlet("/UserpassServlet")
public class UserpassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String password = request.getParameter("pass");
        String email = request.getParameter("email");
        		
        		
        //userpasschadb.update(password);
        Userlog userlog = new Userlog();
        userlog.setPassword(password);
        userlog.setemail(email);
        int a = 0;
		
        try {
			a = Userpasschadb.update(userlog);
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        
        if (a==1) {
			response.sendRedirect("profile.jsp");
		    
		} else {
		   //response.sendRedirect("login.jsp");
		}
    }

}
