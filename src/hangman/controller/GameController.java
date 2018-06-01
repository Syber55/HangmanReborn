package hangman.controller;

import hangman.model.Game;

public class GameController {
	
	
	public static boolean guessedLetterOrWord(String s, Game game){
		if(s.length() == 1) {
			for (int i=0; i<game.word.length(); i++) {
				if(game.word.charAt(i) == s.charAt(0)) {
					game.guessedLetters+=s;
					return true;
				}
			}
			game.guessedLetters+=s;
			scoreReduction(game);
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
}
