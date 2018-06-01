package hangman.model;

public class Game {
	public String word;
	public String missedLetters;
	public String guessedLetters;
	public int score = 100;
	public int life = 5;
	
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
