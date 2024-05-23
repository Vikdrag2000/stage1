package Yeild;

public class Parent extends Thread {

	
	public void run() {
		Thread.yield();
		for(int i=0;i<5;i++){
			System.out.println("Parent Yeild");
		}
	}
}
