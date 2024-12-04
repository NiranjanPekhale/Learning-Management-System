package modelclass;

import java.sql.Time;

public class Subtopics {
	private int subtopic_id;
	private int course_id;
	private int chapter_no;
	private String subtopic_title;	
	private String chapter_name;	
	private Time duration;
	private int lec_id;
	public Subtopics() {
	}
	public Subtopics(int subtopic_id, int course_id, int chapter_no, String subtopic_title, String chapter_name,
			Time duration, int lec_id) {
		super();
		this.subtopic_id = subtopic_id;
		this.course_id = course_id;
		this.chapter_no = chapter_no;
		this.subtopic_title = subtopic_title;
		this.chapter_name = chapter_name;
		this.duration = duration;
		this.lec_id = lec_id;
	}
	public int getSubtopic_id() {
		return subtopic_id;
	}
	public void setSubtopic_id(int subtopic_id) {
		this.subtopic_id = subtopic_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getChapter_no() {
		return chapter_no;
	}
	public void setChapter_no(int chapter_no) {
		this.chapter_no = chapter_no;
	}
	public String getSubtopic_title() {
		return subtopic_title;
	}
	public void setSubtopic_title(String subtopic_title) {
		this.subtopic_title = subtopic_title;
	}
	public String getChapter_name() {
		return chapter_name;
	}
	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}
	public Time getDuration() {
		return duration;
	}
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	public int getLec_id() {
		return lec_id;
	}
	public void setLec_id(int lec_id) {
		this.lec_id = lec_id;
	}
	
	
	
	

}
