import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerPageGenreIdServlet
 */
@WebServlet("/InvoiceServlet")
public class InvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InvoiceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String p = request.getParameter("p");
		
		request.setAttribute("p", p);
		/*
		String url = "jdbc:mysql://localhost:3306/chinook";
		String user = "root";
		String password = "123456";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			/*
			 * System.out.println("Driver found"); String found =
			 * "Driver Found"; request.setAttribute("found", found);
			 

		} catch (ClassNotFoundException e) {

			// System.out.println("We're having problems with our database, please try again later."
			// + e);

			String error = "Could not find database driver, please try again later.";
			request.setAttribute("error", error);

		}

		Connection conn = null;

		try {

			String p = request.getParameter("p");
			System.out.println(p);

			// Get connection
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("Connected Successfully.");

			// Create statement
						Statement myStmt = conn.createStatement();
						
						// Execute query
						
						
						// String query = "SELECT * FROM Artist WHERE Name = '" + search + "'";
						ResultSet myRs = myStmt.executeQuery("SELECT * FROM Genre Where Name = " + p + ";");
						
						// Process result
						while( myRs.next() ) {
							System.out.println(myRs.getString("Name"));
						}
						
		} catch (Exception e) {

			// System.out.println(e);
			String error = "We're having problems with our database, please try again later.";
			request.setAttribute("error", error);

		}
		*/

		// Response Page
		request.getRequestDispatcher("Invoice.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
