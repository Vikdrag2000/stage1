package InternalThreading;

public class Producer extends Thread {

	Product p;
	public Producer(Product p) {
		this.p=p;
	}
	 
	public void run() {
		int i=1;
		while(i<10) {
			p.setValue(i);
			System.out.println("p"+i);
			i++;
		}
	}
}
