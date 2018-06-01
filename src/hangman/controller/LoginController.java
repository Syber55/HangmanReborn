package hangman.controller;

public class LoginController {

	public static boolean isUsernameAndPasswordCorrect(String username, String password) {
		//Povlači arraylistu iz user klase i provjerava da li korisnik postoji, ako postoji onda provjerava da li je šifra uredu
		 
		ArrayList<User> users = new ArrayList<>();

		if (users.contains(username)) {
			if (password.length() > 8) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isUpperCase(password.charAt(i)))
						if (Character.isDigit(password.charAt(i)))

							System.out.println("User found");
				}
			}
		} else {
			System.out.println("User not found");
		}
	return false;
	}
}
