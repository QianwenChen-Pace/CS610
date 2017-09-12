

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int EmployeeId = Integer.parseInt(request.getParameter("EmployeeId"));
		String LastName = request.getParameter("LastName");
		String FirstName =request.getParameter("FirstName");
		String Title =request.getParameter("Title");
		String Email =request.getParameter("Email");
		String Phone =request.getParameter("Phone");
		

	
		
		String url ="jdbc:mysql://localhost:3306/chinook" ;
		String user = "root";
		String password = "123456";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			/* System.out.println("Driver found");			
			String found = "Driver Found";
			request.setAttribute("found", found); */
			
		} catch (ClassNotFoundException e) {
			
		 System.out.println("We're having problems with our database, please try again later." + e);
			
			String error = "Could not find database driver, please try again later.";
			request.setAttribute("error", error);
			
		}
		
		Connection conn = null;
		
		try {
			
			// Get connection
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connected Successfully.");
			
			// Execute query
			String query = "INSERT INTO Employee (EmployeeId, LastName, FirstName, Title, Email, Phone) VALUES (?, ?, ?,?,?,?)";
			
			PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.setInt 		   (1, EmployeeId);
		    preparedStmt.setString 		   (2, LastName);
		    preparedStmt.setString			(3, FirstName);
		    preparedStmt.setString			(4, Title);
		    preparedStmt.setString			(5, Email);
		    preparedStmt.setString			(6, Phone);

			
			preparedStmt.execute();
			
			conn.close();
			
			String success = "The information was added to the database successfully";
			request.setAttribute("success", success);
			
		} catch (Exception e) {
			
			System.out.println(e);
			String error = "We're having problems with our database, please try again later.";
			request.setAttribute("error", error);
			
		} 
		
		// Response Page
		request.getRequestDispatcher("AddEmployee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
