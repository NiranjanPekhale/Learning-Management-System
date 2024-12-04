package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import modelclass.Teacher;

public class Teacher_DAO{
	static Connection con;

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2003@");
			Statement st=con.createStatement();
			String query="create table Teacher(teacher_id varchar(50) primary key,teacher_name varchar(30),teacher_education varchar(40),teacher_address varchar(30),teacher_MobNo varchar(10),teacher_email varchar(50),username varchar(20) unique,password varchar(10))";
			st.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	public boolean insert(Teacher ob)
	{
		int x=0;
		try {
			String query="insert into Teacher values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, ob.getTeacher_id());
			st.setString(2, ob.getTeacher_name());
			st.setString(3, ob.getTeacher_education());
			st.setString(4, ob.getTeacher_address());
			st.setString(5, ob.getTeacher_MobNo());
			st.setString(6, ob.getTeacher_email());
			st.setString(7, ob.getUsername());
			st.setString(8, ob.getPassword());
			st.setString(9, "default.png");
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
	
	
	public Teacher find(int teacher_id)
	{
		Teacher ob1=new Teacher();
		
		try
		{
			Statement st=con.createStatement();
			String query="select * from Teacher where teacher_id='"+teacher_id+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{

				ob1.setTeacher_id(rs.getString(1));
				ob1.setTeacher_name(rs.getString(2));
				ob1.setTeacher_education(rs.getString(3));
				ob1.setTeacher_address(rs.getString(4));
				ob1.setTeacher_MobNo(rs.getString(5));
				ob1.setUsername(rs.getString(7));
				ob1.setPassword(rs.getString(8));
				
				
				
				
				return ob1;
				
				
				
			}
		}
		catch (Exception e) {
				System.out.println(e);
		}
		return null;
	}
	
	
	
	
	
	
	
	public boolean update(Teacher ob)
	{
		int x=0;
		try {
			Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery("select * from Teacher");
			ResultSetMetaData rsMetaData=rs1.getMetaData();
			
			
			
			String arr[]=ob.getArray();
			
			int l=arr.length;
			for(int i=1;i<l;i++)
			{
				if(arr[i]!=null)
				{
					Statement st2=con.createStatement();
					String query="update Teacher set "+rsMetaData.getColumnName(i+1)+"='"+arr[i]+"' where std_id='"+arr[0]+"'";
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
	
	
	public boolean delete(int teacher_id)
	{
		int x=0;
		try {
			Statement st=con.createStatement();
			String query="delete from Teacher where teacher_id='"+teacher_id+"'";
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
	
	public String forLogin(String username, String password) {
		int x = 0;
//		String name="";
		try {
			Statement st=con.createStatement();
			String query = "select teacher_name from teacher where username='"+ username +"' and password='"+ password +"'";
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				x = 1;
//				name = rs.getString(1);
			}
			else {
				x = 0;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(x>0) {
//			return name;
			return username;
		}
		else {
			return "fails";
		}
		
	}
	
	
	
	public Teacher getTeacheForLogin(String username, String password) {
		Teacher teacher = null;
		try {
			
			String query = "select * from teacher where username= ? and password = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, username);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				teacher = new Teacher();
				teacher.setTeacher_id(rs.getString(1));
				teacher.setTeacher_name(rs.getString(2));
				teacher.setTeacher_education(rs.getString(3));
				teacher.setTeacher_address(rs.getString(4));
				teacher.setTeacher_MobNo(rs.getString(5));
				teacher.setTeacher_email(rs.getString(6));
				teacher.setUsername(rs.getString(7));
				teacher.setPassword(rs.getString(8));
				teacher.setProfile(rs.getString(9));
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return teacher;
	}
	
}