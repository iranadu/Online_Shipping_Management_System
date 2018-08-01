package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Warehouse;
import iNterface.IWarehouse;
import iNterface.IWarehouseImpl;

/**
 * Servlet implementation class viewWarehouse
 */
@WebServlet("/viewWarehouse")
public class viewWarehouse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IWarehouse IWH = new IWarehouseImpl();
	Warehouse Warehouse1 = new Warehouse();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewWarehouse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WebContent/pages/wareh_view.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		Warehouse1.setWH_id (Integer.parseInt(request.getParameter("ID")));
		
		IWH.viewWarehouse(Warehouse1.WH_id);
		
		request.setAttribute("Warehouse1", Warehouse1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WebContent/pages/WarehouseMS.jsp");
		dispatcher.forward(request, response);
	}

}
