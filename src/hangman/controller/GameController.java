package hangman.controller;

import hangman.model.Game;

public class GameController {
	
	
	public static boolean guessedLetterOrWord(String s, Game game){
		if(s.length() == 1) {
			for (int i=0; i<game.word.length(); i++) {
				if(game.word.charAt(i) == s.charAt(0)) {
					game.guessedLetters.add(s);
					return true;
				}
			}
			System.out.println(s);
			game.guessedLetters.add(s);
			scoreReduction(game);
			game.missedLetters.add(s);
			game.life--;
			return false;
		}
		else if(s.length()>1){
			if(game.word.equals(s)) {
				return true;
			}
			else {
				scoreReduction(game);
				game.life--;
				return false;
			}
		}
		return false;
	}
	
	public static void scoreReduction(Game game) {
		if(game.score>40) {
			game.score-=20;
		}
		else {
			game.score-=10;
		}
	}
	
	public static String revealedWord (Game game) {
		String shroudedWord = new String();
		for (int i=0; i<game.word.length(); i++) {
			shroudedWord+="-";
		}
		for (int i=0;i<game.guessedLetters.size(); i++) {
			for (int j=0; j<shroudedWord.length(); j++) {
				if(game.word.charAt(j) == game.guessedLetters.get(i).charAt(0)) {
					shroudedWord.replace('-', game.guessedLetters.get(i).charAt(0));
				}
			}
		}
		return shroudedWord;
	}
}
