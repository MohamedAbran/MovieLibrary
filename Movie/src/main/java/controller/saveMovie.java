package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;
import dto.Movie;
@WebServlet("/savemovie")
@MultipartConfig(maxFileSize = 5* 1024*1024)
public class saveMovie extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	  int movieid=Integer.parseInt(req.getParameter("M_Id"));
	  
	  String moviename=req.getParameter("M_Name");
	  double movieprice=Double.parseDouble(req.getParameter("M_Price"));
	  double movierating=Double.parseDouble(req.getParameter("M_Rating"));
	  String moviegenre=req.getParameter("M_Genre");
	  String movielanguage=req.getParameter("M_Language");
	  Part imagepart =req.getPart("M_Image");
	  
	  Movie movie=new Movie();
	  
	  movie.setMovieid(movieid);
	  movie.setMoviename(moviename);
     movie.setMovieprice(movieprice);
     movie.setMovierating(movierating);
     movie.setMoviegenre(moviegenre);
     movie.setMovielanguage(movielanguage);
     movie.setMovieimage(imagepart.getInputStream().readAllBytes());
     
     Dao d=new Dao();
     
     try {
		int res=d.saveMovie(movie);
		if(res>0)
		{
			req.setAttribute("movie",d.getAllMovie());
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.include(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("addmovie.jsp");
			rd.include(req, resp);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     
	  
	  
	  
  }
}
