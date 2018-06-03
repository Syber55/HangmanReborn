package hangman.model;
import java.util.ArrayList;
public class Game {
	public String word = "empty";
	public ArrayList<String> missedLetters = new ArrayList<>();
	public ArrayList<String> guessedLetters = new ArrayList<>();
	public int score = 100;
	public int life = 5;
	public ArrayList<String> missedWords = new ArrayList<>();
	public String username;
	public String revealedWord = "-";
	public String guessedLetterString = " ";
	
	
	public ArrayList<String> getMissedLetters() {
		return missedLetters;
	}

	public void setMissedLetters(ArrayList<String> missedLetters) {
		this.missedLetters = missedLetters;
	}

	

	

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public ArrayList<String> getMissedWords() {
		return missedWords;
	}

	public void setMissedWords(ArrayList<String> missedWords) {
		this.missedWords = missedWords;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRevealedWord() {
		return revealedWord;
	}

	public void setRevealedWord(String revealedWord) {
		this.revealedWord = revealedWord;
	}

	


	
	public ArrayList<String> getGuessedLetters() {
		return guessedLetters;
	}

	public void setGuessedLetters(ArrayList<String> guessedLetters) {
		this.guessedLetters = guessedLetters;
	}

	public String getGuessedLetterString() {
		return guessedLetterString;
	}

	public void setGuessedLetterString(String guessedLetterString) {
		this.guessedLetterString = guessedLetterString;
	}

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
