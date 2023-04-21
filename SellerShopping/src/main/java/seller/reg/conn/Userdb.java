package seller.reg.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import seller.reg.User;

public class Userdb {

    public int registerEmployee(User user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO seller" +
            "  (id, name, email, password, phone) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, user.getname());
            preparedStatement.setString(3, user.getemail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getPhone());


            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            
            System.out.print(e);
        }
        return result;
    }
}