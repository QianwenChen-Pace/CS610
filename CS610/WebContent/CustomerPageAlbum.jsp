<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- jstl is not working --%>

<sql:setDataSource 
    driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/chinook" 
	user="root" 
	password="123456"
	 />

<sql:query var="s">
 SELECT AlbumId, Title, ArtistId FROM Album Where AlbumId = ?;
 <sql:param value="${p}"/>
</sql:query>

<c:import url="Header.jsp"/>

<body>
<c:import url="Navigation.jsp"/>
		<br>
		<br>

		<div id="content">
			<h1>Customer</h1>

			
	<h2>Album</h2>
	<form action="CustomerPageAlbumServlet" method="post">
		Search AlbumID : <input type="text" name="p">
		<input type="submit" value="Search">
	</form>
	
	<br>
	<br>

	<table>
		<tr>
			<c:forEach items="${s.columnNames}" var="i">
				<th>${i}</th>
			</c:forEach>
		</tr>

		<c:forEach items="${s.rowsByIndex}" var="row">
			<tr>
				<c:forEach items="${row}" var="col">
					<td>${col}</td>
				</c:forEach>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>
			<input type="button" value="Back" onclick="history.go(-1);"/>
</div>
</body>
</html>