package ReversingNumber;
import java.util.Scanner;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = Integer.toString(a);
	      a = Integer.parseInt(UserMainCode.reverseNumber(str));
	     System.out.println(a);
	}

}
