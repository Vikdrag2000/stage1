package ScannerPractice;
import java.util.Scanner;
public class HasNextPart {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Number:");
		while(sc.hasNextInt()) {      //Doubt?
			int a = sc.nextInt();
			sum+=a;
		}
		System.out.println("Sum:"+sum);

	}

}
