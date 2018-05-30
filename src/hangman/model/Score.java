package hangman.model;

public class Score {
 int scoreID;
 int score;
 String username;
 
 public Score() {
 }

public Score(int scoreID, int score, String username) {
	this.scoreID = scoreID;
	this.score = score;
	this.username = username;
}



public int getScoreID() {
	return scoreID;
}

public void setScoreID(int scoreID) {
	this.scoreID = scoreID;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
 
 
}
