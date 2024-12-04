package modelclass;

public class Teacher {
	private String teacher_id;
	private String teacher_name;
	private String teacher_education;
	private String teacher_address;
	private String teacher_MobNo;
	private String teacher_email;
	private String username ;
	private String password ;
	private String profile;
	
	public Teacher() {
	}
	

	public Teacher(String teacher_id, String teacher_name, String teacher_education, String teacher_address,
			String username, String password, String teacher_MobNo) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_education = teacher_education;
		this.teacher_address = teacher_address;
		this.username = username;
		this.password = password;
		this.setTeacher_MobNo(teacher_MobNo);
	}




	public String getTeacher_id() {
		return teacher_id;
	}


	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}


	public String getTeacher_name() {
		return teacher_name;
	}


	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}


	public String getTeacher_education() {
		return teacher_education;
	}


	public void setTeacher_education(String teacher_education) {
		this.teacher_education = teacher_education;
	}


	public String getTeacher_address() {
		return teacher_address;
	}


	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
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




	public String getTeacher_MobNo() {
		return teacher_MobNo;
	}

	public void setTeacher_MobNo(String teacher_MobNo) {
		this.teacher_MobNo = teacher_MobNo;
	}
	
	
	public String getTeacher_email() {
		return teacher_email;
	}


	public void setTeacher_email(String teacher_email) {
		this.teacher_email = teacher_email;
	}
	
	
	
	
	
	
	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String[] getArray()
	{
		String arr[]= {teacher_id+"",teacher_name,teacher_education,teacher_address,teacher_MobNo,teacher_email,username,password};
		return arr;
		
	}



}
