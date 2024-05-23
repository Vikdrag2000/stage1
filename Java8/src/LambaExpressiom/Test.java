package LambaExpressiom;

@FunctionalInterface
 interface MyLamda{
	 void display();
}

class Check{
	int temp=10;
	
	void print() {
		int count=3;
		
		MyLamda m = ()-> {
		int a=9;	    // lambda expression can have its own variable
		System.out.println(++a);    
		System.out.println(count);  // Local variable must be final so can't modified even outside
		System.out.print(++temp);	// instance variable can be modified				
		};
		
		m.display();
	}
}

public class Test {

	public static void main(String[] args) {

		Check ch = new Check();
		ch.print();
	}

}
