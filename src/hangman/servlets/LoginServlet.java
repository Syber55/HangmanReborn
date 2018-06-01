package hangman.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hangman.model.User;
import hangman.controller.LoginController;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		
		
		LoginController lc = new LoginController();
		
		@SuppressWarnings("static-access")
		boolean userValidate = lc.isUsernameAndPasswordCorrect(username, password);
		
		

		if(submitType.equals("PLAY") && userValidate == true) {
			request.setAttribute("user", user.getUsername());
			 RequestDispatcher rd =request.getRequestDispatcher("game.jsp");  
	            rd.forward(request, response);  
		}
	}
	
	@Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }  

}
