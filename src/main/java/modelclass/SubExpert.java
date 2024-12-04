package modelclass;

public class SubExpert {
	
	private int subExpert_id;
	private String subExpert_name;
	private String subExpert_address;
	private String subExpert_education;
	private String subExpert_age;
	private String subExpert_MobNo;
	private String username;
	private String password;
	public SubExpert() {
	}
	public SubExpert(int subExpert_id, String subExpert_name, String subExpert_address, String subExpert_education,
			String subExpert_age, String username, String password) {
		super();
		this.subExpert_id = subExpert_id;
		this.subExpert_name = subExpert_name;
		this.subExpert_address = subExpert_address;
		this.subExpert_education = subExpert_education;
		this.subExpert_age = subExpert_age;
		this.username = username;
		this.password = password;
	}
	public int getSubExpert_id() {
		return subExpert_id;
	}
	public void setSubExpert_id(int subExpert_id) {
		this.subExpert_id = subExpert_id;
	}
	public String getSubExpert_name() {
		return subExpert_name;
	}
	public void setSubExpert_name(String subExpert_name) {
		this.subExpert_name = subExpert_name;
	}
	public String getSubExpert_address() {
		return subExpert_address;
	}
	public void setSubExpert_address(String subExpert_address) {
		this.subExpert_address = subExpert_address;
	}
	public String getSubExpert_education() {
		return subExpert_education;
	}
	public void setSubExpert_education(String subExpert_education) {
		this.subExpert_education = subExpert_education;
	}
	public String getSubExpert_age() {
		return subExpert_age;
	}
	public void setSubExpert_age(String subExpert_age) {
		this.subExpert_age = subExpert_age;
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
	public String getSubExpert_MobNo() {
		return subExpert_MobNo;
	}
	public void setSubExpert_MobNo(String subExpert_MobNo) {
		this.subExpert_MobNo = subExpert_MobNo;
	}
	
	
	public String[] getArray()
	{
		String arr[]= {subExpert_id+"",subExpert_name,subExpert_address,subExpert_education,subExpert_age,subExpert_MobNo,username,password};
		return arr;
		
	}	
	
	
	
	

}
