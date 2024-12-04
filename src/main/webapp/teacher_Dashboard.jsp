<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="modelclass.Teacher" %>
<%@ page errorPage="error_page.jsp" %>

<%

		Teacher tuser = (Teacher)session.getAttribute("currentuser"); 
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setHeader("Expires","0"); 
		
		if(tuser == null)
        {
            response.sendRedirect("index.jsp");
        }
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher Dashboard</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
	
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">LMS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">My Courses</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout_controller">Logout</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Register</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Page content -->
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="jumbotron text-center">
                    <h1>Welcome <%=  tuser.getTeacher_name() %></h1>
                    <p class="lead">You can access your courses and manage your learning journey from here.</p>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Featured Courses Section -->
	<section class="featured-courses py-5">
	  <div class="container">
	    <h2 class="text-center mb-4">Featured Courses</h2>
	    <div class="row">
	      <div class="col-md-4 mb-4">
	        <div class="card">
	          <img src="course-image-1.jpg" class="card-img-top" alt="Course 1">
	          <div class="card-body">
	            <h5 class="card-title">Course 1</h5>
	            <p class="card-text">This is a brief description of Course 1.</p>
	            <a href="#" class="btn btn-primary">Enroll Now</a>
	          </div>
	        </div>
	      </div>
	      <div class="col-md-4 mb-4">
	        <div class="card">
	          <img src="course-image-2.jpg" class="card-img-top" alt="Course 2">
	          <div class="card-body">
	            <h5 class="card-title">Course 2</h5>
	            <p class="card-text">This is a brief description of Course 2.</p>
	            <a href="#" class="btn btn-primary">Enroll Now</a>
	          </div>
	        </div>
	      </div>
	      <div class="col-md-4 mb-4">
	        <div class="card">
	          <img src="course-image-3.jpg" class="card-img-top" alt="Course 3">
	          <div class="card-body">
	            <h5 class="card-title">Course 3</h5>
	            <p class="card-text">This is a brief description of Course 3.</p>
	            <a href="#" class="btn btn-primary">Enroll Now</a>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</section>

    <!-- Footer -->
    <footer class="bg-dark text-light py-3">
        <div class="container text-center">
            <p>&copy; 2023 Learning Management System. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>