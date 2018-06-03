package hangman.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hangman.model.Game;
import hangman.model.User;
import hangman.DAO.UserDAO;
import hangman.DAO.UserDAOImplementation;
import hangman.DAO.WordDAO;
import hangman.DAO.WordDAOImplementation;
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
		UserDAO ud = new UserDAOImplementation();
		Game game = new Game();
		WordDAO wd = new WordDAOImplementation();
		try {
			game.word = wd.getRandomWord();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		@SuppressWarnings("static-access")
		boolean userValidate = false;
		try {
			userValidate = ud.checkUserAndPassword(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();

		if(submitType.equals("PLAY") && userValidate == true) {
			game.username = username;
			game.revealedWord = " ";
			request.setAttribute("user", user.getUsername());
			 RequestDispatcher rd =request.getRequestDispatcher("game.jsp");  
	            session.setAttribute("user", user);
	            session.setAttribute("game", game);
	            rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
	}
	
	@Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }  

}
