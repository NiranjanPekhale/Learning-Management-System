package modelclass;

import java.sql.*;

public class Lectures {
	
	private int lec_id;
	private int course_id;
	private int teacher_id;
	private int batch_id;
	private Time lec_start;
	private Time lec_end;
	private Date lec_date;
	public Lectures() {
	}
	public Lectures(int lec_id, int course_id, int teacher_id, int batch_id, Time lec_start, Time lec_end,
			Date lec_date) {
		super();
		this.lec_id = lec_id;
		this.course_id = course_id;
		this.teacher_id = teacher_id;
		this.batch_id = batch_id;
		this.lec_start = lec_start;
		this.lec_end = lec_end;
		this.lec_date = lec_date;
	}
	public int getLec_id() {
		return lec_id;
	}
	public void setLec_id(int lec_id) {
		this.lec_id = lec_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public Time getLec_start() {
		return lec_start;
	}
	public void setLec_start(Time lec_start) {
		this.lec_start = lec_start;
	}
	public Time getLec_end() {
		return lec_end;
	}
	public void setLec_end(Time lec_end) {
		this.lec_end = lec_end;
	}
	public Date getLec_date() {
		return lec_date;
	}
	public void setLec_date(Date lec_date) {
		this.lec_date = lec_date;
	}
	
	
	
	

}
