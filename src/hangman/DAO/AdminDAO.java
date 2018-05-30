package hangman.DAO;

import java.sql.SQLException;

import hangman.model.User;

public interface AdminDAO {

	public void addUser(String username, String password) throws SQLException ;
	
	public void removeUser(User user) throws SQLException ;
	
	public void removeUser(int id) throws SQLException ;
	
	public void addCategory(String categoryName) throws SQLException ;
	
	public void removeCategory(String categoryName) throws SQLException ;
	
	public void removeCategory(int categoryID) throws SQLException ;
	
	public void addWord(String word, int categoryID) throws SQLException ;
	
	public void removeWord(String word) throws SQLException ;
}
