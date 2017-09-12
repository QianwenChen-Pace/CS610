<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



<body>
<c:import url="AdminNav.jsp"/>
		<br>
		<br>

		<div id="content">

			<h1>Admin</h1>

			<h2>DeleteEmployee</h2>
			<form action="DeleteEmployeeServlet" method="post">
			EmployeeId: <input type="number" name="EmoloyeeId"><br>	 
				<input type="submit" value="Delete">
			</form>

			<br>
			<br>

			<p class="onSuccess">${success}</p>
			<p class="onError">${error }</p>

			<input type="button" value="Back" onclick="history.go(-1);"/>

		</div>







</body>
</html>