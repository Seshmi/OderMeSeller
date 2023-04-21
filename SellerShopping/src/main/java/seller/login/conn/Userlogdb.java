package seller.login.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import seller.login.Userlog;

public class Userlogdb {
	
    public boolean validate(Userlog userlog) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from seller where email = ? and password = ?")) {
            preparedStatement.setString(1, userlog.getemail());
            preparedStatement.setString(2, userlog.getPassword());


            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
            System.out.print(e);
        }
        return status;
    }
}