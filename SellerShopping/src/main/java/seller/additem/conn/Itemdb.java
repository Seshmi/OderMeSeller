package seller.additem.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import seller.additem.Item;

public class Itemdb {
	//Create (Insert)
    public int additem(Item item) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO item" +
            "  (id, name, category, price, quantity, pic,email) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?);";

        int result = 0;
       
        
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, item.getname());
            preparedStatement.setString(3, item.getcategory());
            preparedStatement.setString(4, item.getitemprice());
            preparedStatement.setString(5, item.getquantity());
            preparedStatement.setString(6, item.getpic());
            preparedStatement.setString(7, item.getemail());

            //System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            
        	System.out.print(e);
        }
        return result;
    }
    
}