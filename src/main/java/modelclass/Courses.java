package modelclass;

public class Courses {
	
	private int course_id;
	private String course_name;	
	private String duration;
	private String teacher;
	private double  price;
	private String course_image;
	public Courses() {
		
	}
	
	public Courses(int course_id, String course_name, String duration, String teacher, double price,
			String cource_image) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.duration = duration;
		this.teacher = teacher;
		this.price = price;
		this.course_image = cource_image;
	}

	public String getCource_image() {
		return course_image;
	}

	public void setCourse_image(String cource_image) {
		this.course_image = cource_image;
	}

	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int cource_id) {
		this.course_id = cource_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public String[] getArray()
	{
		String arr[]= {course_id+"",course_name,duration,teacher,price+"",course_image};
		return arr;
		
	}
	
	

}
