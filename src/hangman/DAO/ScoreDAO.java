package hangman.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import hangman.model.Score;

public interface ScoreDAO {

	public void addScoreToDB(Score score) throws SQLException;//Služit æe za dodavanje novog skora u bazu
	
	public ArrayList<Score> topTenScores() throws SQLException;//Top 10 bodovanja, vraæa score objekte u niz
	
	public ArrayList<Score> getScores() throws SQLException;//Vraæa sva bodovanja u tabeli
}
