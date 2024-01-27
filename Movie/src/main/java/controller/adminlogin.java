package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.AdminSignup;
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String adminemail=req.getParameter("U_Email");
	   String adminpassword=req.getParameter("U_Password");
	   
	   Dao d=new Dao();
	   
	   try {
		AdminSignup admin=d.FindByEmail(adminemail);
		
		if(admin!=null)
		{
			if(admin.getAdminpassword().equals(adminpassword))
			{
				req.setAttribute("movie",d.getAllMovie());
			   RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			   rd.include(req, resp);
			}
			else
			{
				req.setAttribute("message","Password is Wronng");
				RequestDispatcher rd=req.getRequestDispatcher("adminlogin.jsp");
				rd.include(req, resp);
			}
		}
		
		else
		{
			req.setAttribute("message1", "Email is Wrong");
			RequestDispatcher rd=req.getRequestDispatcher("adminlogin.jsp");
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
