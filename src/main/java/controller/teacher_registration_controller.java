package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelclass.Teacher;
import repository.Teacher_DAO;

//To generate the Student id 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/teacher_registration_controller")
public class teacher_registration_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Teacher_DAO teacher_DAO = new Teacher_DAO();
       
   

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
		
		String teacher_id = generatedId;
		String teacher_name = request.getParameter("teacher_name");
		String teacher_education = request.getParameter("teacher_education");
		String teacher_address = request.getParameter("teacher_address");
		String teacher_MobNo = request.getParameter("teacher_MobNo");
		String teacher_email = request.getParameter("teacher_email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		if(password.equals(confirmPassword)) {
			
			Teacher teacher = new Teacher();
			teacher.setTeacher_id(teacher_id);
			teacher.setTeacher_name(teacher_name);
			teacher.setTeacher_education(teacher_education);
			teacher.setTeacher_address(teacher_address);
			teacher.setTeacher_MobNo(teacher_MobNo);
			teacher.setTeacher_email(teacher_email);
			teacher.setUsername(username);
			teacher.setPassword(password);
			
			boolean i = teacher_DAO.insert(teacher);
			
			if(i == true) {
				session.setAttribute("user", teacher_name);
				response.sendRedirect("login.jsp");
			}
			else {
				String msg = "Registration fails.!";
				session.setAttribute("user", msg);
				response.sendRedirect("teacher_registration.jsp");
			}
			
		}
		else {
			
			String msg = "Plese confirm password.!";
			session.setAttribute("confirmpassword", msg);
			//response.sendRedirect("teacher_registration.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("teacher_registration.jsp");
			rd.forward(request, response);
		}
		
	}

}
