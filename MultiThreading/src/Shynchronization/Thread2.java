package Shynchronization;

public class Thread2 extends Thread{

	ThreadD td;
	public Thread2(ThreadD d){
		this.td=d;
	}
	public void run() {
		td.display("Vikash");
	}
}
