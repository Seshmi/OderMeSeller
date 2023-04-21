package seller.additem.search;

public class Searchitems {

	private int id;
	private String name;
	private String category;
	private String price;
	private String quantity;
	private String pic;
	private String email;
	
	public Searchitems() {
		super();
	}
	
	public Searchitems(int id, String name, String category, String price, String quantity, String pic, String email) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.pic = pic;
		this.email = email;
	}

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
	public String getquantity() {
		return quantity;
	}
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	public String getpic() {
		return pic;
	}
	public void setpic(String pic) {
		this.pic = pic;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
}
