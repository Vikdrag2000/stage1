package InternalThreading;

public class Test {

	public static void main(String[] args) {

		Product p = new Product();
		Producer p1 = new Producer(p);
		Consumer c = new Consumer(p);
		
		p1.start();
		c.start();
	}

}
