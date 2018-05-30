package hangman.DAO;

import java.util.ArrayList;

import hangman.model.Word;

public interface WordDAO {

	public static ArrayList<Word> getWords();
	
	public static ArrayList<Word> getWordsByCategory(int id);
}
