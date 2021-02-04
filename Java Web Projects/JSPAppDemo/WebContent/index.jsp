<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to HTML Web Page</h1>
<%!int a,b,sum; %>
<%
a=20;
b=30;
sum = a+b;
out.println("Welcome to JSP page");
out.println("<font color=red>sum of two number is "+sum+"</font>");
%>
<br/>
<font color=green>
The value of a <%=a %> and b <%=b %> and its sum is <%=sum %>
</font>
</body>
</html>


