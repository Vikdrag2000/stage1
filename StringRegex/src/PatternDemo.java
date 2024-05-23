import java.util.regex.Pattern;
import java .util.regex.Matcher;
import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		Pattern pt = Pattern.compile("[a-zA-Z0-9\s-]+");
		Matcher mh = pt.matcher("aabDHUIWE784746 oeb-cc");
		System.out.println(mh.matches());
		Pattern pt2 = Pattern.compile("Cat|Dog|Fish",Pattern.CASE_INSENSITIVE);
		Matcher mh2 = pt2.matcher("dog");
		System.out.println(mh2.matches());
		Pattern pt3 = Pattern.compile("^Dog",Pattern.CASE_INSENSITIVE);
		Matcher mh3 = pt2.matcher("dog");
		System.out.println(mh3.matches());
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String s2 = s.replaceAll("[^a-z\s]","1");
//		System.out.println(s2);
	}
}
