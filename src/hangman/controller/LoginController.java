package hangman.controller;

import java.util.ArrayList;

import hangman.model.User;

public class LoginController {

	public static  boolean isUsernameAndPasswordCorrect(String username, String password) {
		User user = new User();
		for (int i=0; i<user.users.size(); i++) {
			if(username.equals(user.users.get(i).username)) {
				if(password.equals(user.users.get(i).password)) {
					return true;
				}
			}
		}
		return false;
	}
}
