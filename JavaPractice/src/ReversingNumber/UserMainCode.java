package ReversingNumber;

public class UserMainCode {

	public static String reverseNumber(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
