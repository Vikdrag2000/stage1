package FunctionalInterface;

public class Test {


	public static void main(String[] args) {

	A a = new C();
	a.display();
	
	A a2 = ()->System.out.println("Inside A");
	a2.display();
	
	
	Sum s = (int x,int y)-> System.out.println("Sum is:"+(x+y));
	s.sum(20,45);
	}
}
