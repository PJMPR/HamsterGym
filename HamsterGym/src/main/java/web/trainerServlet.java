package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Lalunaa.HamsterGym.Activities;
import Lalunaa.HamsterGym.Trainer;

@WebServlet("/trainerServlet")
public class trainerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Trainer trainer = new Trainer();
		trainer.setName(request.getParameter("trainerName"));
		trainer.setSurname(request.getParameter("trainerSurname"));
		

		HttpSession session = request.getSession();
		session.setAttribute("trainer", trainer);
		response.sendRedirect("addActivities.jsp");
	}

}
