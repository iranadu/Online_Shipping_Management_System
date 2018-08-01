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
 * Servlet implementation class editEmployee
 */
@WebServlet("/editEmployee")
public class editEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 IEmployee IEmp = new IEmployeeImpl();
	 Employee Employee1 = new Employee();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public editEmployee() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		Employee1.setEmp_id(Integer.parseInt(request.getParameter("ID")));
		Employee1.setEmp_Name(request.getParameter("name"));
		Employee1.setEmp_Address(request.getParameter("add"));
		Employee1.setEmp_Telephone(Integer.parseInt(request.getParameter("tel")));
		Employee1.setEmp_Salary(Integer.parseInt(request.getParameter("sal")));
		
		IEmp.editEmployee(Employee1.Emp_id,Employee1);
		
		request.setAttribute("Employee1", Employee1);
		

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent\\EmployeeMS.jsp");
		dispatcher.forward(request, response);
	}

}
