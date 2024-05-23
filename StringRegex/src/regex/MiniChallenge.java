package regex;
import java.util.Scanner;
public class MiniChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		String r="[A-Z][a-z0-9]{3,}[@][0-9]{3}[.]";
		String st = sc.nextLine();
		System.out.print(st.matches(r));
	}

}
