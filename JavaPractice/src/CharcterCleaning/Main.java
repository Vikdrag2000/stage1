package CharcterCleaning;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = sc.next().charAt(0);
     System.out.println(UserMainCode.removeCharacter(s,c));
	}

}
