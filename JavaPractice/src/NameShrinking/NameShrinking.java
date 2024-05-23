package NameShrinking;
import java.util.*;

public class NameShrinking {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   System.out.println(Code.fromat(str));
		
	}

}
class Code{
	public static String fromat(String s) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st= new StringTokenizer(s);
		String str[] = new String[3];
		int a=0;
		while(st.hasMoreTokens()) {
			str[a]=st.nextToken();
			a++;
		}
		sb.append(str[2]).append(" ");
		sb.append(str[1].charAt(0)).append(".");
		sb.append(str[0].charAt(0));
		return sb.toString();
	}
}
