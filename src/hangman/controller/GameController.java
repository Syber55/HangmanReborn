package hangman.controller;

import hangman.model.Game;

public class GameController {
	
	
	public static boolean guessedLetterOrWord(String s, Game game){
		if(s.length() == 1) {
			boolean bool = false;
			for (int i=0; i<game.guessedLetters.size(); i++) {
				if (game.guessedLetters.get(i) == s) {
					bool = true;
					break;
				}
			}
			for (int i=0; i<game.word.length(); i++) {
				if(game.word.charAt(i) == s.charAt(0)) {
					if(!bool) {game.guessedLetters.add(s);
					game.guessedLetterString+=s;}
					System.out.println(revealedWord(game));
					return true;

				}
			}
			System.out.println(s);
			
			if (!bool) {
			game.guessedLetters.add(s);
			game.guessedLetterString+=s;
			scoreReduction(game);
			game.missedLetters.add(s);
			game.life--;}
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
	
	/*public static String revealedWord (Game game) {
		String shroudedWord = new String();
		boolean bool = false;
		for (int i=0;i<game.word.length(); i++) {
			for (int j=0; j<game.guessedLetters.size(); j++) {
				if(game.word.charAt(i) == game.guessedLetters.get(j).charAt(0)) {
					shroudedWord+=game.guessedLetters.get(j).charAt(0);
					bool = true;
					break;
				}
				
			}
			if(bool = false) {
				shroudedWord+="-";
			}
		}
		System.out.println(shroudedWord);
		game.revealedWord = shroudedWord;
		return shroudedWord;
	}*/
	
	public static String revealedWord(Game game) {
		char[] charNiz = toCharNiz(game);
		for (int i=0; i<charNiz.length; i++) {
			for (int j=0; j<game.guessedLetters.size(); j++) {
				if (game.word.charAt(i) == game.guessedLetters.get(j).charAt(0)) {
					charNiz[i] = game.guessedLetters.get(j).charAt(0);
				}
			}
		}
		String output = "";
		for (int i=0; i<game.word.length(); i++) {
			output+=charNiz[i];
		}
		game.revealedWord = output;
		return output;
	}
	
	public static char[] toCharNiz(Game game) {
		char[] charniz = new char[game.word.length()];
		for (int i=0; i<game.word.length(); i++) {
			charniz[i] +='-';
		}
		return charniz;
		}
}
