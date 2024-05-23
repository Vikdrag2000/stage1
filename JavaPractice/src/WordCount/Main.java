package WordCount;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String arr[] = new String[a];
		for(int i=0;i<a;i++) {
			arr[i]= sc.next();
		}
		int b=sc.nextInt();

		if(b<0) {
			System.exit(0);
		}
		System.out.println(UserMainCode.wordCount(arr, b));
	}

}
