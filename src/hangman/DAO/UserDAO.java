package hangman.DAO;

import java.sql.SQLException;

import hangman.model.User;

public interface UserDAO {

	public void addUser (User user) throws SQLException; //Dodaje korisnika u bazu
	
	public void loadUsers() throws SQLException;//Vraæa sve korisnike iz baze u niz
}
