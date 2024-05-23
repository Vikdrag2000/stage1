package MaxSubsString;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		String wd = sc.next();
		String ch = sc.next();
		String o =UserMainCode.extractMax(wd,ch);
		System.out.println(o);
	}

}
