
<%@page import="Lalunaa.HamsterGym.Activities"%>
<%@page import="Lalunaa.HamsterGym.Trainer"%>
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
	    Trainer trainer = (Trainer) session.getAttribute("trainer");
	    Activities activities = (Activities) session.getAttribute("activities");
	    
	%>
	<font color="white"><font face="Verdana"><br/>
	<b><h1>Zajęcia</h1></b>
	<h2>Nazwa: <%=activities.getType() %></h2>
	<h2>Opis: <%=activities.getDescription() %></h2>
	<h2>Dzień tygodnia: <%=activities.getDay() %></h2>
	<h2>Godzina rozpoczęcia: <%=activities.getTime() %></h2>
	<h2>Czas trwania: <%=activities.getDuration() %></h2>
	<h2>Wielkość grupy: <%=activities.getGroupSize() %></h2></br>
	<b></b><h1>Trener</h1></b>
	<h2>Imie: <%=trainer.getName() %></h2>
	<h2>Nazwisko: <%=trainer.getSurname() %></h2>
	</font></font>
	<form action="dbServlet" method="get"><br/><br/>
	<input type="submit" value="Zapisz">
	</form>
</body>
</html>