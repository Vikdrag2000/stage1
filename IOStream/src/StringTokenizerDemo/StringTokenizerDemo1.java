package StringTokenizerDemo;
import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

	public static void main(String[] args) {

		String s = "Moon and sun are very much apart from us";
		StringTokenizer st = new StringTokenizer(s," ",true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
