
public class ReverseString {

	public static String reverse(String a) {
		String reverse="";
		for(int i=a.length();i>0;i--) {
			reverse=reverse+a.charAt(i-1);
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Vikash";
        System.out.println(reverse(a));
	}

}
