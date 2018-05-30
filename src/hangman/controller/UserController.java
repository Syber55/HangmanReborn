package hangman.controller;

import hangman.*;

public class UserController {
	
	public static boolean isUniqueUsername(String username) {
		//Provjerava da li je korisnièko ime jedinstveno
		//Povlaèi ArrayList-u iz user klase i prolazi kroz svakog korisnika
		return false;
	}
	
	public static boolean isPasswordStrong(String password) {
		//Provjerava da li je šifra dovoljno jaka(mora imati barem 8 karaktera)
		return false;
	}
	
	public static void addUser(String username, String password) {
		//Kreira user objekat i dodjeljuje mu korisnièko ime i šifru
	}
	
	//kasnije æemo ubacit filtraciju protiv sql injection
}
