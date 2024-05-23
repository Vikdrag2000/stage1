import java.util.*;

public class JoinDemo extends Thread{
    static int a,sum=0;
	
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First n number");
        System.out.println("Enter value");
        a=sc.nextInt();
	
        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();   // its makes complete execution of start then it go further
        
        System.out.println("Sum of first "+a+" natural no is: "+sum);
        Long end = System.currentTimeMillis();
        System.out.println("Tota time is "+(end-start)/1000+" sec.");
	}
	public void run() {
		for(int i =1;i<=a;i++) {
			sum+=i;
			System.out.println(sum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
