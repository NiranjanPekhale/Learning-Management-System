package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelclass.Student;
import repository.Student_DAO;

//To generate the Student id 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/std_registration_Controller")
public class std_registration_Controller extends HttpServlet {
	
       
	private Student_DAO std_DAO = new Student_DAO();
   
    //To generate the Student id
    public static String generateId() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the desired format for the ID
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        // Format the date and time as per the desired format
        String id = now.format(formatter);

        return id;
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String generatedId = generateId();
		
		String std_id = generatedId;
		String std_name = request.getParameter("std_name");
		String std_class = request.getParameter("std_class");
		String std_address = request.getParameter("std_address");
		String std_email = request.getParameter("std_email");
		String std_MobNo = request.getParameter("std_MobNo");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		if(password.equals(confirmPassword)) {
			
			Student std = new Student();
			std.setStd_id(std_id);
			std.setStd_name(std_name);
			std.setStd_class(std_class);
			std.setStd_address(std_address);
			std.setStd_email(std_email);
			std.setStd_MobNo(std_MobNo);
			std.setStd_username(username);
			std.setStd_password(password);
			
			std_DAO.insert(std);
			
			session.setAttribute("user", std_name);
			response.sendRedirect("login.jsp");
		}
		else {
			
			String msg = "Plese confirm password.!";
			session.setAttribute("confirmpassword", msg);
			response.sendRedirect("student_registration.jsp");
		}
		
		
	}

}
