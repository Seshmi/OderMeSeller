package seller.additem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Itemdatadb {
    
	public Item Retrive(String username) throws ClassNotFoundException {
    	
    	Item item;
    	item = new Item ();
        Class.forName("com.mysql.jdbc.Driver");

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useSSL=false", "root", "1234");
    	
    		PreparedStatement preparedStatement = connection.prepareStatement("select * from item where name = ?")){
    		
				preparedStatement.setString(1,username);
				
				ResultSet rs= preparedStatement.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String email = rs.getString("email");
					String name = rs.getString("name");
					String category= rs.getString("category");
					String itemprice=rs.getString("price");
					String quantity=rs.getString("quantity");
					String pic=rs.getString("pic");
					
					item = new Item (id,email,name,category,itemprice,quantity,pic);
					
				}
    	} 
    catch (Exception e) {
			System.out.print(e);
		}
	return item;
    }
}
