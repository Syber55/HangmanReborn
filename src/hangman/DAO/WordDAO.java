package hangman.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import hangman.model.Word;

public interface WordDAO {

	public ArrayList<Word> getWords() throws SQLException;
	
	public ArrayList<Word> getWordsByCategory(int id) throws SQLException;
}
