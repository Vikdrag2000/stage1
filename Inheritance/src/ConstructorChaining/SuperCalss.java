package ConstructorChaining;

public class SuperCalss {

	public SuperCalss() {
		System.out.println("Super Default Constructor");
	}
	
	public SuperCalss(int a) {
		this();      //it Calls by default Constructor
		System.out.println("Super Argument Constructor");
	}
	
	
}
