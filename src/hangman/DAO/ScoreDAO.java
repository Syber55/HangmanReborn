package hangman.DAO;

import hangman.model.Score;

public interface ScoreDAO {

	public static void addScoreToDB(Score score);//Služit æe za dodavanje novog skora u bazu
	
	public static ArrayList<Score> topTenScores();//Top 10 bodovanja, vraæa score objekte u niz
	
	public static ArrayList<Score> getScores();//Vraæa sva bodovanja u tabeli
}
