import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Pattern2 {

	public static void main(String[] args) {
		boolean n = Pattern.matches("[\\w]+[0-9]", "Hierheriure3");
		System.out.println(n);
	}
}
