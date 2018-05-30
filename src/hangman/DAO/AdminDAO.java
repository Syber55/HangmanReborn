package hangman.DAO;

import hangman.model.User;

public interface AdminDAO {

	public void addUser(String username, String password);
	
	public void removeUser(User user);
	
	public void removeUser(int id);
	
	public void addCategory(String categoryName);
	
	public void removeCategory(String categoryName);
	
	public void removeCategory(int categoryID);
	
	public void addWord(String word);
	
	public void removeWord(String word);
}
