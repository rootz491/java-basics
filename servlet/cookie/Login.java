import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.print("<h1>Login Form</h1><form action='login' method='post'>  <label>username:</label><input type='text' name='username'/><br/>  <label>password</label><input type='password' name='password'><br><input type='submit' value='login' /></form>");
			out.close();	
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");

			PrintWriter out = res.getWriter();

			String username = req.getParameter("username");  
			String password = req.getParameter("password");  

			out.print("<h1>Hii " + username + "</h1>");

			if (username.equals("admin") && password.equals("karansh491")) {
				Cookie u = new Cookie("username", username);
				Cookie c = new Cookie("admin", "true");
				c.setMaxAge(60);
				u.setMaxAge(60);
				out.print("<p> Good to see you back !!! </p>");

				//	this form will make request to second servlet!
				out.print("<form action='user' method='post'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");
			    res.addCookie(c);
			    res.addCookie(u);

			}
			else {
				out.print("<p> Wrong Password !!! </p>");
				out.print("<a href=''>retry</a>");
			}

		    out.close();

		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

