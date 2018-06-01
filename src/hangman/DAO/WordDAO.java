package hangman.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import hangman.model.Word;

public interface WordDAO {

	public void loadWords() throws SQLException;
	
	public ArrayList<Word> getWordsByCategory(int id) throws SQLException;
}
