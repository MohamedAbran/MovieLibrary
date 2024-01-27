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
@WebServlet("/usersignup")
public class saveusersignup extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   int id=Integer.parseInt(req.getParameter("U_Id"));
	   String name=req.getParameter("U_Name");
	   long contect=Long.parseLong(req.getParameter("U_contect"));
	   String mail=req.getParameter("U_Email");
	   String password=req.getParameter("U_Password");
	   
	   UserSignup user=new UserSignup();
	   
	   user.setUserid(id);
	   user.setUsername(name);;
	   user.setUsercontect(contect);
	   user.setUsermail(mail);
	   user.setUserpassword(password);
	   
	   UserDao d=new UserDao();
	   
	   try {
		int res=d.saveUser(user);
		if(res>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("userlogin.jsp");
			rd.include(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("usersignup.jsp");
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
