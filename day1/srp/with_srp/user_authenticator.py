class UserAuthenticator:
	def authenticate(self, user):
		# Authentication logic
		if user.username == "admin" and user.password == "admin":
			return True
		return False
