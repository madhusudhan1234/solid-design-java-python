# In this example, RobotWorker is forced to implement the eat method, which is not relevant to it.
class Worker:
	def work(self):
		pass

	def eat(self):
		pass

class HumanWorker(Worker):
	def work(self):
		print("Human working")

	def eat(self):
		print("Human eating")

class RobotWorker(Worker):
	def work(self):
		print("Robot working")

	def eat(self):
		raise NotImplementedError("Robots don't eat")