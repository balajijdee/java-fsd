package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkvalue
 */
@WebServlet("/checkvalue")
public class checkvalue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  public checkvalue() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 PreparedStatement p = null;
		        ResultSet rs = null;
		        PrintWriter out=response.getWriter();
		        try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
	            Connection co1 = null;
				try {
					co1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/balaji","root", "Balaji@1");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        try {
		 
		            String sql = "SELECT * FROM balaji.shopproducts;";
		            p = co1.prepareStatement(sql);
		            rs = p.executeQuery();
		            out.println("Id\t\tProduct name\t");
		            while (rs.next()) {
		 
		                int id = rs.getInt("productid");String name = rs.getString("productname");
		                out.println(id + "\t\t" +name+ "\t\t" );
		            }
		        }
		 
		        // Catch block to handle exception
		        catch (SQLException e) {
		 
		            // Print exception pop-up on screen
		            out.println(e);
		        }
		    }
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}


	}
