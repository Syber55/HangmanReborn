package hangman.DAO;

import hangman.model.Category;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CategoryDAO {
	
	public ArrayList<Category> getCategoryArray() throws SQLException;//Povuci kategorije iz baze i ubaci ih u listu
}
