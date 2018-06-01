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

import hangman.DAO.WordDAO;
import hangman.DAO.WordDAOImplementation;
import hangman.controller.GameController;
import hangman.model.Game;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// String UserGuess = req.getParameter("UserGuess").toUpperCase();
		String enteredLetter = request.getParameter("guessWord");

		

		String Message = "";

		String guessLetter = enteredLetter;
		Game game = new Game();
		WordDAO wd = new WordDAOImplementation();
		if(game.word == "empty") {
		try {
			game.word = wd.getRandomWord();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		GameController gc = new GameController();
		if(game.life == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		if(GameController.guessedLetterOrWord(guessLetter, game)) {
			System.out.println(GameController.revealedWord(game));
			RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
			rd.forward(request, response);
		}

	
	}

}
