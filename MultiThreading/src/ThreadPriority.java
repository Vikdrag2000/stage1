
public class ThreadPriority extends Thread{

	public static void main(String[] args) {
		ThreadPriority tp= new ThreadPriority();	    
		tp.setName("tp");
		tp.setPriority(MIN_PRIORITY);
		tp.start();
		
		
		
		ThreadPriority tp2= new ThreadPriority();
		tp2.setName("tp2");
		tp.setPriority(MAX_PRIORITY);
		tp2.start();
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
