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
<body background="https://zapodaj.net/images/068581a0cd430.jpg" bgproperties="fixed"><br/>
<form enctype="text/plain">

<img src="https://zapodaj.net/images/4e317d5aaa222.png" alt="Dane Zajęć" /><br/><br/>
		<img src="https://zapodaj.net/images/2f29b1b91d415.png" alt="Nazwa" /> <br/>
				<input name = "name" value = "" /> <br />
    	<img src="https://zapodaj.net/images/779aeb478ec65.png" alt="Dzień Tygodnia" /> <br/>
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
                    </select> <br/>
		<img src="https://zapodaj.net/images/58e8f18e25db5.png" alt="Godzina" /><br/>
				<input name = "time" value = "" /> <br />
		<img src="https://zapodaj.net/images/7563bf1204a54.png" alt="Czas Trwania" />	<br/>
				<input name = "duration" value = "" /> <br />
		<img src="https://zapodaj.net/images/d999a01da244a.png" alt="Rozmiar Grupy" /><br/>
				<input name = "groupSize" value = "" /> <br />
                   
		<img src="https://zapodaj.net/images/a675cad215213.png" alt="Opis" /><br/>
				<input type="text" name = "description" value = "" /> <br /><br/><br/>
				
		<input type = "submit" formaction="activitiesServlet" value = "Utwórz!" /> <br />
        </form>              
        </div>
</body>
</html>