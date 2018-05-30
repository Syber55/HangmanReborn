package hangman.DAO;

import hangman.model.Score;

public interface ScoreDAO {

	public static void addScoreToDB(Score score);//Slu�it �e za dodavanje novog skora u bazu
	
	public static ArrayList<Score> topTenScores();//Top 10 bodovanja, vra�a score objekte u niz
	
	public static ArrayList<Score> getScores();//Vra�a sva bodovanja u tabeli
}
