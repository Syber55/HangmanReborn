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
		
		if (password.length() < 8) {
			return false;

		} else {
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) 
				if (Character.isDigit(password.charAt(i)))

			return true;
		}

	}
	
	public static void addUser(String username, String password) {
		//Kreira user objekat i dodjeljuje mu korisnièko ime i šifru
	}
	
	//kasnije æemo ubacit filtraciju protiv sql injection
}
