package InternalThreading;

public class Consumer extends Thread{

	Product p;
	public Consumer(Product p) {
		this.p=p;
	}
	
	public void run() {
		int i=1;
		while(i<10) {
			System.out.println("c:"+p.getValue());
			i++;
		}
	}
}
