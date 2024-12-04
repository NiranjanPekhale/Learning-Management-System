package modelclass;

import java.sql.*;

public class Payment {

	private int payment_id;
	private int std_id;
	private int no_of_courses;
	private int total_amount;
	private Time payment_time;
	private Date payment_date;
	private String status;
	public Payment() {
	}
	public Payment(int payment_id, int std_id, int no_of_courses, int total_amount, Time payment_time,
			Date payment_date, String status) {
		super();
		this.payment_id = payment_id;
		this.std_id = std_id;
		this.no_of_courses = no_of_courses;
		this.total_amount = total_amount;
		this.payment_time = payment_time;
		this.payment_date = payment_date;
		this.status = status;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public int getNo_of_courses() {
		return no_of_courses;
	}
	public void setNo_of_courses(int no_of_courses) {
		this.no_of_courses = no_of_courses;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public Time getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(Time payment_time) {
		this.payment_time = payment_time;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
