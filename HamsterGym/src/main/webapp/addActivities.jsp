<%@page import="java.util.Arrays"%>
<%@page import="Lalunaa.HamsterGym.Day"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<form enctype="text/plain">

		Nazwa: <br />
				<input name = "name" value = "" /> <br />
    	Dzień tygodnia: <br />
                <select name="day">
                        <%
                        try {
                        	List<Day> days = Arrays.asList(Day.values());
                           for(Day day:days){
                        %><option value="<%=day%>"><%=day%></option>
                        <%
                           }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        %>
                    </select> </br>
		Godzina: <br />
				<input name = "time" value = "" /> <br />
		Czas trwania:		
				<input name = "duration" value = "" /> <br />
		Rozmiar grupy: <br />
				<input name = "groupSize" value = "" /> <br />
                   
		Opis: <br />
				<input name = "description" value = "" /> <br />
				
		<input type = "submit" formaction="activitiesServlet" value = "Utwórz!" /> <br />
        </form>              
        </div>
</body>
</html>