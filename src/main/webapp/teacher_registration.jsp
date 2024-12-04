<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher Registration</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style type="text/css">
    	.confirmpassword{
    		color: red;
    	}
    </style>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setHeader("Expires","0"); 
	%>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    <h4 class="text-center">Teacher Registration</h4>
                </div>
                <div class="card-body">
                    <form action="teacher_registration_controller" method="post">
                        <div class="form-group">
                            <label for="teacher_name">Name</label>
                            <input type="text" class="form-control" id="teacher_name" name="teacher_name" required>
                        </div>
                        <div class="form-group">
                            <label for="teacher_education">Education</label>
                            <input type="text" class="form-control" id="teacher_education" name="teacher_education" required>
                        </div>
                        <div class="form-group">
                            <label for="teacher_address">Address</label>
                            <input type="text" class="form-control" id="teacher_address" name="teacher_address" required>
                        </div>
                        <div class="form-group">
                            <label for="teacher_MobNo">Mobile Number</label>
                            <input type="tel" class="form-control" id="teacher_MobNo" name="teacher_MobNo" required>
                        </div>
                        <div class="form-group">
                            <label for="teacher_email">Email</label>
                            <input type="email" class="form-control" id="teacher_email" name="teacher_email" required>
                        </div>
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>
                        <div class="form-group">
                            <label for="confirmPassword">Confirm Password</label>
                            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
                        </div>
                        <div class="form-group confirmpassword" > 
                        	<%
                            //String message = (String)session.getAttribute("user");
                            if(session.getAttribute("user") != null)
                            {
                                out.println(session.getAttribute("user"));
                            }
                        	%>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                        <% 
                        session.setAttribute("user",null);
                    	%>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
