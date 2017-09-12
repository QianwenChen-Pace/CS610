<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



<body>
<c:import url="AdminNav.jsp"/>
		<br>
		<br>

		<div id="content">

			<h1>Admin</h1>

			<h2>AddEmployee</h2>
			<form action="AddEmployeeServlet" method="post">
			EmployeeId: <input type="number" name="EmployeeId"><br>	 
			LastName:<input type="text" name="LastName"><br>	 
		    FirstName:<input type="text" name="FirstName"><br>
		    Title:<input type="text" name="Title"><br>
		    Email:<input type="text" name="Email"><br>
		    Phone:<input type="text" name="Phone"><br>
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