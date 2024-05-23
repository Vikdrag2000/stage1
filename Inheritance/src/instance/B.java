package instance;

public class B {

	C a;
	
	public B() {
		a= new C();
	}
	public void main2() {
		a.mul();
	}
	public static void main(String[] args) {
		B b = new B();
		b.main2();
	}
}
