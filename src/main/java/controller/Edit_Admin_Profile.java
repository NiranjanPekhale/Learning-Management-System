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

import modelclass.Admin;
import modelclass.Student;
import repository.Admin_DAO;
import repository.Student_DAO;


@WebServlet("/Edit_Admin_Profile")
@MultipartConfig

public class Edit_Admin_Profile extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("this is 1st line");

		PrintWriter out = response.getWriter();
		//fetch the data from profile 
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		Part part = request.getPart("profile");
		
		
		
		String profileName = part.getSubmittedFileName();
		System.out.println("this is image name :"+profileName);
		
		String upload_path="D:/Web Eclipse Workspace/LMS1/src/main/webapp/admin_profile_pic/"+profileName;
		System.out.println(upload_path);
		
		
		

		
		//get the older data from the user from the session
		HttpSession session = request.getSession();
		Admin auser = (Admin) session.getAttribute("currentuser");
		auser.setUsername(username);
		auser.setAdmin_address(address);
		auser.setAdmin_email(email);
		auser.setAdmin_MobNo(mobile);
		auser.setPassword(password);
		auser.setProfile(profileName);
		
		//update in the database
		Admin_DAO admin_DAO = new Admin_DAO();
		boolean i = admin_DAO.update(auser);
		if(i) {
			System.out.println("data successfully updated");
			
			
//			to upload profile pic in project folder	
			if((auser.getProfile()!=null) && (auser.getProfile()!=""))
			{
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
			}
			
			
//			to update the session 
			session.setAttribute("currentuser", admin_DAO.find(auser.getUsername(),auser.getPassword() ));
			
			

			
			response.sendRedirect("Admin_Dashboard.jsp");
		}
		else {
			System.out.println("data updation faild..!");
			response.sendRedirect("Admin_Dashboard.jsp");
		}
		
		
		
	}

}
