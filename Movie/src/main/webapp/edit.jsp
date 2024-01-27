<%@page import="java.util.Base64"%>
<%@page import="dto.Movie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="edit.css">
</head>
<body>
<% Movie m =(Movie)request.getAttribute("movie"); %>
<div class="wrapper">
<form action="edit" method="post" enctype="multipart/form-data">
<h1>Add Movie</h1>
<div class="input_box">
<input type="number" name="M_Id" placeholder="Enter Movie Id" value="<%= m.getMovieid()%>" readonly="readonly">
</div>

<div class="input_box">
<input type="text" name="M_Name" placeholder="Enter Movie Name" value="<%= m.getMoviename()%>">
</div>

<div class="input_box">
<input type="number" name="M_Price" placeholder="Enter Movie Price" value="<%= m.getMovieprice()%>">
</div>

<div class="input_box">
<input type="number" name="M_Rating" placeholder="Enter Movie Rating" value="<%= m.getMovierating()%>"> 
	</div>
	
	
	<div class="input_box">
<input type="text" name="M_Genre" placeholder="Enter Movie Genre" value="<%= m.getMoviegenre()%>">
	</div>
	
	<div class="input_box">
<input type="text" name="M_Language" placeholder="Enter Movie Language" value="<%= m.getMovielanguage()%>">
	</div>
	
	<div class="input_box">
<input type="file" name="M_Image" placeholder="Enter Movie Image" >
	</div>
	
	
	
	 <button type="submit" class="btn">submit</button>


<% String base64 = new String(Base64.getEncoder().encode(m.getMovieimage()));%>
<img  src="data:image/jpeg;base64, <%= base64%>" height="100px" width="100px">

</form>
</body>
</html>