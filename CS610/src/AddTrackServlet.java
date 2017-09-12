

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
@WebServlet("/AddTrackServlet")
public class AddTrackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTrackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int TrackId = Integer.parseInt(request.getParameter("TrackId"));
		String Name = request.getParameter("Name");
		int AlbumId =Integer.parseInt(request.getParameter("AlbumId"));
		int MediaTypeId = Integer.parseInt(request.getParameter("MediaTypeId"));
		int GenreId =Integer.parseInt(request.getParameter("GenreId"));
		int Milliseconds = Integer.parseInt(request.getParameter("Milliseconds"));	
		String UnitPrice =request.getParameter("UnitPrice");
//		
//		
//		String Composer =request.getParameter("Composer");

		

	
		
		String url ="jdbc:mysql://localhost:3306/chinook" ;
		String user = "root";
		String password = "123456";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			/* System.out.println("Driver found");			
			String found = "Driver Found";
			request.setAttribute("found", found); */
			
		} catch (ClassNotFoundException e) {
			
			// System.out.println("We're having problems with our database, please try again later." + e);
			
			String error = "Could not find database driver, please try again later.";
			request.setAttribute("error", error);
			
		}
		
		Connection conn = null;
		
		try {
			
			// Get connection
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connected Successfully.");
			
			// Execute query
			String query = "INSERT INTO Track (TrackId, Name, AlbumId, MediaTypeId, GenreId, Milliseconds, UnitPrice) VALUES (?,?,?, ?,?,?,?)";
			
			PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.setInt 		   (1, TrackId);
		    preparedStmt.setString 		   (2, Name);
		    preparedStmt.setInt			   (3, AlbumId);
		    preparedStmt.setInt 		   (4, MediaTypeId);	
		    preparedStmt.setInt			   (5, GenreId);
		    preparedStmt.setInt 		   (6, Milliseconds);	
		    preparedStmt.setString			(7, UnitPrice);
//		    
//		    
//		    preparedStmt.setString			(5, Composer);
		  
			
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
		request.getRequestDispatcher("AddTrack.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
