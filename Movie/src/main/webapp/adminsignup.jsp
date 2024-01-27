<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="adminsignup.css">

<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

</head>
<body>

<div class="wrapper">
<form action="signup" method="post">
<h1>AdminSign Up</h1>
<div class="input_box">
<input type="number" name="U_Id" placeholder="Enter Admin Id" required="required">
<i class='bx bxs-id-card'></i>
</div>
<div class="input_box">
<input type="text" name="U_Name" placeholder="Enter Admin Name" required="required">
<i class='bx bxs-user' ></i>
</div>
<div class="input_box">
<input type="tel" name="U_contect" placeholder="Enter Admin Contect" required="required">
<i class='bx bxs-phone' ></i>
</div>
<div class="input_box">
<input type="email" name="U_Email" placeholder="Enter Admin Email" required="required">
	<i class='bx bxs-envelope'></i>
	</div>
	 <div class="input_box">
<input type="password" name="U_Password" placeholder="Enter Admin  Password" required="required">
<i class='bx bxs-user-pin' ></i>
</div>


<button type="submit" class="btn">Sign Up</button>
	<div class="Register_Link">
	<p>Sign Up page Successfully Go To Sign In page?</p>
</div>
</form>
</div>


</body>
</html>