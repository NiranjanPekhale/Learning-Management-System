package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import modelclass.Student;

public class Student_DAO{
	static Connection con;

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2003@");
			Statement st=con.createStatement();
			String query="create table Student(std_id varchar(50) primary key,std_name varchar(30),std_class varchar(40),std_address varchar(30),std_email varchar(40),std_MobNo varchar(10),username varchar(10) unique,password varchar(10),profile varchar(50))";
			st.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	public boolean insert(Student ob)
	{
		int x=0;
		try {
			String query="insert into Student values(?,?,?,?,?,?,?,?,null)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, ob.getStd_id());
			st.setString(2, ob.getStd_name());
			st.setString(3, ob.getStd_class());
			st.setString(4, ob.getStd_address());
			st.setString(5, ob.getStd_email());
			st.setString(6, ob.getStd_MobNo());
			st.setString(7, ob.getStd_username());
			st.setString(8, ob.getStd_password());
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
	
	
	public Student find(int Std_id)
	{
		Student ob1=new Student();
		
		try
		{
			Statement st=con.createStatement();
			String query="select * from Student where Std_id='"+Std_id+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{

				ob1.setStd_id(rs.getString(1));
				ob1.setStd_name(rs.getString(2));
				ob1.setStd_class(rs.getString(3));
				ob1.setStd_address(rs.getString(4));
				ob1.setStd_email(rs.getString(5));
				ob1.setStd_MobNo(rs.getString(6));
				ob1.setStd_username(rs.getString(7));
				ob1.setStd_password(rs.getString(8));
				
				
				
				
				return ob1;
				
				
				
			}
		}
		catch (Exception e) {
				System.out.println(e);
		}
		return null;
	}
	
	
	
	
	
	
	
	public boolean update(Student ob)
	{
		int x=0;
		try {
			Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery("select * from Student");
			ResultSetMetaData rsMetaData=rs1.getMetaData();
			
			
			
			String arr[]=ob.getArray();
			
			int l=arr.length;
			for(int i=1;i<l;i++)
			{
				if(arr[i]!=null)
				{
					Statement st2=con.createStatement();
					String query="update Student set "+rsMetaData.getColumnName(i+1)+"='"+arr[i]+"' where std_id='"+arr[0]+"'";
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
	
	
	public boolean delete(int std_id)
	{
		int x=0;
		try {
			Statement st=con.createStatement();
			String query="delete from Student where std_id='"+std_id+"'";
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
		try {
			Statement st=con.createStatement();
			String query = "select std_name from Student where username='"+ username +"' and password='"+ password +"'";
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				x = 1;
			}
			else {
				x = 0;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(x>0) {
			return username;
		}
		else {
			return "fails";
		}
	}
	
	//get user by username and userpassworld:
	
	public Student getStudentForLogin(String username, String password) {
		Student student = null;
		try {
			String query = "select * from student where username= ? and password=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, username);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				student = new Student();
// data from db
				String std_id = rs.getString(1);
// set to user object
				student.setStd_id(std_id);
			
				student.setStd_name(rs.getString(2));
				student.setStd_class(rs.getString(3));
				student.setStd_address(rs.getString(4));
				student.setStd_email(rs.getString(5));
				student.setStd_MobNo(rs.getString(6));
				student.setStd_username(rs.getString(7));
				student.setStd_password(rs.getString(8));
				student.setProfile(rs.getString(9));
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}
	
	
	
	public boolean updateStudent(Student student) {
		boolean f = false;
		
		try {
			
			
			String query = "update student set std_name=?, std_address=?, std_email=?, std_mobno=?, username=?, password=?,profile=? where std_id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, student.getStd_name());
			pstmt.setString(2, student.getStd_address());
			pstmt.setString(3, student.getStd_email());
			pstmt.setString(4, student.getStd_MobNo());
			pstmt.setString(5, student.getStd_username());
			pstmt.setString(6, student.getStd_password());
			pstmt.setString(7, student.getProfile());
			pstmt.setString(8, student.getStd_id());
			
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public Student[] getAllStudents()
	{
		Student students[];
		int record_count;
		try {
			Statement st1=con.createStatement();
			String query1="select count(*) from student";
			ResultSet rs1=st1.executeQuery(query1);
			if(rs1.next())
			{
				record_count=rs1.getInt(1);
				students=new Student[record_count];
				
				try
				{
					Statement st=con.createStatement();
					String query="select * from Student";
					ResultSet rs=st.executeQuery(query);
					int i=0;
					Student ob;
					while(rs.next())
					{
						ob=new Student();
						ob.setStd_id(rs.getString(1));
						ob.setStd_name(rs.getString(2));
						ob.setStd_class(rs.getString(3));
						ob.setStd_address(rs.getString(4));
						ob.setStd_email(rs.getString(5));
						ob.setStd_MobNo(rs.getString(6));
						ob.setStd_username(rs.getString(7));
						ob.setStd_password(rs.getString(8));
												
						students[i]=ob;
						i=i+1;
						
					}
					return students;
				}
				catch (Exception f) {
						System.out.println("this is inner exception :"+f);
				}
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println("this is outer exception : "+e);
		}
		
		
		return null;
	}
	
	
	
	
	
}