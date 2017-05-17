package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SResponsavelVenda;

/**
 * Servlet implementation class HResponsavelVenda
 */
@WebServlet("/HResponsavelVenda")
public class HResponsavelVenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private SResponsavelVenda servRVenda;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HResponsavelVenda() {
        super();
        servRVenda = new SResponsavelVenda();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}