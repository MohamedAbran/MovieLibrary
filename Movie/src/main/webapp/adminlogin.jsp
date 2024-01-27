<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="adminlogin.css">

<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>

<div class="wrapper">
<form action="adminlogin" method="post">
<h1>Admin Login</h1>
<div class="input_box">
	<input type="email" name="U_Email" placeholder="Enater your Email" required="required">
	<i class='bx bxs-envelope'></i>
	</div>
 
 <div class="input_box">
	<input type="password" name="U_Password" placeholder="Enater your Password" required="required">
	
	<i class='bx bxs-lock-alt'></i>
	</div>
	<div class="remember_Forget">
	<label><input type="checkbox">Remember me</label>
	</div>
	<button type="submit" class="btn">Login</button>
	<div class="Register_Link">
	<p>Don't have an account? <a href="adminsignup.jsp">Register</a></p>
	<% String message = (String)request.getAttribute("message");%>
	<% if(message!=null){ %>
	<p1><%= message %></p1>
	<% } %>
	<% String message1 = (String)request.getAttribute("message1");%>
	<% if(message1!=null){ %>
	<p1><%= message1 %></p1>
	<% } %>
	</div>
 	
</form>
</div>


</body>
</html>