<%@page import="java.util.Base64"%>
<%@page import="dto.Movie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



</head>
<style>

table,th,td{
border-collapse: collapse;
height: 100px;
width: 100px;
border-color: black;
text-align: center;
font-weight: bold;
font-size: 35px;
color: white;
border-color: black;
border-bottom-width: 25px;





}
table{
align-content: center;
height: 70%;
width: 70%;

}

body{
   background-image: url("https://thumbs.dreamstime.com/b/movie-slate-film-reel-wood-clapper-wooden-backgorund-36502412.jpg");
   background-size: cover;
	background-position: center;
}



.add a {
	text-decoration: none;
	color: blue;
	/*width: 0;*/
	display: block;
	padding: 25px 20px;
	text-transform: uppercase;
	font-weight: bold;
	font-family: arial;
	text-align: center;
	font-size: 20px;
}

h1{
text-align: center;
background-color: none;
}

</style>



<body>


<h1>Welcome</h1>





<% List<Movie> movie = (List)request.getAttribute("movie"); %>
<table border="2px" align="center"  border-collapse: collapse>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
<th>rating</th>
<th>genere</th>
<th>Language</th>
<th>Image</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<% for(Movie m:movie) { %>

<tr>

<td><%= m.getMovieid()%></td>
<td> <%=m.getMoviename()%></td>
<td><%=m.getMovieprice() %></td>
<td><%=m.getMovierating() %></td>
<td><%=m.getMoviegenre() %></td>
<td><%=m.getMovielanguage() %></td>
<% String base64image= new String(Base64.getEncoder().encode(m.getMovieimage())); %>
<td><img src="data:image/jpg;base64,<%= base64image %>" height="100px" width="100px"></td>

<td><a href="deletemovie?id=<%= m.getMovieid()%>">delete</a></td>

<td><a href="editmovie?id=<%= m.getMovieid()%>">Edit</a></td>
</tr>

<% } %>

</table>



<div class="add">
<a href="addmovie.jsp">Add Movie</a>
</div>




</body>
</html>