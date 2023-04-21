package seller.additem;

public class Item {

	private int id;
	private String email;
    private String name;
    private String category;
    private String itemprice;
    private String quantity;
    private String pic;
    
    
    public Item() {
		super();
	}
    
    public Item(int id, String email, String name, String category, String itemprice, String quantity, String pic) {
		super();
		this.id=id;
		this.email = email;
		this.name = name;
		this.category = category;
		this.itemprice = itemprice;
		this.quantity = quantity;
		this.pic = pic;
	}
	
	
//list item
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
    public String getitemprice() {
        return itemprice;
    }
    public void setitemprice(String itemprice) {
        this.itemprice = itemprice;
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

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
}