package Interrupt;

public class Parent extends Thread{

	@Override
	public void run() {
	
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Lazy boy");
				Thread.sleep(1000);
			}
				
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
//		
	}
}
