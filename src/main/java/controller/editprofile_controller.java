package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import modelclass.Student;
import repository.Student_DAO;

@WebServlet("/editprofile_controller")
@MultipartConfig
public class editprofile_controller extends HttpServlet {
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//fetch the data from profile 
		String username = request.getParameter("username");
		String address = request.getParameter("saddress");
		String email = request.getParameter("semail");
		String mobail = request.getParameter("smobail");
		String password = request.getParameter("spassword");
		Part part = request.getPart("sprofile");
		
		
		
		String profileName = part.getSubmittedFileName();
		System.out.println(profileName);
		
		String upload_path="D:/Web Eclipse Workspace/LMS1/src/main/webapp/profile_pic/"+profileName;
		System.out.println(upload_path);
		


		
		
		
		//get the older data from the user from the session
		HttpSession session = request.getSession();
		Student suser = (Student) session.getAttribute("currentuser");
		suser.setStd_username(username);
		suser.setStd_address(address);
		suser.setStd_email(email);
		suser.setStd_MobNo(mobail);
		suser.setStd_password(password);
		suser.setProfile(profileName);
		
		//update in the database
		Student_DAO std_DAO = new Student_DAO();
		boolean i = std_DAO.updateStudent(suser);
		if(i) {
			System.out.println("data successfully updated");
			
			
//			to upload profile pic in project folder			
			try {
				FileOutputStream fos=new FileOutputStream(upload_path);
				InputStream is=part.getInputStream();
				
				
				byte[] data =new byte[is.available()];
				is.read(data);
				fos.write(data);
				fos.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			System.out.println("this is error");
			
//			to update the session 
			session.setAttribute("currentuser", suser);
			System.out.println(suser.getProfile());
			


			
			response.sendRedirect("student_Dashboard.jsp");
		}
		else {
			System.out.println("data updation faild..!");
			response.sendRedirect("student_Dashboard.jsp");
		}
		
		
		
	}

}
