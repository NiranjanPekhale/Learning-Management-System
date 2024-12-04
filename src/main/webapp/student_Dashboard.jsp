<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelclass.Student"%>
<%@ page errorPage="error_page.jsp"%>
<%
Student suser = (Student) session.getAttribute("currentuser");

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0
response.setHeader("Expires", "0");

if (suser == null) {
	response.sendRedirect("index.jsp");
}
%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Dashboard</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>

	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#">LMS</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">My
							Courses</a></li>
					<li class="nav-item"><a class="nav-link" href="#">About</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Contact</a>
					</li>
				</ul>
				<ul class=" navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#"
						data-bs-toggle="modal" data-bs-target="#profile-model"><i
							class="fa-solid fa-circle-user"></i>&nbsp;Profile</a></li>
					<li class="nav-item my-2 my-sm-0"><a class="nav-link"
						href="logout_controller"><i
							class="fa-solid fa-right-from-bracket"></i>&nbsp;Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Modal -->
	<div class="modal fade" id="profile-model" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">LMS</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				
				
				<div class="modal-body">
					<div class="container text-center">
						<img src="profile_pic/<%=suser.getProfile()%>" class="img-fluid"
							style="border-radius: 50%; max-width: 100px;"><br>
							<%System.out.println("this is the profile name :"+suser.getProfile()); %>
						<h5><%=suser.getStd_name()%></h5>
						<br>
						<!--  table for details -->
						<div id="showProfile">
							<table class="table">
								<tbody>
									<tr>
										<td>ID:</td>
										<td><%=suser.getStd_id()%></td>
									</tr>
									<tr>
										<td>Username:</td>
										<td><%= suser.getStd_username() %></td>
									</tr>
									<tr>
										<td>Class:</td>
										<td><%=suser.getStd_class()%></td>
									</tr>
									<tr>
										<td>Address:</td>
										<td><%=suser.getStd_address()%></td>
									</tr>
									<tr>
										<td>Email:</td>
										<td><%=suser.getStd_email()%></td>
									</tr>
									<tr>
										<td>Mobail:</td>
										<td><%=suser.getStd_MobNo()%></td>
									</tr>
								</tbody>
							</table>
						</div>

						<!-- table for edit -->
						<div id="editProfile" style="display: none;">
							<form action="editprofile_controller" method="post" enctype="multipart/form-data">
								<table class="table">
									<tbody>
										<tr>
	                                        <td>Profile picture:</td>
	                                        <td><input type="file" class="form-control" name="sprofile"></td>
	                                    </tr>
										<tr>
											<td>ID:</td>
											<td><%=suser.getStd_id()%></td>
										</tr>
										<tr>
											<td>Username:</td>
											<td><input type="text" class="form-control" name="username"
												value="<%=suser.getStd_username()%>"></td>
										</tr>
										<tr>
											<td>Class:</td>
											<td><%=suser.getStd_class()%></td>
										</tr>
										<tr>
											<td>Address:</td>
											<td><input type="text" class="form-control" name="saddress"
												value="<%=suser.getStd_address()%>"></td>
										</tr>
										<tr>
											<td>Email:</td>
											<td><input type="email" class="form-control" name="semail"
												value="<%=suser.getStd_email()%>"></td>
										</tr>
										<tr>
											<td>Mobail:</td>
											<td><input type="text" class="form-control" name="smobail"
												value="<%=suser.getStd_MobNo()%>"></td>
										</tr>
										<tr>
											<td>Password:</td>
											<td><input type="password" class="form-control" name="spassword"
												value="<%=suser.getStd_password()%>"></td>
										</tr>
										
									</tbody>
								</table>
								
								<button type="submit" class="btn btn-primary">Save</button>
								
							</form>
						</div>
						<!-- closing table for edit -->

					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" id="edit-profile">Edit</button>
				</div>
			</div>
		</div>
	</div>
	<!-- closing of modal -->

	<!-- Page content -->
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="jumbotron text-center">
					<h1>
						Welcome
						<%=suser.getStd_name()%></h1>
					<p class="lead">You can access your courses and manage your
						learning journey from here.</p>
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
						<img src="img/error.png" class="card-img-top" alt="Course 1">
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
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

	<script src="https://kit.fontawesome.com/9b33ce5382.js"></script>
	<!--  crossorigin="anonymous" this is extra for font awsome -->
	<script type="text/javascript">
		$(document).ready(function() {
			let editStatus = false;
			$("#edit-profile").click(function() {

				if (editStatus == false) {
					$("#showProfile").hide();
					$("#editProfile").show();

					editStatus = true;

					$(this).text("Back");
				} else {
					$("#showProfile").show();
					$("#editProfile").hide();

					editStatus = false;

					$(this).text("Edit");
				}
			})
		});
	</script>

</body>

</html>