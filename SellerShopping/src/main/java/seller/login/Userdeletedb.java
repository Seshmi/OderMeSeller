package seller.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Userdeletedb {

    public static int delete(Userlog userlog) throws ClassNotFoundException {
        int result=0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("delete from seller where email = ? and password = ?")) {
        	
        	preparedStatement.setString(1, userlog.getemail());
        	preparedStatement.setString(2, userlog.getPassword());
            
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