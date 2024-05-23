package CollectionsPart;

import java.util.*;

public class SortedListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Z");
		list.add("K");list.add("U");list.add("A");
		
		System.out.println("Before Sort:"+list);
		Collections.sort(list);                // Alphabetical sorting
		System.out.println("After Sort:"+list);
		
		int index =Collections.binarySearch(list, "L");   // Finding index for particular Element
		System.out.println(index);
		
		Collections.reverse(list); // Reverse the sorted list
		System.out.println("After Reverse:"+list);
	}

}
