package CollectionsPart;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {

		String[] s = {"L","F","J"};
		List<String> list = Arrays.asList(s);// Here array converted to list
		
	    System.out.println(list);	
	    s[1] = "O";
	    System.out.println(list);	
	    list.set(0, "p");
	    System.out.println(list);
	    for(String i: s) {
	    	 System.out.println(i);
	    }
	}

}
