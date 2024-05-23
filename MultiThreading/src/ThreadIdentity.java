
public class ThreadIdentity extends Thread{

	public static void main(String[] args) {
		ThreadIdentity td = new ThreadIdentity();
		td.start();
		
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Its main part");
		System.out.println("Thread name is: "+currentThread.getName());
		
	}
    public void run() {
    	Thread currentThread = Thread.currentThread();
    	currentThread.setName("Its Print of numbers");
		System.out.println("Thread name is: "+currentThread.getName());
    }
}
