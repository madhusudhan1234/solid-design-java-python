from module_a import ModuleA
from module_b import ModuleB
from module_x import ModuleX

def main():
	module_b_instance = ModuleB()
	module_a_instance = ModuleA(module_b_instance)
	module_a_instance.my_method()

	module_x_instance = ModuleX()
	module_a_instance_with_x = ModuleA(module_x_instance)
	module_a_instance_with_x.my_method()

if __name__ == "__main__":
	main()