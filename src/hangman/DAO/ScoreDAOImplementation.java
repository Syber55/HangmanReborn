package hangman.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import hangman.model.Score;

public class ScoreDAOImplementation implements ScoreDAO {

	Connection connection = DBConnection.getConnectionToDatabase();

	@Override
	public void addScoreToDB(String username, int score) throws SQLException {

		String query = "INSERT INTO scores(score, username) VALUES (?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, score);
			statement.setString(2, username);

			statement.executeUpdate();
		}

	}

	@Override
	public ArrayList<Score> topTenScores() throws SQLException {

		ArrayList<Score> topTenScores = new ArrayList<>();

		String query = "SELECT * FROM scores ORDER BY score DESC LIMIT 10;";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				Score score = new Score(rs.getInt("id"), rs.getInt("score"), rs.getString("username"));
				topTenScores.add(score);
			}
		}
		return topTenScores;
	}

	@Override
	public ArrayList<Score> getScores() throws SQLException {

		ArrayList<Score> scores = new ArrayList<>();

		String query = "SELECT * FROM scores";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				Score score = new Score(rs.getInt("id"), rs.getInt("score"), rs.getString("username"));
				scores.add(score);
			}
		}
		return scores;
	}

}
