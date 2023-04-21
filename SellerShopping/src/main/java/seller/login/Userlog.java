package seller.login;

public class Userlog  {

	private int id;
    private String email;
    private String password;
    private String name;
    private String phone;

    public Userlog() {
		super();
	}

	public Userlog(int id, String email, String password, String name, String phone) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}