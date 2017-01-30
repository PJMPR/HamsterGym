package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Lalunaa.HamsterGym.Activities;
import Lalunaa.HamsterGym.Customer;
import Lalunaa.HamsterGym.Trainer;
import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;

@WebServlet("/dbServlet")
public class dbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public dbServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			IUnitOfWork uow = new UnitOfWork(connection);
			IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
			HttpSession session = request.getSession();
		    Trainer trainer = (Trainer) session.getAttribute("trainer");
		    Activities activities = (Activities) session.getAttribute("activities");
		    Customer customer = (Customer) session.getAttribute("customer");
			catalog.Trainers().add(trainer);
			catalog.save();
			int trainerId = catalog.Trainers().getLastId();
			trainer.setId(trainerId);
			activities.setTrainer(trainer);
			catalog.Activities().add(activities);
			catalog.save();
			catalog.Customers().add(customer);
			catalog.save();
			session.removeAttribute("trainer");
		    session.removeAttribute("activities");
		    session.removeAttribute("customer");
			response.sendRedirect("index.html");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}