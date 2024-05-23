

public class StringAPI {

	public static void main(String[] args) {

		String s = "  Vikash\nhu";
		System.out.println(s.indent(4));
		System.out.println(s.indent(-4));		
		
		String s2 = "20";
		System.out.println(s2.transform(Integer::parseInt)+20);
				
	}

}
