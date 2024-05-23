package Mulithreading2;

public class Daemon extends Thread{
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
      Daemon d = new Daemon();
     d.setDaemon(true);
      d.start();
      try {
		d.join();      // here till join is there code is goes on until run method finishes
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//      try {
//    	  Thread.sleep(10);
//      }catch(Exception e) {}
	}

}
