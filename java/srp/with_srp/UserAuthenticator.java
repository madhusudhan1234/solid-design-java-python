public class UserAuthenticator {
	public boolean authenticate(User user) {
		// Authentication logic
		if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
			return true;
		}
		return false;
	}
}
