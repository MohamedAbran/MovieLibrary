package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserSignup;
@WebServlet("/userlogin")
public class UserLogin extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String mail=req.getParameter("U_Email");
	   
	   String password=req.getParameter("U_Password");
	   
	   UserDao d =new UserDao();
	   
	   try {
		UserSignup user=d.FindEmail(mail);
		
		if(user!=null)
		{
			if(user.getUserassword().equals(password))
			{
			    req.setAttribute("movie",d.getAllMovie());	
				RequestDispatcher rd=req.getRequestDispatcher("userhome.jsp");
			    rd.include(req, resp);
			}
			
			else
			{
				req.setAttribute("message","Wrong Password");
				RequestDispatcher rd=req.getRequestDispatcher("userlogin.jsp");
				rd.include(req, resp);
				
			}
			
			
		}
		else
		{
			req.setAttribute("message","Wrong Password");
			RequestDispatcher rd=req.getRequestDispatcher("userlogin.jsp");
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
