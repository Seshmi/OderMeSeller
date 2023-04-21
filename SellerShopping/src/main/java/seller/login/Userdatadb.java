package seller.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Userdatadb {
	

    public Userlog Retrive(String username) throws ClassNotFoundException {
    	
    	Userlog userlog;
    	userlog = new Userlog ();
        Class.forName("com.mysql.jdbc.Driver");

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");
    	
    		PreparedStatement preparedStatement = connection.prepareStatement("select * from seller where email = ?")){
    		
				preparedStatement.setString(1,username);
				
				ResultSet rs= preparedStatement.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email= rs.getString("email");
					String password=rs.getString("password");
					String phone=rs.getString("phone");
					
					userlog = new Userlog (id,email,password,name,phone);
				}
    	} 
    catch (Exception e) {
			System.out.print(e);
		}
	return userlog;
    }
}
