public class Main {
	public static void main(String[] args) {
		ModuleB moduleBInstance = new ModuleB();
		ModuleA moduleAInstance = new ModuleA(moduleBInstance);
		moduleAInstance.myMethod();

		ModuleX moduleXInstance = new ModuleX();
		ModuleA moduleAInstanceWithX = new ModuleA(moduleXInstance);
		moduleAInstanceWithX.myMethod();
	}
}