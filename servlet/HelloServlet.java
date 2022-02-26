import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet {
   	public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
	    res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	    out.println("<html><body>");
	    out.println("<p>Hello World! -- From Servlet</p>");
	    out.println("</body></html>");
	    out.close();
   }
}

