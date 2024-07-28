# import User and UserAuthenticator from user.py
from user import User
from user_authenticator import UserAuthenticator

user = User("admin", "admin1")
authenticator = UserAuthenticator()

if authenticator.authenticate(user):
	print("Authenticated")
else:
	print("Authentication failed")

print(user.get_user_info())