package modelclass;

import java.sql.*;

public class Complaint {
	
	private int complaint_id;
	private String by_role;
	private int by_id;
	private String to_role;
	private int to_id;
	private String complaint_title;
	private String complaint_details;
	private String complaint_status;
	private Time complaint_time;
	private Date complaint_date;
	
	
	
	
	public Complaint() {
	}
	
	
	
	
	
	public Complaint(int complaint_id, String by_role, int by_id, String to_role, int to_id, String complaint_title,
			String complaint_details, String complaint_status, Time complaint_time, Date complaint_date) {
		super();
		this.complaint_id = complaint_id;
		this.by_role = by_role;
		this.by_id = by_id;
		this.to_role = to_role;
		this.to_id = to_id;
		this.complaint_title = complaint_title;
		this.complaint_details = complaint_details;
		this.complaint_status = complaint_status;
		this.complaint_time = complaint_time;
		this.complaint_date = complaint_date;
	}
	public int getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getBy_role() {
		return by_role;
	}
	public void setBy_role(String by_role) {
		this.by_role = by_role;
	}
	public int getBy_id() {
		return by_id;
	}
	public void setBy_id(int by_id) {
		this.by_id = by_id;
	}
	public String getTo_role() {
		return to_role;
	}
	public void setTo_role(String to_role) {
		this.to_role = to_role;
	}
	public int getTo_id() {
		return to_id;
	}
	public void setTo_id(int to_id) {
		this.to_id = to_id;
	}
	public String getComplaint_title() {
		return complaint_title;
	}
	public void setComplaint_title(String complaint_title) {
		this.complaint_title = complaint_title;
	}
	public String getComplaint_details() {
		return complaint_details;
	}
	public void setComplaint_details(String complaint_details) {
		this.complaint_details = complaint_details;
	}
	public String getComplaint_status() {
		return complaint_status;
	}
	public void setComplaint_status(String complaint_status) {
		this.complaint_status = complaint_status;
	}
	public Time getComplaint_time() {
		return complaint_time;
	}
	public void setComplaint_time(Time complaint_time) {
		this.complaint_time = complaint_time;
	}
	public Date getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date(Date complaint_date) {
		this.complaint_date = complaint_date;
	}
	
	
	
	
	
	

}
