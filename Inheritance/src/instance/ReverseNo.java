package instance;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		while(a>0) {
			int c=a%10;
			b=b*10+c;
			a=(a-c)/10;
		}
		System.out.print(b);
	}
}
