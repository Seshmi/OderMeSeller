package seller.additem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Itemddb {
	 public static int deleteitem(Item item) throws ClassNotFoundException {
	        int result=0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection
	            .prepareStatement("delete from item where email = ? and id = ?")) {
	        	
	        	preparedStatement.setString(1, item.getemail());
	        	preparedStatement.setInt(2, item.getid());
	            
	        	//System.out.print(userlog.getemail());
	        	//System.out.print(userlog.getPassword());
	            
	            result = preparedStatement.executeUpdate();
	            
	        } catch (Exception e) {
	            // process sql exception
	            System.out.print(e);
	        }
	        return result;
	    }
}
