package hangman.controller;

import java.sql.SQLException;

import hangman.DAO.UserDAO;
import hangman.DAO.UserDAOImplementation;
import hangman.model.User;
public class RegistrationController {

	public static int registerUser(String username, String password) throws SQLException {
		//Unese podatke i kreaira novog korisnika, unese ga  u niz korisnika i ubaci ga u bazu
		//Koristi UserDAO addUser metodu
		User user = new User();
		UserDAO ud = new UserDAOImplementation();
		if(!ud.checkIfUnique(username)) {
			return 1;
		}
		
		if(password.length()<8) {
			return 2;
		}
		user.username = username;
		user.password = password;
		ud.addUser(user);
		user.users.add(user);
		return 3;
	}
}
