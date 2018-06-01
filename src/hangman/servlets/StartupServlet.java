package hangman.servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hangman.DAO.UserDAO;
import hangman.DAO.UserDAOImplementation;

/**
 * Servlet implementation class StartupServlet
 */
@WebServlet("/StartupServlet")
public class StartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StartupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	UserDAO ud = new UserDAOImplementation();
	
	try {
		ud.getUsers();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
