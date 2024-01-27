<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="addmovie.css">
</head>
<body>
<div class="wrapper">
<form action="savemovie" method="post" enctype="multipart/form-data">
<h1>Add Movie</h1>
<div class="input_box">
<input type="number" name="M_Id" placeholder="Enter Movie Id">
</div>

<div class="input_box">
<input type="text" name="M_Name" placeholder="Enter Movie Name">
</div>

<div class="input_box">
<input type="number" name="M_Price" placeholder="Enter Movie Price" >
</div>

<div class="input_box">
<input type="number" name="M_Rating" placeholder="Enter Movie Rating">
	</div>
	
	
	<div class="input_box">
<input type="text" name="M_Genre" placeholder="Enter Movie Genre">
	</div>
	
	<div class="input_box">
<input type="text" name="M_Language" placeholder="Enter Movie Language">
	</div>
	
	<div class="input_box">
<input type="file" name="M_Image" placeholder="Enter Movie Image" >
	</div>
	
	
	
	 <button type="submit" class="btn">submit</button>
</div>
</form>
</body>
</html>