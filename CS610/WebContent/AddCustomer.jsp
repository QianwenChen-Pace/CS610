<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



<body>
<c:import url="EmployeeIdNav.jsp"/>
		<br>
		<br>

		<div id="content">

			<h1>Employee</h1>

			<h2>AddCustomer</h2>
			<form action="AddCustomerServlet" method="post">
			CustomerId: <input type="number" name="CustomerId"><br>	 
			LastName:<input type="text" name="LastName"><br>	 
		    FirstName:<input type="text" name="FirstName"><br>
		    Address:<input type="text" name="Address"><br>
		    Email:<input type="text" name="Email"><br>
		    City:<input type="text" name="City"><br>
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