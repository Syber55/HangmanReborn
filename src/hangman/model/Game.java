package hangman.model;

public class Game {
	String word;
	String missedLetters;
	String guessedLetters;
	int score = 100;
	
	public Game() {}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMissedLetters() {
		return missedLetters;
	}

	public void setMissedLetters(String missedLetters) {
		this.missedLetters = missedLetters;
	}

	public String getGuessedLetters() {
		return guessedLetters;
	}

	public void setGuessedLetters(String guessedLetters) {
		this.guessedLetters = guessedLetters;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
