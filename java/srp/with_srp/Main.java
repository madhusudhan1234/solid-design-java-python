public class Main {
	public static void main(String[] args) {
		User user = new User("admin", "admin1");
		UserAuthenticator authenticator = new UserAuthenticator();

		if (authenticator.authenticate(user)) {
			System.out.println("Authenticated");
		} else {
			System.out.println("Authentication failed");
		}

		System.out.println(user.getUserInfo());
	}
}