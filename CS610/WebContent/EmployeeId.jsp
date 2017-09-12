<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
jstl is not working 

<sql:setDataSource 
    driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/chinook" 
	user="root" 
	password="123456"
	 />

<sql:query var="s">
 SELECT CustomerId, FirstName, LastName, Email FROM Customer Where CustomerId = ?;
 <sql:param value="${p}"/>
</sql:query>
--%>
<c:import url="Header.jsp"/>
<body>
<c:import url="EmployeeIdNav.jsp"/>
		<br>
		<br>

		<div id="content">
			<h1>Employee</h1>
<%-- 
			<h2>UpdateCustomerInfo </h2>

<%--<form action="EmployeeIdServlet" method="post">
		Search Customer with ID: <input type="text" name="p">
			<input type="submit" value="Search">
	</form>
 --%>	
 <%--	
	<br>
	<br>

	<table>
		<tr>
			<th>Action</th>
			<c:forEach items="${s.columnNames}" var="i">
				<th>${i}</th>
			</c:forEach>
		</tr>
	</table>

		<%-- <c:forEach items="${s.rowsByIndex}" var="row">  --%>
		<%--
		<form action="" method="post">
			CustomerId: <input type="number" name="CustomerId"><br>	 
			LastName:<input type="text" name="LastName"><br>	 
		    FirstName:<input type="text" name="FirstName"><br>
	
		    Email:<input type="text" name="Email"><br>
	
		    <button name="update" type="submit">Update</button>

		</form>
	<%--</c:forEach>  --%>
		<%--	<br>
			<br>

			<p class="onSuccess">${success}</p>
			<p class="onError">${error }</p>
			 --%>
	<br>
	<br>
			<input type="button" value="Back" onclick="history.go(-1);"/>
	
	
	<%-- 
	
			    
		    <input class="itemInput" ${s.columnNames[0]}" value="${row[0]}">
		    <input class="itemInput" style="width: 100px;" type="text" name="${s.columnNames[1]}" value="${row[1]}">
		    <input class="itemInput" style="width: 100px;" type="text" name="${s.columnNames[2]}" value="${row[2]}">
		    <input class="itemInput" style="width: 100px;" type="text" name="${s.columnNames[3]}" value="${row[3]}">
		<c:forEach items="${s.rowsByIndex}" var="row">
		<form action="" method="post">
		    <button name="add" type="submit">Add</button>
		    
		    <input class="itemInput" style="width: 100px;" type="text" name="" value="">
		    <input class="itemInput" style="width: 100px;" type="text" name="" value="">
		    <input class="itemInput" style="width: 100px;" type="text" name="" value="">
		    <input class="itemInput" style="width: 100px;" type="text" name="" value="">
		</form>
	</c:forEach>

	<br>
	<br>
			<input type="button" value="Back" onclick="history.go(-1);"/> 	--%>
			
</body>
</html>