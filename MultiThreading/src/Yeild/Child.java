package Yeild;

public class Child {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Yeild");
		}
	}

}
