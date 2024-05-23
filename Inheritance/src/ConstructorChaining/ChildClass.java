package ConstructorChaining;

public class ChildClass extends SuperCalss {

	public ChildClass() {
		this(10);
		System.out.println("Default ChildClass Constrctor");
	}
	public ChildClass(int a) {
		super(a);
		System.out.println("Arugument ChildClass Constrctor");
	}
	
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();	}

}
