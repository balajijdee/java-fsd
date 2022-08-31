package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public StudentDAO() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			int marks = Integer.parseInt(request.getParameter("txtmarks"));
			String name = request.getParameter("txtName");
			// put values in Object
			Student stud = new Student();
			stud.setMarks(marks);
			stud.setName(name);
			//create connection
			Configuration config=new Configuration();
			SessionFactory sessionFactory=config.configure("/project/hibernate.cfg.xml").buildSessionFactory();
			
			//open connection
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			//save object as record
			int i=(Integer)session.save(stud);
			session.getTransaction().commit();

			session.close();
			PrintWriter out = response.getWriter();
			if (i > 0)
				out.println("Record inserted");
			else
				out.println("Record not inserted");


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
