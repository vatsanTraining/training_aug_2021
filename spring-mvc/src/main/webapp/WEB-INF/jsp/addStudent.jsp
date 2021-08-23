<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="students" method="post" modelAttribute="commie">

<label>Roll Number</label>
<form:input path="rollNumber"/>

<label>Student Name</label>
<form:input path="studentName"/>

<label>Mark Scored</label>
<form:input path="markScored"/>


<input type="submit" value="add">

</form:form>
</body>
</html>