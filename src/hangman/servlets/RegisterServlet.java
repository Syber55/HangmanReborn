package hangman.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hangman.controller.RegistrationController;
import hangman.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegisterServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		User user = new User();
		RegistrationController rc = new RegistrationController();
		int responseNum = 0;
		try {
			responseNum = RegistrationController.registerUser(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(responseNum == 3) {
			System.out.println("User successfully registered");
			
			request.setAttribute("user", username);
			RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
			rd.forward(request, response);
		}
	}

}
