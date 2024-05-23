package ValidateTime;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int a = UserMainCode.validateTime(s);
		if(a==-1) {
			System.out.println("Invalid time");
		}
		else {
			System.out.println("Valid time");
		}
	}

}
