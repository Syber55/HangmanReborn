package hangman.model;
import java.util.ArrayList;
public class Game {
	public String word;
	public ArrayList<String> missedLetters;
	public ArrayList<String> guessedLetters;
	public int score = 100;
	public int life = 5;
	public ArrayList<String> missedWords;
	
	public Game() {}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
