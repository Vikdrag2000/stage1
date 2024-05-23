import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int a,b,c;
		try {
			System.out.println("Enter the two integer");
			Scanner sc = new Scanner(System.in);
			a= sc.nextInt();
			b= sc.nextInt();
			c=a/b;
			System.out.println("Result "+c);
		}catch(ArithmeticException e) {
			System.out.println("Please do not enter 0");
		}
			System.out.println("More Code goes on");
	}

}
