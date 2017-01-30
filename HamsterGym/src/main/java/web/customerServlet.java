package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Lalunaa.HamsterGym.Customer;
import Lalunaa.HamsterGym.Trainer;

@WebServlet("/customerServlet")
public class customerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		customer.setName(request.getParameter("customerName"));
		customer.setSurname(request.getParameter("customerSurname"));
		

		HttpSession session = request.getSession();
		session.setAttribute("customer", customer);
		response.sendRedirect("final.jsp");
	}

}
