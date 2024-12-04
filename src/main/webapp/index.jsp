<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Learning Management System</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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
          <a class="nav-link" href="#">Courses</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Login
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><form action="login.jsp"><button type="submit" class="dropdown-item" name="role" value="Admin">Admin</button></form></li>
            <li><form action="login.jsp"><button type="submit" class="dropdown-item" name="role" value="Subject Matter Expert">Subject Matter Expert</button></form></li>
            <li><form action="login.jsp"><button type="submit" class="dropdown-item" name="role" value="Teacher">Teacher</button></form></li>
            <li><form action="login.jsp"><button type="submit" class="dropdown-item" name="role" value="Student">Student</button></form></li>
            
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Register</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Hero Section -->
<section class="hero bg-light py-5">
  <div class="container text-center">
    <h1>Welcome to the Learning Management System</h1>
    <p class="lead">Start your journey to knowledge and growth</p>
    <a href="student_registration.jsp" class="btn btn-primary">Get Started as Student</a>
    <a href="teacher_registration.jsp" class="btn btn-primary">Get Started as Teacher</a>
  </div>
</section>

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
