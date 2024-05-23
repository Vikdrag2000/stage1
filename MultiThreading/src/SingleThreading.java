
public class SingleThreading {

	public static void main(String[] args) {

		SingleThreading st = new SingleThreading();
		st.run();
		for(int j =0;j<20;j++) {
			System.out.println("j:"+j+"\t");
		}
	}
	public void run() {
		for(int i =0;i<20;i++) {
			System.out.println("i:"+i+"\t");
		}
	}

}
