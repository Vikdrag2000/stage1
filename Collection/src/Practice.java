import java.util.*;
public class Practice {

	public static void main(String[] args) {

//		char a = ':';
//		if(a==':') {
//			System.out.print(a);
//		}
		String[] s = {"GA","FZ"};
		String s2 = Collections.min(Arrays.asList(s));
		System.out.println(s2);
		
		Integer[] i = {4,9};
		Integer i2 = Collections.min(Arrays.asList(i));
		System.out.println(i2);
	}

}
