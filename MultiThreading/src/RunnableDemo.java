
public class RunnableDemo implements Runnable {  //here we can use multiple interface 

	@Override
	public void run() {

		System.out.println("Runnable");
	}

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t= new Thread(rd);  // passing runnable object to thread
		
		t.start();
		
	}

}
