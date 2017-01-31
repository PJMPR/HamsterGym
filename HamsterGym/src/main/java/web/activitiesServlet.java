package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Lalunaa.HamsterGym.Activities;
import Lalunaa.HamsterGym.Day;
import Lalunaa.HamsterGym.Trainer;



@WebServlet("/activitiesServlet")
public class activitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Activities activities = new Activities();
		activities.setType(request.getParameter("name"));
		activities.setDay(request.getParameter("day"));
		activities.setTime(request.getParameter("time"));
		activities.setDuration(request.getParameter("duration"));
		activities.setGroupSize(Integer.parseInt(request.getParameter("groupSize")));
		activities.setDescription(request.getParameter("description"));

		HttpSession session = request.getSession();
		session.setAttribute("activities", activities);
		response.sendRedirect("tafinal.jsp");
	}

}
