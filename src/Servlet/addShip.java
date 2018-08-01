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
@WebServlet("/addShip")

public class addShip extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	IShip ISH = new IShipImpl();
	Ship Ship1 = new Ship();
       
    public addShip() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent/pages/Ships.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

				
		Ship1.setS_id (Integer.parseInt(request.getParameter("ID")));
		Ship1.setS_Name(request.getParameter("Name"));
		Ship1.setS_Type (Integer.parseInt(request.getParameter("Type")));
		Ship1.setS_Captain_Name(request.getParameter("Captain Name"));
		Ship1.setS_Capacity(Integer.parseInt(request.getParameter("Capacity")));
		

		
		ISH.addShip(Ship1);
		
		request.setAttribute("Ship1", Ship1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent/pages/Ship.jsp");
		dispatcher.forward(request, response);
		
	}

}

	


