package hangman.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import hangman.model.Category;

public class CategoryDAOImplementation implements CategoryDAO{
	
	Connection connection = DBConnection.getConnectionToDatabase();

	@Override
	public ArrayList<Category> getCategoryArray() throws SQLException {
		
		ArrayList<Category> categories = new ArrayList<>();
		
		String query = "SELECT * FROM categories";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				Category category = new Category(rs.getInt("id"), rs.getString("category"));
				categories.add(category);
			}
		}
		return categories;
	}

}
