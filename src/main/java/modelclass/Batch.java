package modelclass;

import java.sql.*;

public class Batch {
	private int batch_id;
	private int cource_id;
	private Date start_date; 
	private Date end_date; 
	private Time start_time ; 
	private Time end_time ;
	public Batch() {
		
	}
	public Batch(int batch_id, int cource_id, Date start_date, Date end_date, Time start_time, Time end_time) {
		super();
		this.batch_id = batch_id;
		this.cource_id = cource_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getCource_id() {
		return cource_id;
	}
	public void setCource_id(int cource_id) {
		this.cource_id = cource_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Time getStart_time() {
		return start_time;
	}
	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	} 
	
	
	
	
	
	
	

}
