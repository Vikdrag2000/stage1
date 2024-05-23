package LengthOfWord;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String sent = sc.nextLine();
		int a =UsermainCode.compareLastWord(sent);
		System.out.println(a);
	}

}
