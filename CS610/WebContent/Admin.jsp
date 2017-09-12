<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



		<div id="navigation">


			Admin

			<hr />


			<a href="AddEmployee.jsp" class="navigation">AddEmployee</a>
		    <a href="DeleteEmoloyee.jsp" class="navigation">DeleteEmoloyee</a>
            <a href="AdminAddCustomer.jsp" class="navigation">AddCustomer</a>
             <a href="AdminAddInvoice.jsp" class="navigation">AddInvoice</a>           
            <a href="DeleteInvoice.jsp" class="navigation">DeleteInvoice</a>

		</div>

<br><br>

		<div id="content">

			<h1>Admin</h1>

            <br>
            <br>
			<input type="button" value="Back" onclick="history.go(-1);"/>

		</div>







</body>

</html>
