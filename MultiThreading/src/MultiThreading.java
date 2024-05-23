
public class MultiThreading extends Thread{

	public static void main(String[] args) {
		MultiThreading mt = new MultiThreading();
		mt.start();
		for(int j =0;j<20;j++) {
			System.out.print("j:"+j+"\t");
		}
	}
	public void run() {
		for(int i =0;i<20;i++) {
			System.out.print("i:"+i+"\t");
		}
	}

}
