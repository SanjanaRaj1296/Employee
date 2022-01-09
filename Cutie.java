package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;

public class Cutie extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();

		String name = req.getParameter("uname");
		String password = req.getParameter("upass");

		writer.println("<h1>Logged in</h1>");

		User user = new User();
		user.setUsername(name);
		user.setPassword(password);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("san");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(user);
		transaction.commit();
	}

}
