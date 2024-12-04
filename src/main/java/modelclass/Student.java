package modelclass;

public class Student {
	private String std_id;
	private String std_name;
	private String std_class;
	private String std_address;
	private String std_email;
	private String std_MobNo;
	private String username;
	private String password;
	private String profile;
	
	
	
	public Student() {}



	public Student(String std_id, String std_name, String std_class, String std_address, String std_email,
			String std_MobNo, String username, String password) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_class = std_class;
		this.std_address = std_address;
		this.std_email = std_email;
		this.std_MobNo = std_MobNo;
		this.username = username;
		this.password = password;
	}



	public String getStd_id() {
		return std_id;
	}



	public void setStd_id(String std_id) {
		this.std_id = std_id;
	}



	public String getStd_name() {
		return std_name;
	}



	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}



	public String getStd_class() {
		return std_class;
	}



	public void setStd_class(String std_class) {
		this.std_class = std_class;
	}



	public String getStd_address() {
		return std_address;
	}



	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}



	public String getStd_email() {
		return std_email;
	}



	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}



	public String getStd_MobNo() {
		return std_MobNo;
	}



	public void setStd_MobNo(String std_MobNo) {
		this.std_MobNo = std_MobNo;
	}



	public String getStd_username() {
		return username;
	}



	public void setStd_username(String username) {
		this.username = username;
	}



	public String getStd_password() {
		return password;
	}



	public void setStd_password(String password) {
		this.password = password;
	}
	
	
	
	 
	
	public String getProfile() {
		return profile;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}



	public String[] getArray()
	{
		String arr[]= {std_id+"",std_name,std_class,std_address,std_email,std_email,username,password};
		return arr;
		
	}
	
	
	
	
	

}
