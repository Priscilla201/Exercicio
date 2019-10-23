package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name = "ClientServlet", urlPatterns = { "/client" })

public class HelloClientServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String parametro = req.getParameter("DataCriacao");
		if (parametro == null)
			parametro = req.getAttribute("DataCriacao").toString();
		String idade = req.getParameter("DataCriacao");
		ServletOutputStream out = resp.getOutputStream();
		String saida = "Hello Client " + parametro + " " + idade;
		out.write(saida.getBytes());
		out.flush();
		out.close();
	}

}



