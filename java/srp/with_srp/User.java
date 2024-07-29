public class User {
	private String username;
	private String password;

	// Constructor
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Method to get user info
	public String getUserInfo() {
		return "Username: " + this.username;
	}
}
