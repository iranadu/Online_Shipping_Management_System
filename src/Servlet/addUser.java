package Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import iNterface.IUser;
import iNterface.UserImpl;


/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	IUser IU = new UserImpl();
	User u = new User();

    /**
     * Default constructor. 
     */
    public addUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		

		u.User_Name = request.getParameter("User_Name");
		u. User_Password = request.getParameter("User_Password");
		u.User_Address = request.getParameter("User_Address");
		u.User_id = Integer.parseInt(request.getParameter("User_ID"));
		 
		IU.addUser(u);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("WebContent/index.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
