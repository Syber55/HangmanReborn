package hangman.controller;

import hangman.*;

public class UserController {
	
	public static boolean isUniqueUsername(String username) {
		//Provjerava da li je korisni�ko ime jedinstveno
		//Povla�i ArrayList-u iz user klase i prolazi kroz svakog korisnika
		return false;
	}
	
	public static boolean isPasswordStrong(String password) {
		//Provjerava da li je �ifra dovoljno jaka(mora imati barem 8 karaktera)
		return false;
	}
	
	public static void addUser(String username, String password) {
		//Kreira user objekat i dodjeljuje mu korisni�ko ime i �ifru
	}
	
	//kasnije �emo ubacit filtraciju protiv sql injection
}
