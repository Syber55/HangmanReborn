package hangman.DAO;

import hangman.model.Category;

import java.util.ArrayList;

public interface CategoryDAO {
	
	public static ArrayList<Category> getCategoryArray();//Povuci kategorije iz baze i ubaci ih u listu
}
