package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ship;
import iNterface.IShip;
import iNterface.IShipImpl;

/**
 * Servlet implementation class removeShip
 */
@WebServlet("/removeShip")
public class removeShip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IShip ISH = new IShipImpl();
	Ship Ship1 = new Ship();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeShip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent/pages/Ships_Del.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		Ship1.setS_id (Integer.parseInt(request.getParameter("ID")));		
		
		ISH.removeShip(Ship1.S_id);
		request.setAttribute("Ship1", Ship1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent/pages/ShipMS.jsp");
		dispatcher.forward(request, response);
	}

}
