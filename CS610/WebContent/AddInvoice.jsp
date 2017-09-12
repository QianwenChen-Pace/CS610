<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



<body>
<c:import url="EmployeeIdNav.jsp"/>
		<br>
		<br>

		<div id="content">

			<h1>Employee</h1>

			<h2>AddInvoice</h2>
			<form action="AddInvoiceServlet" method="post">
			InvoiceId: <input type="number" name="InvoiceId"><br>	 
			CustomerId:<input type="text" name="CustomerId"><br>	 
		    InvoiceDate:<input type="text" name="InvoiceDate"><br>
		    BillingAddress:<input type="text" name="BillingAddress"><br>
		    BillingCity:<input type="text" name="BillingCity"><br>
		    Total:<input type="text" name="Total"><br>
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