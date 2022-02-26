import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Authenticated extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			out.print("<h1>GO AWAY</h1>");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			String admin = "";
			String username = "";
			Cookie c[] = req.getCookies();

			if (c.length > 0) {

				admin = c[0].getValue();
				username = c[1].getValue();

				if (username != "") {
					out.print("<h1>Hello " + username +"</h1>");
				}
				else {
					out.print("<h1>Hello Anonymous !</h1>");
				}

				if (admin.equals("true")) {
					out.print("We know it's you Rootz!");
				} else {
					out.print("We don't Trust You! <br/> <a href='/rootz-web/login'>Go Back</a>");
				}

			}
			else {
				out.print("You Are Not Logged in!");
				res.sendRedirect("Login");
			}

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}