public class ModuleA {
	private ModuleInterface interfaceInstance;

	public ModuleA(ModuleInterface interfaceInstance) {
		this.interfaceInstance = interfaceInstance;
	}

	public void myMethod() {
		this.interfaceInstance.doSomething();
		System.out.println("hello from module a");
	}
}

