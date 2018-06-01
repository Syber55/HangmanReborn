package hangman.model;
import java.util.ArrayList;
public class Game {
	public String word = "empty";
	public ArrayList<String> missedLetters = new ArrayList<>();
	public ArrayList<String> guessedLetters = new ArrayList<>();
	public int score = 100;
	public int life = 5;
	public ArrayList<String> missedWords = new ArrayList<>();
	
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
	
	public void addToGuessedLetters(String s) {
		guessedLetters.add(s);
	}
	
	
}
