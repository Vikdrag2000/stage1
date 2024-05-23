package instance;
import java.util.Scanner;


public class ArmStrongNo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 if(a==check(a)) {
			 System.out.print("Yes its arms Strong number");
		 }
		 else {
			 System.out.print("No its arms Strong number");
		 }
		 
	}
	
	public static int check(int b) {
		String str = Integer.toString(b);
		int c = 0;
		for(int i=0;i<str.length();i++) {
	     c+=Math.pow(Integer.parseInt(str.substring(i,i+1)),3);
	     System.out.println(c);
		}
		
		return c;
	}
}
