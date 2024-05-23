package Set;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rn = new Random();
		
		int x = rn.nextInt();
		System.out.println("Val:"+x);
		
		int y = rn.nextInt(100);
		System.out.println("Val:"+y);
		
	}
}
