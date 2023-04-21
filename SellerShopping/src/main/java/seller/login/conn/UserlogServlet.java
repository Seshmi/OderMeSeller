package seller.login.conn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import seller.login.Userlog;

@WebServlet("/loginservlet")
public class UserlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    	String username = request.getParameter("user");
        String password = request.getParameter("pass");
        
        Userlogdb userlogdb;
        userlogdb = new Userlogdb();
        Userlog userlog = new Userlog();
        userlog.setemail(username);
        userlog.setPassword(password);
        
        try {
            if (userlogdb.validate(userlog)) {
                HttpSession session = request.getSession();
                 session.setAttribute("username",username);
                 
                response.sendRedirect("sellerhome.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
