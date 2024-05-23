package Shynchronization;

public class Thread1 extends Thread{

	ThreadD td;
	Thread1(ThreadD d){
		td=d;
	}
	public void run() {
		td.display("99999");
	}
}
