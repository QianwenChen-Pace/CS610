<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



<body>
<c:import url="EmployeeIdNav.jsp"/>
		<br>
		<br>

		<div id="content">

			<h1>Employee</h1>

			<h2>AddTrack</h2>
			<form action="AddTrackServlet" method="post">
			TrackId: <input type="text" name="TrackId"><br>	 
			Name:<input type="text" name="Name"><br>
			AlbumId:<input type="number" name="AlbumId"><br>
			MediaTypeId:<input type="text" name="MediaTypeId"><br>	
			GenreId:<input type="number" name="GenreId"><br> 
			Milliseconds:<input type="text" name="Milliseconds"><br>
			Bytes:<input type="number" name="Bytes"><br>
		    UnitPrice:<input type="text" name="UnitPrice"><br>						    
		   <%--
		    
		    Composer:<input type="text" name="Composer"><br> 
		   UnitPrice:<input type="text" name="UnitPrice"><br>--%> 
				<input type="submit" value="Add">
			</form>

			<br>
			<br>

			<p class="onSuccess">${success}</p>
			<p class="onError">${error }</p>
			
			<input type="button" value="Back" onclick="history.go(-1);"/>

		</div>








</body>
</html>