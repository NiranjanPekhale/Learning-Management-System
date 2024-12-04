package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelclass.Admin;
//import org.apache.catalina.connector.OutputBuffer;
import modelclass.Message;
import modelclass.Student;
import modelclass.Teacher;
import repository.Admin_DAO;
import repository.Student_DAO;
import repository.Teacher_DAO;


@WebServlet("/login_controller")
public class login_controller extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String role=(String)session.getAttribute("role");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Student suser=null;
		Teacher tuser=null;
		Admin auser=null;
		
		//for student login
		if(role.equals("Student"))
		{
			Student_DAO std_DAO = new Student_DAO();
			suser = std_DAO.getStudentForLogin(username, password);
		}		
		//for teacher login
		else if(role.equals("Teacher"))
		{
			Teacher_DAO teacher_DAO = new Teacher_DAO();
			tuser = teacher_DAO.getTeacheForLogin(username, password);
		}
		
		//for admin login
		else if(role.equals("Admin"))
		{
			Admin_DAO admin_DAO = new Admin_DAO();
			auser = admin_DAO.find(username, password);
		}
		
		if(suser != null || tuser != null || auser != null) {
			//login error
			if(suser != null) {
				session.setAttribute("currentuser", suser);
				response.sendRedirect("student_Dashboard.jsp");	
			}
			else if(tuser != null){
				session.setAttribute("currentuser", tuser);
				response.sendRedirect("teacher_Dashboard.jsp");
			}
			else if(auser != null){
				session.setAttribute("currentuser", auser);
				response.sendRedirect("Admin_Dashboard.jsp");
			}
			
		}
		else {
			//login success...
			
			Message msg = new Message("Invalid Credentials.!", "error", "alert-danger");
//			out.println("Invalid details.!");
//			String msg = "Invalid Credentials.!";
			session.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
//		Student_DAO std_DAO = new Student_DAO();
//		String user = std_DAO.forLogin(username, password);
//		
//		Teacher_DAO teacher_DAO = new Teacher_DAO();
//		String tuser = teacher_DAO.forLogin(username, password);
//		
//		if(user.equals(username) || tuser.equals(username)) {
//			if(user != "fails") {
//				session.setAttribute("user", user);
//				response.sendRedirect("student_Dashboard.jsp");	
//			}
//			else {
//				session.setAttribute("user", tuser);
//				response.sendRedirect("student_Dashboard.jsp");
//			}
//		}
//		else {
//			String msg = "Invalid Credentials.!";
//			session.setAttribute("msg", msg);
//			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//			rd.forward(request, response);
//		}
	}

}
