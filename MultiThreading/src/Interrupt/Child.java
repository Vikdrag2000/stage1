package Interrupt;

public class Child {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.start();
		p.interrupt();
		System.out.println("Call the Run");
	}

}
