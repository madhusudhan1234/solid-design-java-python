class User:
	def __init__(self, username, password):
		self.username = username
		self.password = password

	def get_user_info(self):
		return f"Username: {self.username}"

