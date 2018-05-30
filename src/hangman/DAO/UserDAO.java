package hangman.DAO;

import hangman.model.User;

public interface UserDAO {

	public static void addUser (User user); //Dodaje korisnika u bazu
	
	public static ArrayList<User> getUsers();//Vraæa sve korisnike iz baze u niz
}
