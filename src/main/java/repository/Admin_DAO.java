package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import modelclass.Admin;

public class Admin_DAO{
	static Connection con;

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2003@");
			Statement st=con.createStatement();
			String query="create table Admin(admin_id varchar(50) primary key,admin_name varchar(30),admin_address varchar(30),admin_email varchar(40),admin_MobNo varchar(10),username varchar(10) unique,password varchar(10),profile varchar(50))";
			st.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	public boolean insert(Admin ob)
	{
		int x=0;
		try {
			String query="insert into Admin values(?,?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, ob.getAdmin_id());
			st.setString(2, ob.getAdmin_name());
			st.setString(3, ob.getAdmin_address());
			st.setString(4, ob.getAdmin_email());
			st.setString(5, ob.getAdmin_MobNo());
			st.setString(6, ob.getUsername());
			st.setString(7, ob.getPassword());
			st.setString(8, ob.getProfile());
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
	
	
	public Admin find(String username,String password)
	{
		Admin ob1=new Admin();
		
		try
		{
			Statement st=con.createStatement();
			String query="select * from Admin where username='"+username+"' and password='"+password+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{

				ob1.setAdmin_id(rs.getString(1));
				ob1.setAdmin_name(rs.getString(2));
				ob1.setAdmin_address(rs.getString(3));
				ob1.setAdmin_email(rs.getString(4));
				ob1.setAdmin_MobNo(rs.getString(5));
				ob1.setUsername(rs.getString(6));
				ob1.setPassword(rs.getString(7));
				ob1.setProfile(rs.getString(8));
				
				
				
				
				return ob1;
				
				
				
			}
		}
		catch (Exception e) {
				System.out.println(e);
		}
		return null;
	}
	
	
	
	
	
	
	
	public boolean update(Admin admin)
	{
		
		int x=0;
				
			try {
				
				if((admin.getProfile()!=null) && (admin.getProfile()!=""))
				{
				
				
					String query = "update admin set admin_name=?, admin_address=?, admin_email=?, admin_MobNo=?, username=?, password=?,profile=? where admin_id=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, admin.getAdmin_name());
					pstmt.setString(2, admin.getAdmin_address());
					pstmt.setString(3, admin.getAdmin_email());
					pstmt.setString(4, admin.getAdmin_MobNo());
					pstmt.setString(5, admin.getUsername());
					pstmt.setString(6, admin.getPassword());
					pstmt.setString(7, admin.getProfile());
					pstmt.setString(8, admin.getAdmin_id());
					
					
					x=pstmt.executeUpdate();
				}
				else {
					String query = "update admin set admin_name=?, admin_address=?, admin_email=?, admin_MobNo=?, username=?, password=? where admin_id=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, admin.getAdmin_name());
					pstmt.setString(2, admin.getAdmin_address());
					pstmt.setString(3, admin.getAdmin_email());
					pstmt.setString(4, admin.getAdmin_MobNo());
					pstmt.setString(5, admin.getUsername());
					pstmt.setString(6, admin.getPassword());
					pstmt.setString(7, admin.getAdmin_id());
					
					
					x=pstmt.executeUpdate();
					System.out.println("this is else");
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
//	public boolean update(Admin ob)
//	{
//		int x=0;
//		try {
//			Statement st1=con.createStatement();
//			ResultSet rs1=st1.executeQuery("select * from Admin where admin_id="+ob.getAdmin_id());
//			ResultSetMetaData rsMetaData=rs1.getMetaData();
//			
//			
//			
//			String arr[]=ob.getArray();
//			
//			int l=arr.length;
//			for(int i=1;i<l;i++)
//			{
//				System.out.println(rsMetaData.getColumnName(i+1)+"=="+arr[i]+"hi");
//				if(rs1.next()) {
//					if((arr[i]!=null)&&(arr[i]!="")&&(!(arr[i].equals(rs1.getString(i+1)))))
//					{
//						Statement st2=con.createStatement();
//						String query="update Admin set "+rsMetaData.getColumnName(i+1)+"='"+arr[i]+"' where admin_id='"+arr[0]+"'";
//						x=st2.executeUpdate(query);					
//					}
//				}
//				
//			}
//			System.out.println("x="+x);
//			
//			if(x>0)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//			
//			
//		}
//		catch (Exception e) {
//			System.out.println(e);
//			return false;
//		}
//	}
	
	
	public boolean delete(String admin_id)
	{
		int x=0;
		try {
			Statement st=con.createStatement();
			String query="delete from Admin where std_id='"+admin_id+"'";
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