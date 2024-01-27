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
@WebServlet("/signup")
public class saveadmin extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   int id=Integer.parseInt(req.getParameter("U_Id"));
	   
	   String name=req.getParameter("U_Name");
	   
	   long contect=Long.parseLong(req.getParameter("U_contect"));
	   
	   String mail=req.getParameter("U_Email");
	   
	   String password=req.getParameter("U_Password");
	   
	   AdminSignup admin=new AdminSignup();
	   
	   admin.setAdminid(id);
	   admin.setAdminname(name);
	   admin.setAdmincontect(contect);
	   admin.setAdminmail(mail);
	   admin.setAdminpassword(password);
	   
	   Dao d=new Dao();
	   
	  try {
		int res=d.saveAdmin(admin);
		if(res>0)
		{
			req.setAttribute("movie",d.getAllMovie());
			RequestDispatcher rd=req.getRequestDispatcher("adminlogin.jsp");
			rd.include(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("adminsignup.jsp");
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
