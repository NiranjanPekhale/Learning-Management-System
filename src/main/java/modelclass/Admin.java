package modelclass;

public class Admin {
	
	private String admin_id;
	private String admin_name;
	private String admin_address;
	private String admin_email;
	private String admin_MobNo;
	private String username;
	private String password;
	private String profile;
	
	
	public Admin() {
	}
	
	

	public Admin(String admin_id, String admin_name, String admin_address, String admin_email, String admin_MobNo,
			String username, String password, String profile) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_address = admin_address;
		this.admin_email = admin_email;
		this.admin_MobNo = admin_MobNo;
		this.username = username;
		this.password = password;
		this.profile = profile;
	}





	public String getAdmin_id() {
		return admin_id;
	}



	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	


	




	public String getProfile() {
		return profile;
	}











	public void setProfile(String profile) {
		this.profile = profile;
	}




	public String getAdmin_name() {
		return admin_name;
	}


	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}


	public String getAdmin_address() {
		return admin_address;
	}


	public void setAdmin_address(String admin_address) {
		this.admin_address = admin_address;
	}


	public String getAdmin_email() {
		return admin_email;
	}


	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}


	public String getAdmin_MobNo() {
		return admin_MobNo;
	}


	public void setAdmin_MobNo(String admin_MobNo) {
		this.admin_MobNo = admin_MobNo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}





	public String[] getArray()
	{
		String arr[]= {admin_id,admin_name,admin_address,admin_email,admin_MobNo,username,password,profile};
		return arr;
		
	}









}
