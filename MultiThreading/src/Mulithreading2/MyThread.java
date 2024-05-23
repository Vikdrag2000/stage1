package Mulithreading2;

class ThreadTest extends Thread{
	public ThreadTest(String name) {
		super(name);
	}
	public void run() {
		setPriority(Thread.MIN_PRIORITY+7);
		setName("Thread Test");
		int i=1;
		while(i<5) {
			System.out.println("Thread: "+i);
			i++;
			try {                     //Here sleep in try catch not the loop, so looping continue here
				Thread.sleep(1000);   //if the while loop in try catch then it stops at one value
			} catch (InterruptedException e) {
				System.out.println("Interrupt");
			}
		}
	}
}
public class MyThread {

	public static void main(String[] args) throws InterruptedException {
      ThreadTest t = new ThreadTest("My Thread");
      
      t.start();
     // t.join();
      t.interrupt();
      
//      System.out.println("Id: "+t.getId());
//      System.out.println("Name : "+t.getName());      
//      System.out.println("Priority : "+t.getPriority());     
//      System.out.println("State : "+t.getState());
//      System.out.println("Alive : "+t.isAlive());
      
     

	}

}
