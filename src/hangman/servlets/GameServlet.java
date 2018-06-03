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

import hangman.DAO.ScoreDAO;
import hangman.DAO.ScoreDAOImplementation;
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
		
		String letter = request.getParameter("guessWord");
		ScoreDAO sd = new ScoreDAOImplementation();
		
		Game game = (Game)session.getAttribute("game");
		System.out.println(game.score);
		System.out.println(game.word);
		System.out.println(letter);
		if(game.score == 30) {
			RequestDispatcher rd = request.getRequestDispatcher("Loss.jsp");
			rd.forward(request, response);
		} 
		else if(game.word.equals(letter)) {
			try {
				sd.addScoreToDB(game.username, game.score);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("Won.jsp");
			rd.forward(request, response);
		}
		else if(game.word.equals(game.revealedWord)) {
			try {
				sd.addScoreToDB(game.username, game.score);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("Won.jsp");
			rd.forward(request, response);
		}
		
		else {
		GameController.guessedLetterOrWord(letter, game);
		request.setAttribute("game", game);
		RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
		rd.forward(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		Game game = (Game)request.getAttribute("game");
		String url = "WebContent/game.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
	}

}
