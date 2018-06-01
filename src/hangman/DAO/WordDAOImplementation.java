package hangman.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import hangman.model.Word;

public class WordDAOImplementation implements WordDAO {

	Connection connection = DBConnection.getConnectionToDatabase();

	@Override
	public void loadWords() throws SQLException {

	
		String query = "SELECT * FROM words";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				Word word = new Word(rs.getInt("id"), rs.getString("word"), rs.getInt("categoryID"));
				word.words.add(word);
			}
		}
		
	}

	@Override
	public ArrayList<Word> getWordsByCategory(int id) throws SQLException {

		ArrayList<Word> words = new ArrayList<>();

		String query = "SELECT * FROM words WHERE categoryID = " + id;

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				Word word = new Word(rs.getInt("id"), rs.getString("word"), rs.getInt("categoryID"));
				words.add(word);
			}
		}
		return words;

	}
	
	public String getRandomWord() throws SQLException{
		ArrayList<String> words = new ArrayList<>();
		
		String query = "SELECT word FROM words";
		
		ResultSet rs = null;
		
		try (Statement statement = connection.createStatement();){
			rs=statement.executeQuery(query);
			
			while(rs.next()) {
				words.add(rs.getString("word"));
			}
		}
		Random random = new Random();
		int rand = random.nextInt(words.size());
		return words.get(rand);
	}
}
