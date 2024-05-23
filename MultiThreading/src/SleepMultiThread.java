
public class SleepMultiThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		SleepMultiThread smt = new SleepMultiThread();
		smt.start();
       for(int i=0;i<8;i++) {
    	   System.out.print("j :"+i+"\t");
    	   Thread.sleep(1000);
       }
	}
	public void run() {
		for(int i =0;i<8;i++) {
			System.out.print("i :"+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
