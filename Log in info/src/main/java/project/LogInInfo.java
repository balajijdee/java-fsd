package project;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LogInInfo")
public class LogInInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtuname");
		String password=request.getParameter("txtpassword");
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(uname.equals("balaji")&& password.equals("12345"))
			out.println("Welcome User");
		else
			out.println("Invalid user and password");
		
	}

	
}