package servlet_login_validation_controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

import org.apache.catalina.ha.backend.Sender;

import servlet_login_validation_dao.Employeedao;
import servlet_login_validation_dto.Employeedto;

@WebServlet("/login")
public class Emplogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String email=req.getParameter("emailid");
		String pwd=req.getParameter("pwd");
		int pwd1=Integer.parseInt(pwd);
		
		Employeedao dao= new Employeedao();
	Employeedto	e1=dao.login(email);
	
	if(e1!=null) {
		if(e1.getPwd()==pwd1) {
			//resp.getWriter().print("<h1>welcome to homepage</h1>");
		resp.sendRedirect("https://www.instagram.com");
		}else
			resp.getWriter().print("<h1>invalid password</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, resp);
	  }else {
		  resp.getWriter().print("<h1>Account not found,please signup</h1><a href='signup.html'>click here to signup</a>");
	  }
		
	}

}
