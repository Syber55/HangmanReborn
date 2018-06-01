package hangman.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hangman.model.User;

public class UserDAOImplementation implements UserDAO {

	Connection connection = DBConnection.getConnectionToDatabase();

	@Override
	public void addUser(User user) throws SQLException {

		String query = "INSERT INTO users(username, password) VALUES (?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			statement.executeUpdate();
		}

	}

	public void loadUsers() throws SQLException {


		String query = "SELECT * FROM users";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				user.users.add(user);
			}
		}
	}

}
