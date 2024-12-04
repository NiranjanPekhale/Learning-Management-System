<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Learning Management System - Registration</title>
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
                    <h4 class="text-center">Registration</h4>
                </div>
                <div class="card-body">
                    <form action="std_registration_Controller" method="post">
                        <div class="form-group">
                            <label for="std_name">Name</label>
                            <input type="text" class="form-control" id="std_name" name="std_name" required>
                        </div>
                        <div class="form-group">
                            <label for="std_class">Class</label>
                            <input type="text" class="form-control" id="std_class" name="std_class" required>
                        </div>
                        <div class="form-group">
                            <label for="std_address">Address</label>
                            <input type="text" class="form-control" id="std_address" name="std_address" required>
                        </div>
                        <div class="form-group">
                            <label for="std_email">Email</label>
                            <input type="email" class="form-control" id="std_email" name="std_email" required>
                        </div>
                        <div class="form-group">
                            <label for="std_MobNo">Mobile Number</label>
                            <input type="tel" class="form-control" id="std_MobNo" name="std_MobNo" required>
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
                            if(session.getAttribute("confirmpassword") != null)
                            {
                                out.println(session.getAttribute("confirmpassword"));
                            }
                        	%>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                        <% 
                        session.setAttribute("confirmpassword",null);
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
