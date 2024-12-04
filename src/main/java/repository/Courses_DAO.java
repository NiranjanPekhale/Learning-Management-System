package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Time;

import modelclass.Courses;

public class Courses_DAO{
	static Connection con;

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2003@");
			Statement st=con.createStatement();
			String query="create table Courses(course_id int primary key,course_id int,chapter_no int,subtopic_title varchar(30),chapter_name varchar(40),duration date,lec_id int,foreign key(lec_id) references Lectures(lec_id),course_image varchar(50))";
			st.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	

	
	public boolean insert(Courses ob)
	{
		int x=0;
		try {
			String query="insert into Courses values(?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, ob.getCourse_id());
			st.setString(2, ob.getCourse_name());
			st.setString(3, ob.getDuration());
			st.setString(4, ob.getTeacher());
			st.setDouble(5, ob.getPrice());
			st.setString(6, ob.getCource_image());
			
			x=st.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(x>0)
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
	
	
	public Courses find(int course_id)
	{
		Courses ob1=new Courses();
		
		try
		{
			Statement st=con.createStatement();
			String query="select * from Courses where course_id='"+course_id+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{

				ob1.setCourse_id(rs.getInt(1));
				ob1.setCourse_name(rs.getString(2));
				ob1.setDuration(rs.getString(3));
				ob1.setTeacher(rs.getString(4));
				ob1.setPrice(rs.getDouble(5));
				ob1.setCourse_image(rs.getString(6));
				
				
				
				
				return ob1;
				
				
				
			}
		}
		catch (Exception e) {
				System.out.println(e);
		}
		return null;
	}
	
	
	
	
	
	
	
	public boolean update(Courses ob)
	{
		int x=0;
		try {
			Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery("select * from Courses");
			ResultSetMetaData rsMetaData=rs1.getMetaData();
			
			
			
			String arr[]=ob.getArray();
			
			int l=arr.length;
			for(int i=1;i<l;i++)
			{
				if(arr[i]!=null)
				{
					Statement st2=con.createStatement();
					String query="update Courses set "+rsMetaData.getColumnName(i+1)+"='"+arr[i]+"' where course_id='"+arr[0]+"'";
					x=st2.executeUpdate(query);					
				}
									
			}
			if(x>0)
			{
				return true;
			}
			else
			{
				return false;
			}
	
			
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	
	public boolean delete(int course_id)
	{
		int x=0;
		try {
			Statement st=con.createStatement();
			String query="delete from Courses where course_id='"+course_id+"'";
			x=st.executeUpdate(query);
			if(x>0)
			{
				return true;
			}
			else {
				return false;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
			
		}
		
		
		
	}
	
}