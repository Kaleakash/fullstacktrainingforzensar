<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Delete Employee by Id</h2>
<form action="EmployeeController" method="post">
<label>EmployeeId</label>
<input type="hidden" name="emp" value="delete">
<input type="text" name="id"><br/>
<br/>
<input type="submit" value="Delete Employee Info">
</form>
</body>
</html>