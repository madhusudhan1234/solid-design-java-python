class User:
	def __init__(self, username, password):
		self.username = username
		self.password = password

	def authenticate(self):
		# Authentication logic
		if self.username == "admin" and self.password == "admin":
			return True
		return False

	def get_user_info(self):
		return f"Username: {self.username}"