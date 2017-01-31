<%@page import="Lalunaa.HamsterGym.Customer"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<body background="https://zapodaj.net/images/e123964962f81.jpg" bgproperties="fixed">
	<%
	    
	    Customer customer = (Customer) session.getAttribute("customer");
	%>
	<font color="white"><font face="Verdana"><br/>
	<h1>Klient</h1><br/>
	<h2>Imie: <%=customer.getName() %></h2>
	<h2>Nazwisko: <%=customer.getSurname() %></h2>
	<form action="customerDbServlet" method="get"><br/><br/>
	<input type="submit" value="Zapisz">
	</form></font></font>
</body>
</html>