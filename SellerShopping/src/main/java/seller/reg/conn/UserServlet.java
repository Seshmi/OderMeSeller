package seller.reg.conn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import seller.reg.User;

@WebServlet("/register")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Userdb userdb;

    public void init() {
    	userdb = new Userdb();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        
        User user = new User();
        user.setname(name);;
        user.setemail(email);
        user.setPassword(password);
        user.setPhone(phone);

        try {
            userdb.registerEmployee(user);
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            response.sendRedirect("register page.jsp");
        }

        
    }
}