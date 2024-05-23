package UniqueNumber;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc .nextInt();
		if(UserMainCode.getUnique(a)==1) {
			System.out.print("Unique");
		}else {
			System.out.print("Not Unique");
		}
	}

}
