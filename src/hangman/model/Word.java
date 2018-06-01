package hangman.model;

import java.util.ArrayList;

public class Word {
	int wordID;
	String word;
	int categoryID;
	public ArrayList<Word> words = new ArrayList<>();
	
	public Word() {
		
	}
	
	public Word(int wordID, String word, int categoryID) {
		this.wordID = wordID;
		this.word = word;
		this.categoryID = categoryID;
	}

	public int getWordID() {
		return wordID;
	}

	public void setWordID(int wordID) {
		this.wordID = wordID;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}
	
	
}
