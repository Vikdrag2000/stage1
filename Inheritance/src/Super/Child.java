package Super;

public class Child extends Parent{

	int c,d;
	
	public Child(int a,int b,int c,int d) {
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void display() {
		System.out.print(super.a);
		System.out.print(super.b);
		System.out.print(c);
		System.out.print(d);
	}
	void f1() {
		super.f1();
		System.out.println("Inside Child");
		
	}
}
