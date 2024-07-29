public class User {
  private String username;
  private String password;

  // Constructor
  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Authentication method
  public boolean authenticate() {
    // Authentication logic
    if ("admin".equals(this.username) && "admin".equals(this.password)) {
      return true;
    }
    return false;
  }

  // Method to get user info
  public String getUserInfo() {
    return "Username: " + this.username;
  }
}