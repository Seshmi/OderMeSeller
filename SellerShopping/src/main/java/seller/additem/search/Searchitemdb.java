package seller.additem.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Searchitemdb {

	public ArrayList<Searchitems> getitemdetails(String itemname) throws ClassNotFoundException{
		
		ArrayList<Searchitems> item =new ArrayList<>();
		
		//System.out.print(itemname);
		
		Class.forName("com.mysql.jdbc.Driver");
			
		try {
			
			String url="jdbc:mysql://localhost:3306/shopping?useSSL=false";
			Connection con=DriverManager.getConnection(url,"root","1234");
			
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select *from item where name='"+itemname+"'");
		
		
		while(rs.next()) {
			
			int id=rs.getInt("id");	
			String iname=rs.getString("name");
			String category=rs.getString("category");
			String price=rs.getString("price");
			String quantity=rs.getString("quantity");
			String pic=rs.getString("pic");
			String email=rs.getString("email");
			
			Searchitems it=new Searchitems(id,iname,category,price,quantity,pic,email);
			
			item.add(it);
			
			//System.out.print(price);
			}
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return item;
		}
}
