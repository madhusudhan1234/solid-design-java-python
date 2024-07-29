from module_interface import ModuleInterface

class ModuleA:
	def __init__(self, interface_instance: ModuleInterface = None):
		self.interface_instance = interface_instance

	def my_method(self):
		self.interface_instance.do_something()
		print("hello from module a")