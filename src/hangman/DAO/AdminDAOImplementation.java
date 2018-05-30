package hangman.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hangman.DAO.DBConnection;
import hangman.model.User;

public class AdminDAOImplementation implements AdminDAO {

	Connection connection = DBConnection.getConnectionToDatabase();

	@Override
	public void addUser(String username, String password) throws SQLException {

		String query = "INSERT INTO users(username, password) VALUES (?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, username);
			statement.setString(2, password);

			statement.executeUpdate();
		}

	}

	@Override
	public void removeUser(User user) throws SQLException {

		String query = "DELETE FROM users WHERE id = " + user.getUserID();

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.executeUpdate();
		}

	}

	@Override
	public void removeUser(int id) throws SQLException {

		String query = "DELETE FROM users WHERE id = " + id;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.executeUpdate();
		}

	}

	@Override
	public void addCategory(String categoryName) throws SQLException {

		String query = "INSERT INTO categories(category) VALUES (?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, categoryName);

			statement.executeUpdate();
		}

	}

	@Override
	public void removeCategory(String categoryName) throws SQLException {

		String query = "DELETE FROM categories WHERE category = '" + categoryName + "'";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.executeUpdate();
		}
	}

	@Override
	public void removeCategory(int categoryID) throws SQLException {

		String query = "DELETE FROM categories WHERE id = " + categoryID;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.executeUpdate();
		}

	}

	@Override
	public void addWord(String word, int categoryID) throws SQLException {

		String query = "INSERT INTO words(word, categoryID) VALUES (?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, word);
			statement.setInt(2, categoryID);

			statement.executeUpdate();
		}

	}

	@Override
	public void removeWord(String word) throws SQLException {

		String query = "DELETE FROM words WHERE word = '" + word + "'";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.executeUpdate();
		}

	}

}
