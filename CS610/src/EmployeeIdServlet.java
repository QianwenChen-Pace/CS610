

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class EmployeeIdServlet
 */
@WebServlet("/EmployeeIdServlet")
public class EmployeeIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("server");
//		System.out.println(request.getParameter("p"));
//		System.out.println(request.getParameter("CustomerId"));
		
		if (request.getParameter("p") != null) {
			String p = request.getParameter("p");
			request.setAttribute("p", p);
			request.getRequestDispatcher("EmployeeId.jsp").forward(request,
					response);
			return;
		}
		
		 if (request.getParameter("update") != null) {
			
			String query = "UPDATE Customer SET FirstName = \"" + request.getParameter("FirstName") + 
							"\", LastName = \"" + request.getParameter("LastName") + 
							"\", Email = \"" + request.getParameter("Email") + 
							"\" Where CustomerId = " + request.getParameter("CustomerId");
			
			System.out.println(query);
//		}
//			if (request.getParameter("add") != null) {
//				
//				String Add = "ADD Customer SET FirstName = \"" + request.getParameter("FirstName") + 
//								"\", LastName = \"" + request.getParameter("LastName") + 
//								"\", Email = \"" + request.getParameter("Email") + 
//								"\" Where CustomerId = " + request.getParameter("CustomerId");
//				
//				System.out.println(Add);
			
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
		        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinook?user=root&password=123456");
			    Statement statement = conn.createStatement();
			    statement.executeUpdate(query);
			    
				String success = "The information was updated from the database successfully";
				request.setAttribute("success", success);
				System.out.println("error2");
			} catch (Exception e) {
		         e.printStackTrace();
					String error = "We're having problems with our database, please try again later.";
					request.setAttribute("error", error);
		    }
			
			request.setAttribute("p", request.getParameter("CustomerId"));
			request.getRequestDispatcher("EmployeeId.jsp").forward(request,
					response);
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
