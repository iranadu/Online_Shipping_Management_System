package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import iNterface.IEmployee;
import iNterface.IEmployeeImpl;

/**
 * Servlet implementation class removeEmployee
 */
@WebServlet("/removeEmployee")
public class removeEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 IEmployee IEmp = new IEmployeeImpl();
	 Employee Employee1 = new Employee();

    /**
     *@see HttpServlet#HttpServlet()
     */
    public removeEmployee() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent\\pages\\Emp_Del.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		Employee1.setEmp_id(Integer.parseInt(request.getParameter("ID")));
				
		IEmp.removeEmployee(Employee1.Emp_id);
		
		request.setAttribute("Employee1", Employee1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent\\pages\\EmployeeMS.jsp");
		dispatcher.forward(request, response);
	}

}
