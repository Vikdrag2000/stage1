import java.util.*;

public class demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		int left_time= 240-b;
		 //System.out.println(left_time);
		int c=5;
		int count=0;
		for(int i=1;i<=a;i++) {
			int time = i*c;
			if(time<=left_time) {
				left_time-=time;
				count++;
			//	 System.out.println(left_time);
			}
			
		}
		
      System.out.println(count);
				
	}
}
