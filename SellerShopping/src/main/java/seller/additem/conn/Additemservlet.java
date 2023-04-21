package seller.additem.conn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import seller.additem.Item;

@MultipartConfig
@WebServlet("/additempage")
public class Additemservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Itemdb itemdb;

    
    public void init() {
    	itemdb = new Itemdb();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String itemname = request.getParameter("itemname");
        String itemcategory = request.getParameter("itemcategory");
        String itemprice = request.getParameter("itemprice");
        String itemquantity = request.getParameter("itemquantity");
        String shopemail = request.getParameter("shopemail");
        
        //Image Uploading Attribute
        Part file=request.getPart("pic");
        String imageFilename=file.getSubmittedFileName();
        
        Item item = new Item();
        item.setname(itemname);
        item.setcategory(itemcategory);
        item.setitemprice(itemprice);
        item.setquantity(itemquantity);
        item.setpic(imageFilename);
        item.setemail(shopemail);
        
        
        //System.out.print("This file is "+imageFilename);
        
        //image upload patch
        String uploadpic ="C:/Users/HP/Desktop/Project OOP/SellerShopping/src/main/webapp/images/"+imageFilename;
       
        try {
	        FileOutputStream FOS = new FileOutputStream(uploadpic); 
	        InputStream IS= file.getInputStream();
	        byte[] data = new byte[IS.available()];
	        
	        IS.read(data);
	        FOS.write(data);
	        FOS.close();
        } catch(Exception e) {
        	e.printStackTrace();
        }
       
        try {
        	itemdb.additem(item);
        	response.sendRedirect("Thankyou.jsp");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}