<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%



%>
<%!String user,pass;%>
<%
user = request.getParameter("user");
pass = request.getParameter("pass");
if(user.equals("Raj") && pass.equals("123")){
	out.println("Successfully Login!");
	%>
	<jsp:forward page="Home.jsp"></jsp:forward>
	<%
}else {
	out.println("Failure try once again!");
			%>
			<jsp:include page="Login.jsp"></jsp:include>
			<%
}
%>
</body>
</html>