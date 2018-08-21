
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coffee Shop</title>
</head>
<body>

<h3>Welcome to GC COFFEE</h3>


${test}
<a href="/register">Register!</a> 



<table border ="1">

	<c:forEach var="print" items="${items}">
	<tr> 
		<!--  left out title on purpose --> 
			<td> ${print.coffee}</td>
			<td> ${print.price}</td>
			<td> ${print.strength}</td>
		
			<!--  this is url encoding and allows us to pass some data into the link for 
			our controller method -->
			<td><a href = "update?id=${print.coffee}">Update</a></td>
			<td><a href = "delete?id=${print.coffee}">Delete</a></td>
	</tr>
	
	
	</c:forEach>
</table>
<br>

<!--  <form action= "addnewcust">
First Name: <input type ="text" name = "firstName"> <br>
Last Name: <input type = "text" name = "lastName"><br>
Email: <input type = "text" name = "email"><br>
Phone: <input type = "text" name = "phone"><br>
Password: <input type = "text" name = "password">
Confirm Password: <input type = "text" name = "confirmPassword">
<input type = "submit" value = "Add">


</form> -->







</body>
</html>