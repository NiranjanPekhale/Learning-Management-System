package modelclass;

import java.sql.*;

public class Std_Feedback {
	private int feedback_id;
	private int std_id;
	private int lec_id;
	private String feedback;
	private Date feedback_date;
	private Time feedback_time;
	
	
	
	
	public Std_Feedback() {
	}
	
	
	
	
	
	public Std_Feedback(int feedback_id, int std_id, int lec_id, String feedback, Date feedback_date,
			Time feedback_time) {
		super();
		this.feedback_id = feedback_id;
		this.std_id = std_id;
		this.lec_id = lec_id;
		this.feedback = feedback;
		this.feedback_date = feedback_date;
		this.feedback_time = feedback_time;
	}
	
	
	
	
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public int getLec_id() {
		return lec_id;
	}
	public void setLec_id(int lec_id) {
		this.lec_id = lec_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Date getFeedback_date() {
		return feedback_date;
	}
	public void setFeedback_date(Date feedback_date) {
		this.feedback_date = feedback_date;
	}
	public Time getFeedback_time() {
		return feedback_time;
	}
	public void setFeedback_time(Time feedback_time) {
		this.feedback_time = feedback_time;
	}
	
	
	
	
	
	
	
	

}
