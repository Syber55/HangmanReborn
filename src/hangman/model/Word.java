package hangman.model;

import java.util.ArrayList;

public class Word {
	String word;
	int categoryID;
	ArrayList<Word> words = new ArrayList<>();
	
	public Word() {}

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
