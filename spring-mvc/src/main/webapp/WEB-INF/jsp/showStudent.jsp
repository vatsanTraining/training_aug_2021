<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<table class="table table-striped">
	<thead>
		<tr>
			<th>Roll Number</th>
			<th>Student Name</th>
			<th>Mark Scored</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${list}" var="eachItem">
		<tr>
		<td>${eachItem.rollNumber}</td>
		<td>${eachItem.studentName}</td>
		<td>${eachItem.markScored}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>