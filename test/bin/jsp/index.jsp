<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is my JSP page</h1>
	<% out.println(2*5); %>
	<%= "Welcome Bao to JSP" %>
	<br>
	<%= "Welcome "+request.getParameter("uname") %>   
	<br>
	Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<br>
	<form action="welcome.jsp">  
		<input type="text" name="uname"><br/>  
		<input type="submit" value="go">  
	</form>  
	<br>
	<%! int data = 50; %>
	<%! String name ="Bao"; %>
	<%= "Value of the varialbe is : " +name +" and " +data %>
</body>
</html>