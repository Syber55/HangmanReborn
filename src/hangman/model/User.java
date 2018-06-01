package hangman.model;
import java.util.ArrayList;

public class User {
	public int userID;
	public String username;
	public String password;
	public ArrayList<User> users = new ArrayList<>();
	
	public User() {
	}
	
	public User(int userID, String username, String password) {
		this.userID = userID;
		this.username = username;
		this.password = password;
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
}
